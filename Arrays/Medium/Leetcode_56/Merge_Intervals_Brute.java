class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        //Sort by first column
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        int i = 0;

        while(i<n){
            int S = intervals[i][0];
            int E = intervals[i][1];
            int j = i + 1;

            while(j<n && intervals[j][0]<=E){
                E = Math.max(E, intervals[j][1]);
                j++;
            }

            list.add(new int[]{S,E});

            i=j;
        }

        return list.toArray(new int[list.size()][]);
    }
}
