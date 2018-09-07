import java.util.Scanner;

class HitungLuas {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    char ulangi;

    do {
      System.out.println("=======================");
      System.out.println("Pilih Bangun :");
      System.out.println("1. Persegi");
      System.out.println("2. Persegi Panjang");
      System.out.println("3. Lingkaran");
      System.out.println("4. Segitiga");
      System.out.println("=======================");

      System.out.print("Masukkan Pilihan \t: ");
      int pilihan = scan.nextInt();

      if (pilihan == 1) {
        System.out.print("sisi \t: ");
        int sisi = scan.nextInt();
        int luas = sisi * sisi;
        System.out.println("luas \t: " + luas);
      } else if (pilihan == 2) {
        System.out.print("panjang \t: ");
        int panjang = scan.nextInt();
        System.out.print("lebar \t\t: ");
        int lebar = scan.nextInt();
        int luas = panjang * lebar;
        System.out.println("luas \t\t: " + luas);
      } else if (pilihan == 3) {
        System.out.print("radius \t: ");
        int radius = scan.nextInt();
        double luas = 3.14 * radius * radius;
        System.out.println("luas \t: " + luas);
      } else if (pilihan == 4) {
        System.out.print("alas \t: ");
        int alas = scan.nextInt();
        System.out.print("tinggi \t: ");
        int tinggi = scan.nextInt();
        double luas = 0.5 * alas * tinggi;
        System.out.println("luas \t: " + luas);
      } else {
        System.out.println("Inputan salah!");
      }

      System.out.print("Ulangi (Y/N) ? ");
      ulangi = scan.next().charAt(0);
    } while (ulangi == 'Y');
  }

}