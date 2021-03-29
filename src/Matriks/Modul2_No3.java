package Matriks;
public class Modul2_No3 {
     public static void main(String[] args) {
         int[][] F = {
             {5,8},
             {3,7},
             {9,4}
         };
         int [][] G = {
             {16,21},
             {29,14},
             {23,31}
         };
         int baris_o = F.length;
         int kolom_o = F[0].length;
         int baris_p = G.length;
         int kolom_p = G[0].length;
         int [][] Hasil = new int [baris_o][kolom_p];
         for (int i=0; i<baris_o; i++){
             for (int j=0; j<kolom_p; j++){
                 for (int k=0; k<kolom_o; k++){
                 Hasil [i][j] = G[i][j] * F[i][j];
                 }
             }
         }
         for (int[] x: Hasil){
             for (int Y:x){
                 System.out.print(Y+" ");
             } 
         }
         System.out.println("Fajriya Hasna Putri");
     }
    
}
