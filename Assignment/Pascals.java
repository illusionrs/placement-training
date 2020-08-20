import java.util.*;


class Pascals{

    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
    List<Integer> row, pre = null;
    for (int i = 0; i < numRows; i++) {
        row = new ArrayList<>();
        for (int j = 0; j <= i; j++)
            row.add(j == 0 || i == j ? 1 : pre.get(j-1) + pre.get(j));
        res.add(pre = row);
    }
    return res;
        
    }
}