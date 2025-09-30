# Post-Test-PBO-4

Nama: Azhaar Athahiroh
NIM: 2409116057

## Deskripsi:
Program ini dibuat untuk mengelola daftar outfit sehari-hari. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus outfit yang tersimpan. Program ini menampilkan daftar outfit yang sudah ada, mencegah data duplikat, dan memudahkan pengelolaan outfit sesuai kebutuhan pengguna.

Struktur program menggunakan konsep OOP (Object-Oriented Programming) dengan class dan subclass:

Outfit (Superclass) = menyimpan atribut dasar seperti atasan, bawahan, dan aksesoris.

FormalOutfit (Subclass) = turunan dari Outfit dengan tambahan atribut acara, digunakan untuk menyimpan outfit formal.

CasualOutfit (Subclass) = turunan dari Outfit dengan tambahan atribut aktivitas/jalanJalan, digunakan untuk outfit kasual.

## Alur Program

1. Class ManajemenOutfit (package main)

   ManajemenOutfit adalah class entry point program (punya method main). Di sini terdapat menu interaktif untuk user agar bisa melakukan operasi CRUD (Create, Read, Update, Delete) terhadap daftar outfit yang disediakan oleh OutfitService.
   
   - Import yang Dipakai:
   
   - model.Outfit = supaya bisa bikin objek outfit (atasan, bawahan, aksesoris).
   
   - service.OutfitService = dipakai untuk mengakses logika CRUD (tambah, lihat, ubah, hapus).
   
   - java.util.Scanner = untuk membaca input dari user lewat keyboard.

   <img width="255" height="61" alt="image" src="https://github.com/user-attachments/assets/2c7ac070-5c16-494c-804e-53d627493d4b" />

   - Objek yang Dibuat:
   
   - Scanner objekScanner = new Scanner(System.in); = dipakai untuk menangkap input dari user.
   
   - OutfitService service = new OutfitService(); = memanggil service yang sudah berisi daftar outfit default.
   
   - int pilihan; = untuk menyimpan pilihan menu dari user.
  
     <img width="453" height="100" alt="image" src="https://github.com/user-attachments/assets/bd0e575a-1e91-4c76-a71e-877dd6dcbb15" />

   - Menu Utama (Looping do...while)

   - Program akan menampilkan menu utama terus-menerus selama user belum memilih keluar (pilihan != 5).
   
   - Menu yang ditampilkan:
   
   - Tambah Outfit
   
   - Lihat Outfit
   
   - Ubah Outfit
   
   - Hapus Outfit
   
   - Keluar
   
   - User mengetik angka (1–5), lalu masuk ke switch-case.

   - Penjelasan switch-case

   - Case 1: Tambah Outfit
   
   - User diminta mengisi atasan, bawahan, aksesoris.
   
   - Ditanya konfirmasi (ya/tidak).
   
   - Kalau ya = outfit baru ditambahkan lewat service.tambahOutfit().
   
   - Kalau tidak = dibatalkan.
   
   - Input lain = dianggap tidak valid.
  
     <img width="664" height="368" alt="image" src="https://github.com/user-attachments/assets/3c86c0c5-6aad-4087-9c44-56cebbba639c" />

   - Case 2: Lihat Outfit
   
   - Program menampilkan daftar outfit yang ada melalui service.lihatOutfit().
  
     <img width="423" height="81" alt="image" src="https://github.com/user-attachments/assets/f7dccc3c-fdf7-4800-b0fb-e2791ec2df94" />

   - Case 3: Ubah Outfit
   
   - Dicek dulu apakah list kosong (service.isEmpty()).
   
   - Kalau kosong = tampil pesan "Belum ada outfit untuk diubah".
   
   - Kalau ada = user pilih nomor outfit.
   
   - Kalau valid = user isi atasan, bawahan, aksesoris baru.
   
   - Lalu konfirmasi (ya/tidak) sebelum benar-benar diubah.
  
     <img width="654" height="238" alt="image" src="https://github.com/user-attachments/assets/0dd4f635-205c-4583-9b38-5345e3253543" />

     <img width="666" height="361" alt="image" src="https://github.com/user-attachments/assets/20eabbb5-b9c2-47ff-b0a5-194c408cf413" />

   - Case 4: Hapus Outfit
   
   - Sama seperti ubah, dicek dulu apakah list kosong.
   
   - Kalau ada = user pilih nomor outfit.
   
   - Kalau nomor valid = konfirmasi (ya/tidak).
   
   - Kalau ya = outfit dihapus lewat service.hapusOutfit().
   
   - Kalau tidak = dibatalkan.
  
     <img width="705" height="460" alt="image" src="https://github.com/user-attachments/assets/8a68759c-e03e-442d-b1fa-66a9670e8fca" />

   - Case 5: Keluar Program
   
   - User ditanya konfirmasi (ya/tidak).
   
   - Kalau ya = program menampilkan pesan “Terima kasih. Sampai bertemu lagi!” lalu berhenti.
   
   - Kalau tidak = kembali ke menu utama.
   
   - Input lain = dianggap tidak valid dan kembali ke menu.
  
     <img width="657" height="245" alt="image" src="https://github.com/user-attachments/assets/d81f9114-d6dc-4a2f-8dd1-6192033ab583" />

   - Default Case
   
   - Kalau user mengetik angka selain 1–5 = muncul pesan: "Pilihan tidak valid. Coba lagi."
  
     <img width="490" height="52" alt="image" src="https://github.com/user-attachments/assets/302924bc-50ec-4813-af64-10e219c69494" />

   - Akhir Program
   
   - Setelah user benar-benar keluar (pilihan = 5 dan konfirmasi ya), Scanner ditutup dengan objekScanner.close();
  
     <img width="224" height="71" alt="image" src="https://github.com/user-attachments/assets/4fa8f5a9-de2e-43be-a0dc-f0529bf8aa4d" />

  3. Class Outfit (package model)

     Outfit adalah class model yang menjadi blueprint untuk menyimpan data satu outfit. Setiap objek Outfit merepresentasikan satu kombinasi atasan, bawahan, dan aksesoris.

     - Atribut (properties):
    
       <img width="256" height="76" alt="image" src="https://github.com/user-attachments/assets/b39e3a28-dafe-461f-8d26-0e669ebd640b" />

     - Ketiga atribut diset private untuk menerapkan encapsulation = artinya akses ke data lewat method publik (getter/setter), bukan langsung.
     
     - Constructor

       <img width="542" height="98" alt="image" src="https://github.com/user-attachments/assets/b62d3313-1d55-426e-ab38-b7101e376ea9" />

     - Digunakan untuk membuat objek Outfit baru dengan ketiga properti diinisialisasi saat pembuatan objek.
     
     - Getter dan Setter
     
     - Getter untuk mengambil nilai:
       
     - public String getAtasan() { return atasan; }
       
     - public String getBawahan() { return bawahan; }
       
     - public String getAksesoris() { return aksesoris; }
     
     - Setter untuk mengubah nilai:
     
     - public void setAtasan(String atasan) { this.atasan = atasan; }
     
     - public void setBawahan(String bawahan) { this.bawahan = bawahan; }
     
     - public void setAksesoris(String aksesoris) { this.aksesoris = aksesoris; }
    
       <img width="478" height="499" alt="image" src="https://github.com/user-attachments/assets/9259ce47-1e95-46ea-9e96-ae5cd08aa436" />

     - Fungsi: memberikan kontrol akses ke atribut.
     
     - Method tampilkanOutfit()
    
       <img width="459" height="72" alt="image" src="https://github.com/user-attachments/assets/13c34cbc-4dc2-43e3-ad5f-7466efe0a3cc" />

     - Mengembalikan representasi string rapi dari objek Outfit, dipakai saat menampilkan daftar di console (service.lihatOutfit()).
    
  4. Class OutfitService (package service)

     OutfitService adalah class yang bertanggung jawab untuk mengelola data outfit. Semua operasi utama seperti menambah, melihat, mengubah, dan menghapus outfit dilakukan di sini. Class ini menggunakan ArrayList sebagai tempat penyimpanan data sementara selama program berjalan.
    
     - Deklarasi ArrayList

     <img width="485" height="39" alt="image" src="https://github.com/user-attachments/assets/9763316c-e5fb-4c1f-8d6f-158e88b0b6e1" />

     - outfits digunakan untuk menyimpan daftar semua objek Outfit.
     
     - Tipe data: ArrayList<Outfit> agar bisa menambah, menghapus, atau mengubah data dengan mudah.
     
     - Constructor dengan data awal
    
       <img width="655" height="108" alt="image" src="https://github.com/user-attachments/assets/109e5795-a6c4-4a55-b47c-be6439c8de62" />

     - Saat objek OutfitService dibuat, otomatis ada 3 outfit default yang langsung masuk ke dalam outfits.
     
     - Method tambahOutfit()
    
     <img width="638" height="238" alt="image" src="https://github.com/user-attachments/assets/bc08d438-ea71-4311-b926-bb65827ced31" />

     - Mengecek dulu apakah outfit yang dimasukkan sudah ada dengan cara membandingkan atasan, bawahan, dan aksesoris.
     
     - Kalau sudah ada = tampil pesan: "Outfit sudah ada, tidak bisa ditambahkan lagi!".
     
     - Kalau belum ada = outfit ditambahkan ke outfits dan tampil pesan sukses.
     
     - Method lihatOutfit()
    
       <img width="601" height="165" alt="image" src="https://github.com/user-attachments/assets/d89a1253-b956-424b-8d8c-da413991df0e" />

     - Menampilkan seluruh daftar outfit.
     
     - Jika outfits kosong = tampil pesan "(Belum ada outfit)".
     
     - Jika ada = setiap outfit ditampilkan dengan nomor urut.
     
     - Method ubahOutfit()
    
       <img width="769" height="375" alt="image" src="https://github.com/user-attachments/assets/0b702fc9-6dfa-42db-8b4d-7757ad8e9a8e" />

     - Menerima index dari outfit yang ingin diubah.
     
     - Mengecek apakah index valid (tidak di luar ukuran list).
     
     - Mengecek apakah outfit baru sama persis dengan outfit lain = kalau iya, tampil pesan "Outfit sudah ada!".
     
     - Jika valid dan tidak duplikat = mengganti outfit lama dengan outfit baru di posisi yang dipilih.
     
     - Method hapusOutfit()
    
       <img width="502" height="162" alt="image" src="https://github.com/user-attachments/assets/2bc4e894-cf14-4a7f-a8e2-e1c09265c8d4" />

     - Mengecek apakah index valid.
     
     - Jika valid = hapus outfit sesuai index.
     
     - Jika tidak valid = tampil pesan "Nomor tidak valid!".
     
     - Method bantu (utility)
    
       <img width="292" height="125" alt="image" src="https://github.com/user-attachments/assets/1db6d0e9-03c4-41e7-afe3-a02d595c01a8" />

     - isEmpty() = cek apakah daftar kosong.
     
     - getSize() = ambil jumlah outfit yang ada sekarang.
     
     - Keduanya dipakai di class ManajemenOutfit (main program).

