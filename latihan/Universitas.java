import java.util.List;
import java.util.ArrayList;
public class Universitas {
  private String nama;
  private List<Mahasiswa> daftarMahasiswa; 
  public Universitas(String nama) {
    this.nama = nama;
    this.daftarMahasiswa = new ArrayList<>();
    }
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
    daftarMahasiswa.add(mahasiswa);
    }
    public void tampilkanDaftarMahasiswa() {
    System.out.println("Daftar Mahasiswa di Universitas " + nama +
    ":");
    for (Mahasiswa mahasiswa : daftarMahasiswa) {
    System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " +
    mahasiswa.getNim());
    }
    }
}
