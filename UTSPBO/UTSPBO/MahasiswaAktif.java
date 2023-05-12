package UTSPBO;

public class MahasiswaAktif extends Mahasiswa {
	public MahasiswaAktif(String nim, String nama, int semester, int umur, String[] krs) {
		super(nim, nama, semester, umur, krs);
		// TODO Auto-generated constructor stub
	}

	float hitungRataNilai(int[] nilai) {
		return super.hitungRataNilai(nilai);
	}

	void infoMahasiswa() {
		super.infoMahasiswa();
	}

	void infoKrsMahasiswa() {
		super.infoKrsMahasiswa();
	}
}
