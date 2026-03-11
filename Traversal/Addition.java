package Traversal;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row and column size for m1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        System.out.println("Enter a row and column size of m1");
        int r2=sc.nextInt();
        int c2 = sc.nextInt();
        int[][] m2 = new int[r2][c2];
        System.out.println("enter a row and column size of m3");
        int r3 = sc.nextInt();
        int c3 = sc.nextInt();
        int[][] m3 = new int[r3][c3];
        System.out.println("Enter elements for first matrix");
        for(int i =0;i<m1.length;i++){
            for(int j =0;j<m1[i].length;j++){
                m1[i][j]=sc.nextInt();
            }
        }
            System.out.println("Enter elements for second matrix");
            for(int i =0;i<m2.length;i++){
                for(int j=0;j<m2[i].length;j++){
                    m2[i][j]=sc.nextInt();
                }      
            }
            for(int i =0;i<m3.length;i++){
                for(int j=0;j<m3[i].length;j++){
                    m3[i][j]=m1[i][j]+m2[i][j];
                }

            }
            System.out.println("Addition of matrix is :");
            for(int i =0;i<m3.length;i++){
                for(int j=0;j<m3[i].length;j++){
                    System.out.print(m3[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
        
    

    
}