## Output

1. Saat program dijalankan

<img width="246" height="115" alt="image" src="https://github.com/user-attachments/assets/1c097d9d-ec89-4a94-a08b-56ec8d1c363a" />

2. Menu 1 – Tambah Outfit
   
   - Jika input normal dan disetujui:

     <img width="326" height="205" alt="image" src="https://github.com/user-attachments/assets/58cec65d-8941-4de9-bb0a-31cd0439a875" />

   - Jika user ketik tidak:

     <img width="359" height="215" alt="image" src="https://github.com/user-attachments/assets/9f797889-f04b-494d-b64f-f54feb4ebaf7" />

   - Jika user salah input (selain ya/tidak):

     <img width="340" height="38" alt="image" src="https://github.com/user-attachments/assets/a63d64d4-f7cb-4ddf-9434-dcab89785e51" />

   - Jika outfit duplikat:

     <img width="343" height="217" alt="image" src="https://github.com/user-attachments/assets/d5a7f64b-abdb-4c18-b90a-c1f475ea795b" />

3. Menu 2 – Lihat Outfit

   - Jika ada data:

     <img width="334" height="225" alt="image" src="https://github.com/user-attachments/assets/22a1e079-f205-4621-9122-20b6fb530da0" />

   - Jika kosong:

     <img width="236" height="175" alt="image" src="https://github.com/user-attachments/assets/7144338c-8a14-4e01-bf81-47eef9b5eab9" />

