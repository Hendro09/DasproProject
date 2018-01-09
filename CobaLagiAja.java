import java.util.Scanner;
public class CobaLagiAja {

	public static void main ( String [] args ) {


	int Masuk1;
	int Masuk2;
	int Hasil1;
	int Hasil2;
	int Hasil3;
	int Hasil4;
	int Hasil5;

	Scanner Var1 = new Scanner ( System.in );
	System.out.print (" Masukkan Angka Pertama : " );
	Masuk1 = Var1.nextInt();

	Scanner Var2 = new Scanner ( System.in ) ;
	System.out.print (" Masukkan Angka Kedua : " );
	Masuk2 = Var2.nextInt();

	String Perkalian;
	String Pembagian;
	String Penjumlahan;
	String Pengurangan;
	String Modulo;

	Hasil1 = Masuk1 * Masuk2;
	

	Hasil2 = Masuk1 / Masuk2;
	

	Hasil3 = Masuk1 + Masuk2;
	

	Hasil4 = Masuk1 - Masuk2;
	

	Hasil5 = Masuk1 % Masuk2;
	

	
	System.out.println();
	System.out.println("Hasil Perkaliannya adalah : "+Hasil1 );
	System.out.println("Hasil Pembagiannya adalah : "+Hasil2 );
	System.out.println("Hasil Penjumlahannnya adalah : "+Hasil3 );
	System.out.println("Hasil Pengurangannya adalah : "+Hasil4 );
	System.out.println("Hasil Modulonya adalah : "+Hasil5 );
	System.out.println();

  }
}