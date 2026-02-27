class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int n = numRows;

        List<List<Integer>> grid = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        grid.add(first);

        for(int r=2; r<=n; r++){
            List<Integer> list = new ArrayList<>();

            list.add(1);

            if(r!=2){
                for(int c=1; c<r-1; c++){
                    int sum = grid.get(r-2).get(c-1) + grid.get(r-2).get(c);
                    list.add(sum);
                }
            }

            list.add(1);

            grid.add(list);
        }

        return grid;

    }
}
