

package pattern;

/**
 * Pattern
 */
public class Pattern {

    public static void main(String[] args) {
        hollowRectangle(4, 5);
        
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
}