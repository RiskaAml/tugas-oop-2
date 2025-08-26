Tugas 2 - Konsep Inheritance dan Interface dalam Java
Deskripsi Singkat

Proyek ini mendemonstrasikan penerapan konsep inheritance dan interface dalam bahasa pemrograman Java. Studi kasus yang digunakan adalah entitas Idol yang memiliki beberapa peran atau "kepribadian", yaitu:

Mahasiswa

Penjual baju

Sandwich Generation

Selain dari identitas dasarnya sebagai Manusia.

Struktur Proyek

Proyek ini terdiri dari lima file Java yang saling berhubungan:

Manusia.java
Superclass yang berisi properti dasar yang dimiliki setiap manusia, seperti warnaKulit dan statusHubungan.

Mahasiswa.java
Interface yang mendefinisikan perilaku yang berkaitan dengan kehidupan seorang mahasiswa, seperti:

mengerjakanTugasIndividu()

mengerjakanTugasHimpunan()

mengerjakanTugasKelompok()

PenjualBaju.java
Interface yang mendefinisikan perilaku terkait peran sebagai penjual baju, seperti:

membuatDesainBaju()

memilihKain()

memasarkanProduk()

SandwichGeneration.java
Interface yang mendefinisikan tanggung jawab finansial seorang sandwich generation, seperti:

memberiUangKeOrtu()

memberiUangKeAdik()

memberiUangKeKerabat()

Idol.java
Subclass utama yang:

Mewarisi properti dari Manusia

Mengimplementasikan semua metode dari interface Mahasiswa, PenjualBaju, dan SandwichGeneration

Cara Menjalankan Program

Pastikan semua file (Idol.java, Manusia.java, Mahasiswa.java, PenjualBaju.java, SandwichGeneration.java) berada dalam satu direktori dan package yang sama, yaitu tugas2.

Buka terminal atau command prompt.

Pindah ke direktori tempat file disimpan.

Kompilasi semua file Java:

javac tugas2/*.java


Jalankan program:

java tugas2.Idol

Output Program

Setelah dijalankan, program akan menampilkan properti dan aksi dari objek Idol, sebagai berikut:

Warna kulit: Putih
Punya pasangan: Nayeon belum punya pasangan
Mengerjakan tugas individu.
Mengerjakan tugas himpunan mahasiswa.
Mengerjakan tugas kelompok.
Membuat desain baju.
Memilih kain untuk baju.
Memasarkan produk baju.
Memberi uang ke orang tua.
Memberi uang ke adik.
Memberi uang ke kerabat.
