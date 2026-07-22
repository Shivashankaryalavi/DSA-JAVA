package DsaSheet;
import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {

    public List<List<Integer>> generate(int numRows){
      
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> previousRow= triangle.get(i-1);
                    row.add(previousRow.get(j-1)+previousRow.get(j));

                }
            }
            triangle.add(row);

        }


        return triangle;


    }
    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(5);
        for(List<Integer> row : result){
            // System.out.println(row +" ");
            for(Integer num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}