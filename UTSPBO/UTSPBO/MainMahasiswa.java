package UTSPBO;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Pilihan;

        do {
            System.out.println("Input Mahasiswa: ");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Mahasiswa Baru");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("4. Mahasiswa Transfer");
            System.out.println("5. Mahasiswa Aktif");
            System.out.println("6. Exit");
            System.out.println("PILIHAN = ");

            Pilihan = scanner.nextLine();

            switch (Pilihan) {
                case "1":
                    System.out.println("Input mahasiswa ke-: ");
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Input KRS (Memakai koma):");
                    String[] krs = scanner.nextLine().split(",");
                    Mahasiswa mhs = new Mahasiswa(nim, nama, semester, umur, krs);
                    mhs.infoMahasiswa();
                    mhs.infoKrsMahasiswa();
                    int nilai[] = { 85, 97, 57, 65 };
                    System.out.println("Mahasiswa " + mhs.nama + ", rata-rata nilai: " + mhs.hitungRataNilai(nilai));
                    // System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
                    break;

                case "2":
                    System.out.println("Input mahasiswa baru:");
                    System.out.print("NIM: ");
                    String nim1 = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama1 = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Asal Sekolah: ");
                    String asalSekolah = scanner.nextLine();
                    System.out.println("Input KRS (Memakai koma):");
                    String[] krsBaru = scanner.nextLine().split(",");
                    MahasiswaBaru mhsBaru = new MahasiswaBaru(nim1, nama1, semester1, umur1, krsBaru, asalSekolah);
                    mhsBaru.infoMahasiswa();
                    mhsBaru.infoKrsMahasiswa();
                    int nilaiBaru[] = { 90, 67, 80, 40 };
                    System.out.println(
                            "Mahasiswa " + mhsBaru.nama + ", rata-rata nilai: " + mhsBaru.hitungRataNilai(nilaiBaru));
                    System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
                    break;

                case "3":
                    System.out.println("Input mahasiswa lulus:");
                    System.out.print("NIM: ");
                    nim1 = scanner.nextLine();
                    System.out.print("Nama: ");
                    nama1 = scanner.nextLine();
                    System.out.print("Semester: ");
                    semester1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Usia: ");
                    umur1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tahun Wisuda: ");
                    int tahunWisuda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("IPK: ");
                    float ipk = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Input KRS (Gunakan koma):");
                    String[] krsLulus = scanner.nextLine().split(",");
                    MahasiswaLulus mhsLulus = new MahasiswaLulus(nim1, nama1, semester1, umur1, krsLulus, tahunWisuda,
                            ipk);
                    mhsLulus.infoMahasiswa();
                    mhsLulus.infoKrsMahasiswa();
                    int nilaiLulus[] = { 65, 75, 62, 70 };
                    System.out.println("Mahasiswa " + mhsLulus.nama + ", rata-rata nilai: "
                            + mhsLulus.hitungRataNilai(nilaiLulus));
                    System.out.println("Ikut WISUDA: " + mhsLulus.ikutWisuda());
                    break;

                case "4":
                    System.out.println("Input mahasiswa Transfer:");
                    System.out.print("NIM: ");
                    String nim2 = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama2 = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Asal Sekolah: ");
                    String asalSekolah2 = scanner.nextLine();
                    System.out.print("Asal Universitas: ");
                    String asalUniversitas = scanner.nextLine();
                    System.out.println("Input KRS (Gunakan koma):");
                    String[] krsTrans = scanner.nextLine().split(",");
                    MahasiswaTransfer mhsTrans = new MahasiswaTransfer(nim2, nama2, semester2, umur2, krsTrans,
                            asalSekolah2, asalUniversitas);
                    mhsTrans.infoMahasiswa();
                    mhsTrans.infoKrsMahasiswa();
                    int nilaiTrans[] = { 86, 65, 53, 70 };
                    System.out.println("Mahasiswa " + mhsTrans.nama + ", rata-rata nilai: "
                            + mhsTrans.hitungRataNilai(nilaiTrans));
                    System.out.println("Ikut OSPEK: " + mhsTrans.ikutOspek());
                    break;
                case "5":
                    System.out.println("Input mahasiswa Aktif:");
                    System.out.print("NIM: ");
                    String nim3 = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama3 = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Input KRS (Gunakan koma):");
                    String[] krsAktif = scanner.nextLine().split(",");
                    Mahasiswa mhsAktif = new Mahasiswa(nim3, nama3, semester3, umur3, krsAktif);
                    mhsAktif.infoMahasiswa();
                    mhsAktif.infoKrsMahasiswa();
                    int nilaiAktif[] = { 65, 85, 60, 60 };
                    System.out.println("Mahasiswa " + mhsAktif.nama + ", rata-rata nilai: "
                            + mhsAktif.hitungRataNilai(nilaiAktif));
                    // System.out.println("Ikut OSPEK: " + mhsBaru.ikutOspek());
                    break;
                case "6":
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan pilih lagi.");
                    break;
            }

            System.out.println();

        } while (!Pilihan.equals("6"));

        scanner.close();
    }
}
