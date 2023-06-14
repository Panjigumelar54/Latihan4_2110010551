package penilaian;

public class main {
    public static void main(String[] args) {
       NilaiAkhir panji = new NilaiAkhir ("Panji Gumelar","2110010551",70,85,90); 
    
    
        System.out.println("Nama Mahasiswa: "+panji.getNama());
        System.out.println("NPM Mahasiswa: "+panji.getNpm());
        System.out.println("Nilai Akhir: "+panji.hitungNilaiAkhir());
    
    
    }
}
