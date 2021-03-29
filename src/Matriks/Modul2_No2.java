package Matriks;
public class Modul2_No2 {
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
         int baris_x = F.length;
         int kolom_x = F[0].length;
         int [][] Hasil = new int [baris_x][kolom_x];
         for (int i=0; i<baris_x; i++){
             for (int j=0; j<kolom_x; j++){
                 Hasil [i][j] = G[i][j] - F[i][j];
                 System.out.print(Hasil[i][j]+ " ");
                 
             }
             System.out.println();
             
             
             
         }
         System.out.println("Fajriya Hasna Putri");
     }
    
}
