package UTSPBO;

public class MahasiswaTransfer extends MahasiswaBaru {
	String asalUniversitas;

	public MahasiswaTransfer(String nim, String nama, int semester, int umur, String[] krs, String asalSekolah,
			String asalUniversitas) {
		super(nim, nama, semester, umur, krs, asalSekolah);
		this.asalUniversitas = asalUniversitas;
	}

	boolean ikutOspek() {
		return super.ikutOspek();
	}

	void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Asal Universitas: " + asalUniversitas);
	}
}