4. Menu 3 – Ubah Outfit

   - Jika kosong:

     <img width="235" height="142" alt="image" src="https://github.com/user-attachments/assets/d8d8b397-a325-4d46-abcc-28c74f793472" />

   - Jika ada data, tapi user pilih nomor valid:

     <img width="338" height="190" alt="image" src="https://github.com/user-attachments/assets/7fdae248-72c6-4d70-9780-5ad6a7328d47" />

   - Jika pilih nomor tidak valid (misal pilih 10, padahal data cuma 3):
  
     <img width="331" height="126" alt="image" src="https://github.com/user-attachments/assets/912e3360-1055-4920-b551-d1bba4cb3e15" />

   - Jika batal ubah:
  
     <img width="353" height="33" alt="image" src="https://github.com/user-attachments/assets/2b5ded74-0588-4e58-b5fe-9bdae620ef04" />

   - Jika input tidak valid (selain ya/tidak):

     <img width="350" height="35" alt="image" src="https://github.com/user-attachments/assets/10e92698-799f-4735-a957-e154b0736367" />

   - Jika outfit baru sama dengan yang sudah ada di list:
  
     <img width="335" height="191" alt="image" src="https://github.com/user-attachments/assets/60197841-9dc5-4a3e-a0e3-b60823199f5d" />

