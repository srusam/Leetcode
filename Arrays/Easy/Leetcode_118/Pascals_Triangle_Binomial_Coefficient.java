class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int n = numRows;

        List<List<Integer>> grid = new ArrayList<>();

        for(int r=0; r<n; r++){

            List<Integer> list = new ArrayList<>();
            int val = 1;

            for(int c=0; c<=r; c++){

                list.add(val);
                val = val*(r-c)/(c+1);

            }

            grid.add(list);
        }

        return grid;
    }
}
