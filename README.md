# **Tugas 2 - Konsep Inheritance & Interface dalam Java**

## **Deskripsi Singkat**
Yo guys! 😎  
Proyek ini nunjukin **cara pakai inheritance dan interface** di Java. Studi kasusnya tentang **Idol** yang punya beberapa peran sekaligus:

- *Mahasiswa* 🎓  
- *Penjual Baju* 👗  
- *Sandwich Generation* 💸  

Selain identitas dasarnya sebagai **Manusia**.

---

## **Struktur Proyek**
Proyek ini punya **5 file Java** yang saling nyambung:

1. **Manusia.java**  
   *Superclass* yang nyimpen properti dasar tiap manusia, kayak `warnaKulit` & `statusHubungan`.

2. **Mahasiswa.java**  
   *Interface* buat perilaku mahasiswa, contohnya:  
   - `mengerjakanTugasIndividu()`  
   - `mengerjakanTugasHimpunan()`  
   - `mengerjakanTugasKelompok()`

3. **PenjualBaju.java**  
   *Interface* buat perilaku jualan baju:  
   - `membuatDesainBaju()`  
   - `memilihKain()`  
   - `memasarkanProduk()`

4. **SandwichGeneration.java**  
   *Interface* buat tanggung jawab finansial:  
   - `memberiUangKeOrtu()`  
   - `memberiUangKeAdik()`  
   - `memberiUangKeKerabat()`

5. **Idol.java**  
   *Subclass utama* yang:  
   - Mewarisi properti dari **Manusia**  
   - Implement semua method dari interface **Mahasiswa**, **PenjualBaju**, & **SandwichGeneration**

---

## **Cara Menjalankan Program**
1. Pastikan semua file (`Idol.java`, `Manusia.java`, `Mahasiswa.java`, `PenjualBaju.java`, `SandwichGeneration.java`) ada di **satu folder** & package yang sama: `tugas2`.

2. Buka terminal / cmd.

3. Pindah ke direktori tempat file disimpan.

4. **Kompilasi semua file**:
