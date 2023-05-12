package UTSPBO;

public class MahasiswaBaru extends Mahasiswa {
	String asalSekolah;

	public MahasiswaBaru(String nim, String nama, int semester, int umur, String[] krs, String asalSekolah) {
		super(nim, nama, semester, umur, krs);
		this.asalSekolah = asalSekolah;
	}

	boolean ikutOspek() {
		return true;
	}

	void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Asal Sekolah: " + asalSekolah);
	}

}
