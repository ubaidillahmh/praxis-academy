import java.util.Scanner;

class MatrixInput {
    public static void main (String[] args){

        int jumlahBaris, jumlahKolom, jumlahBaris2, jumlahKolom2;
        Scanner scanner = new Scanner(System.in);

        // Input Jumlah baris dan kolom matriks 1
        System.out.print("Masukan Jumlah indeks baris martriks 1 : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Masukan Jumlah indeks kolom martriks 1 : ");
        jumlahKolom = scanner.nextInt();
        int matrix1[][] = new int[jumlahBaris][jumlahKolom];

        // input jumlah baris dan kolom matriks 2
        System.out.print("Masukan Jumlah indeks baris martriks 2 : ");
        jumlahBaris2 = scanner.nextInt();
        System.out.print("Masukan Jumlah indeks kolom martriks 2 : ");
        jumlahKolom2 = scanner.nextInt();
        int matrix2[][] = new int[jumlahBaris2][jumlahKolom2];

        // Declare untuk wadah hasil
        int matrix3[][] = new int[jumlahBaris2][jumlahKolom2];

        // input value matriks 1
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukan isi Matriks 1 indeks baris ke " + i + " kolom ke "+j+":");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // input value matriks 2
        for (int i = 0; i < jumlahBaris2; i++) {
            for (int j = 0; j < jumlahKolom2; j++) {
                System.out.print("Masukan isi Matriks 2 indeks beris ke " + i + " kolom ke "+j+":");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int total = 0; 
                for (int k = 0; k < matrix1.length; k++){
                    total = total +  (matrix1[i][k] * matrix2[k][j]);
                }
                matrix3[i][j] = total;
            }       
        }

        for (int i = 0; i < matrix3.length; i++){
            for (int j = 0; j < matrix3[0].length; j++){
                System.out.print( matrix3[i][j] + " ");
            }       
            System.out.println();
        }
    }
}