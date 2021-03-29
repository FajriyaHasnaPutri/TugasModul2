package Matriks;
public class Modul2_No4 {
    public static void main(String[] args){
       int [][] H = {
           {2,1,-5},
           {3,4,2}
       };
       int transpose[][] = new int [10][10];
       for(int k=0; k<H.length; k++){
           for(int j=0; j<H[0].length; j++){
               transpose[j][k] = H[k][j];
           }
           System.out.println();
       }
       for(int k=0; k<H[0].length; k++){
           for(int j=0; j<H.length; j++){
               System.out.print(transpose[k][j]+ " ");
           }
           System.out.println();
       }
       System.out.println("Fajriya Hasna Putri");
    }
    
}
