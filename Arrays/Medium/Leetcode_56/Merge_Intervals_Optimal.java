class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        for(int i=0; i<n; i++){

            int Li = list.size()-1;

            int S = intervals[i][0];
            int E = intervals[i][1];

            if(list.isEmpty() || list.get(Li)[1]<S){
                list.add(new int[]{S,E});
            }

            else{
                int[] Last = list.get(Li);
                Last[1] = Math.max(Last[1], E);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