5. Menu 4 – Hapus Outfit

   - Jika kosong:

     <img width="258" height="139" alt="image" src="https://github.com/user-attachments/assets/8fddd28f-7548-4174-bfb2-37aa3cddd48b" />
   
   - Jika ada data, pilih nomor valid:
  
     <img width="347" height="242" alt="image" src="https://github.com/user-attachments/assets/0b223faf-ccdd-41ca-ad01-f690efbac7f8" />

   - Jika pilih nomor tidak valid:
  
     <img width="330" height="103" alt="image" src="https://github.com/user-attachments/assets/33ce1869-2486-4405-bb8a-7630d56d217b" />

   - Jika batal hapus:
  
     <img width="365" height="124" alt="image" src="https://github.com/user-attachments/assets/0acc10cc-07f1-47cf-82eb-d8a86793fb4e" />

   - Jika input tidak valid (selain ya/tidak):
  
     <img width="347" height="127" alt="image" src="https://github.com/user-attachments/assets/c6aad24e-a29b-4044-a952-3fb1f18e438d" />

6. Menu 5 – Keluar

   - Jika pilih ya:
  
     <img width="286" height="154" alt="image" src="https://github.com/user-attachments/assets/a8eec209-3842-4eeb-b202-fe5c1b40d44b" />

   - Jika pilih tidak:
  
     <img width="325" height="158" alt="image" src="https://github.com/user-attachments/assets/c4f3d15a-9c3e-4a6e-a976-b9d21e321b64" />

   - Jika input tidak valid:
  
     <img width="307" height="57" alt="image" src="https://github.com/user-attachments/assets/4ac93b8e-0634-459b-a870-4606632d0a64" />

7. Default (jika pilih menu selain 1–5):

   <img width="242" height="137" alt="image" src="https://github.com/user-attachments/assets/baf9401f-8ad6-43dd-ad00-3929b5d969ce" />


## Lanjutan encapsulation (getter dan setter) & inheritance

1. Subclass FormalOutfit

Merupakan subclass dari Outfit (inheritance).

Menambahkan atribut acara untuk menyimpan jenis acara outfit formal.

Atribut dibuat private dan ada getter & setter = menerapkan encapsulation.

Mewarisi semua atribut dan metode dari superclass (atasan, bawahan, aksesoris, tampilkanOutfit()).

<img width="791" height="332" alt="image" src="https://github.com/user-attachments/assets/fb1cb4b9-49ed-40bf-b679-8ead9b500aa7" />

2. Subclass CasualOutfit

Merupakan subclass dari Outfit.

Menambahkan atribut jalanJalan untuk menyimpan aktivitas casual.

Atribut private, memiliki getter & setter = encapsulation diterapkan.

Mewarisi semua atribut dan metode dari superclass.

<img width="851" height="331" alt="image" src="https://github.com/user-attachments/assets/6e1b9598-c69d-4c27-bad4-faaae688b019" />


## Abstraction & Polymorphism

### Perubahan di main

Karena kita menambahkan konsep abstraction & polymorphism. Sekarang Outfit bukan cuma satu tipe, tapi ada CasualOutfit dan FormalOutfit. Jadi main harus diubah supaya bisa membedakan jenis outfit yang dimasukkan user, lalu membuat objek subclass yang sesuai.

