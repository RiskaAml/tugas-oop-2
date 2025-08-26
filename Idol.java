package tugas2;

public class Idol extends Manusia implements Mahasiswa, PenjualBaju, SandwichGeneration {
    
    // constructor Idol wajib panggil super
    private Idol(String warnaKulit, boolean pasangan) {
        super(warnaKulit, pasangan);
    }

    // ===== Implementasi SandwichGeneration =====
    public  void memberiUangkeOrtu(){
        System.out.println("Memberi uang ke orang tua.");
    }
    public void memberiUangkeAdik(){
         System.out.println("Memberi uang ke adik.");
    }
    public void memberiUangkeKerabat(){
        System.out.println("Memberi uang ke kerabat.");
    }
    
    // ===== Implementasi Mahasiswa =====
    public void mengerjakanTugasIndividu() {
        System.out.println("Mengerjakan tugas individu.");
    }
    public void mengerjakanTugasHima() {
        System.out.println("Mengerjakan tugas himpunan mahasiswa.");
    }
    public void mengerjakanTugasKelompok() {
        System.out.println("Mengerjakan tugas kelompok.");
    }

    // ===== Implementasi PenjualBaju =====
    public void membuatDesain() {
        System.out.println("Membuat desain baju.");
    }
    public void memilihKain() {
        System.out.println("Memilih kain untuk baju.");
    }
    public void memasarkanProduk() {
        System.out.println("Memasarkan produk baju.");
    }
    
    public static void main(String[] args) {
        Idol nayeon = new Idol("Putih", false);

        // coba jalankan semua method
        System.out.println("Warna kulit: " + nayeon.getWarnaKulit());
        System.out.println("Punya pasangan: " + (nayeon.isPasangan() ? "Nayeon punya pasangan" : "Nayeon belum punya pasangan"));
        nayeon.mengerjakanTugasIndividu();
        nayeon.mengerjakanTugasHima();
        nayeon.mengerjakanTugasKelompok();
        
        nayeon.membuatDesain();
        nayeon.memilihKain();
        nayeon.memasarkanProduk();
        nayeon.memberiUangkeOrtu();
        nayeon.memberiUangkeAdik();
        nayeon.memberiUangkeKerabat();
    }
}
