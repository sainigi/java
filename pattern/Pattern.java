

package pattern;

/**
 * Pattern
 */
public class Pattern {
    public static void main(String[] args) {
        // hollowRectangle(4, 5);
        // invertedAndRotatedHalfPyramid(7, 7);
        invertedAndRotatedHalfPyramidWithNumber(5);
    }

    public static void hollowRectangle(int totalRows, int totalCols){
        //outer-loop
        for(int i=1; i<=totalRows;i++){
            //inner-loop
            for(int j=1; j<=totalCols;j++){
                //boundary conditions
                if(i==1 || i==totalRows || j==1 || j==totalCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPyramid(int totalRows, int totalCols){
        //outer-loop
        for(int i=1; i<=totalRows; i++){
            //inner-loop
            for(int j=1; j<=totalCols; j++){
                if(j > totalCols-i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPyramidWithNumber(int totalRows){
        int totalCols = totalRows;
        for(int i=1;i<=totalRows; i++){
            for(int j=1;j<=totalCols;j++){
                if(j <= totalCols-i+1){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}