1. Versi lama

- Saat tambah outfit, langsung bikin:

<img width="393" height="19" alt="image" src="https://github.com/user-attachments/assets/c59d2c41-94ba-499c-a7f0-e2878866d977" />

- Semua data outfit dianggap sama, tidak ada perbedaan jenis (casual atau formal).

- Jadi, ketika service.tambahOutfit(...) dipanggil, objek yang masuk selalu Outfit biasa dan belum ada penggunaan abstraction maupun polymorphism di bagian ini.

2. Versi baru

- Ada tambahan input jenis outfit:

<img width="428" height="53" alt="image" src="https://github.com/user-attachments/assets/075876d3-6c38-48e8-9581-6c11e87fc0ec" />

- Jika casual, dibuat objek CasualOutfit:

<img width="654" height="20" alt="image" src="https://github.com/user-attachments/assets/4a21ca49-4e56-4c6b-a4f5-fc0ced570afd" />

- Jika formal, dibuat objek FormalOutfit:

<img width="595" height="15" alt="image" src="https://github.com/user-attachments/assets/45a63d78-a9b7-499a-b746-2e1b36fa95cc" />

- Variabel yang dikirim ke service tetap bertipe Outfit (induk), tapi objek nyatanya bisa berupa CasualOutfit atau FormalOutfit. Di sini terjadi polymorphism: method tambahOutfit(Outfit o) bisa menerima banyak bentuk objek (CasualOutfit atau FormalOutfit).

### Output perubahan di menu ubah outfit

- Versi lama: langsung bikin objek Outfit baru dengan atribut baru.

- Versi baru: user juga diminta memilih jenis baru (casual/formal), lalu dibuat objek sesuai jenis itu. Jadi hasil ubah bisa berbeda tipe dari sebelumnya (misal: dari casual jadi formal).

<img width="337" height="244" alt="image" src="https://github.com/user-attachments/assets/1ff0a91d-3a3f-41f8-8d53-0ee0ded7bbab" />

### Output perubahan di menu lain

Lihat Outfit (case 2) = tetap sama, tapi efeknya beda karena service.lihatOutfit() sekarang menampilkan hasil tampilkanOutfit() yang sudah dioverriding di subclass.

<img width="571" height="212" alt="image" src="https://github.com/user-attachments/assets/1c2d2459-7ec2-4dbe-8235-c99288a47804" />

Ubah Outfit (case 3) selain ganti data umum, user juga bisa ganti jenis outfit (casual/formal) lalu dibuat objek subclass sesuai pilihan. Hapus Outfit (case 4) dan Keluar (case 5) = logika hampir sama dengan versi lama, tidak terlalu berubah.

<img width="604" height="550" alt="image" src="https://github.com/user-attachments/assets/31d429f7-6bdd-4ab2-9278-746236d3b3f4" />

<img width="537" height="253" alt="image" src="https://github.com/user-attachments/assets/90d3dd3c-d2d2-4179-a2c5-9fe8c75bc457" />

### Perubahan di packages model

Kalau dulu Outfit itu class biasa, jadi semua outfit ditampilkan sama aja. Sekarang saya ubah jadi abstract class, jadi Outfit cuma kerangka. Yang nentuin detail tampilannya itu ada di subclass kayak CasualOutfit sama FormalOutfit.

1. Versi lama (Outfit biasa)

- Outfit adalah class konkret artinya Outfit adalah class biasa yang bisa langsung dibuat objeknya. Class ini memiliki implementasi penuh untuk semua method nya, sehingga kita bisa langsung membuat instance dari class ini tanpa harus membuat subclass terlebih dahulu.

- Method tampilkanOutfit() sudah ada implementasinya = selalu sama: menampilkan atasan, bawahan, aksesoris.
  
- Kekurangan: semua outfit punya perilaku yang sama, nggak bisa dibedakan (misalnya casual vs formal).

2. Versi baru (Outfit abstract)

- Outfit diubah jadi abstract class:

<img width="257" height="21" alt="image" src="https://github.com/user-attachments/assets/e0f642dc-ed81-4321-a247-e4d916bcb7df" />

- Method tampilkanOutfit() diubah jadi abstract:

<img width="342" height="18" alt="image" src="https://github.com/user-attachments/assets/eeb52987-e6e1-4825-8543-d41bd7fe5684" />

