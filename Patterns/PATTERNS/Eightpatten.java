package PATTERNS;
public class Eightpatten{
    public static void main(String[] args) {
        for(int i =0;i<=8;i++){
            for(int j =0;j<=8;j++){
                if(i==0||i==4||i==8||j==0||j==8){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    
    }
}
/*
    Eight Pattern
    * * * * * * * *
    *             *
    *             *
    *             *
    * * * * * * * *
    *             *
    *             *
    *             *
    * * * * * * * *
 */