- Artinya: class induk hanya menyediakan istilahnya tempat bahwa setiap subclass wajib bikin versinya sendiri.

- Akibatnya, tidak bisa lagi bikin objek Outfit langsung:
  new Outfit(...) = bakal error.
  harus lewat subclass: new CasualOutfit(...) atau new FormalOutfit(...).

### Perubahan di subclass

1. casualOutfit

   a. Versi lama
     
   - CasualOutfit adalah subclass biasa dari Outfit.
     
   - Hanya punya atribut jalanJalan untuk tempat casual.
     
   - Tidak ada metode tampilkanOutfit() khusus = hanya mengikuti metode dari class induk Outfit.
     
   - Format tampilan outfit sama untuk semua jenis outfit.
   
   b. Versi baru

   - CasualOutfit tetap subclass dari Outfit, tapi sekarang class induknya adalah abstract class.
   
   - Menambahkan atribut tempatSantai (pengganti jalanJalan).
   
   - Menambahkan overriding method tampilkanOutfit() = membuat format tampilan outfit khusus untuk CasualOutfit.
   
   - Sekarang tiap subclass punya versi tampilannya sendiri = mengimplementasikan Polymorphism (Overriding).
  
2. formalOutfit

   a. Versi lama

   - FormalOutfit adalah subclass sederhana dari Outfit.
   
   - Memiliki atribut acara untuk menandakan jenis acara formal.
   
   - Tidak memiliki metode tampilkanOutfit() khusus = mengikuti metode dari class induk Outfit.
   
   - Format tampilannya sama seperti class induk = tidak ada perbedaan visual khusus.
   
   b. Versi baru

   - FormalOutfit tetap subclass dari Outfit, namun class induknya kini abstract.
   
   - Masih memiliki atribut acara tetapi menambahkan overriding method tampilkanOutfit().
   
   - tampilkanOutfit() di overriding untuk menampilkan outfit formal dengan format khusus:
   
<img width="688" height="93" alt="image" src="https://github.com/user-attachments/assets/1b7370de-f785-4275-af9a-18cbbfcccfc4" />

- Perubahan ini membuat tampilan setiap outfit lebih spesifik tergantung jenisnya = contoh penerapan Polymorphism (Overriding).

### Perubahan di packages service

a. Penambahan konsep Polymorphism & Overloading

- Versi lama:

  OutfitService hanya menerima objek Outfit di method tambahOutfit().

  Tidak ada method overloading.

  Semua outfit ditambahkan sama, tanpa perbedaan jenis (casual, formal).

- Versi baru:

  OutfitService memiliki method tambahOutfit() yang overloaded:

<img width="608" height="23" alt="image" src="https://github.com/user-attachments/assets/c2439dec-51f9-45bb-9b09-307fa251535a" />

 Method ini otomatis membuat outfit CasualOutfit dengan default “Santai”.
 
 Menambah fleksibilitas untuk menambahkan outfit langsung dari parameter tanpa membuat objek terlebih dahulu.
 
 Memanfaatkan Polymorphism karena semua outfit disimpan sebagai Outfit tapi bisa berupa CasualOutfit atau FormalOutfit.

b. Perubahan data awal

- Versi lama:

  Constructor OutfitService() membuat beberapa Outfit biasa dengan data dummy.

  Semua outfit yang dimasukkan adalah objek Outfit tanpa jenis khusus.

- Versi baru:

  Constructor membuat contoh outfit dari subclass CasualOutfit dan FormalOutfit:

<img width="756" height="43" alt="image" src="https://github.com/user-attachments/assets/c4ca4a59-6b63-437d-be93-b62d912ecf04" />

  Tujuannya: memperlihatkan konsep inheritance dan overriding dari awal.

c. Penyederhanaan logika method

- Versi lama:

  tambahOutfit() memeriksa apakah outfit yang akan ditambah sudah ada (cek berdasarkan atribut).

  lebih rumit karena harus loop dan membandingkan atribut setiap objek.

- Versi baru:

  tambahOutfit() langsung menambahkan outfit tanpa pengecekan duplikasi.

  lebih fokus pada demonstrasi konsep OOP seperti overloading, inheritance, dan polymorphism.

  penekanan pada kemudahan menambah outfit dan memanfaatkan subclass.
