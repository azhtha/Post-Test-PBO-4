/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemenoutfitharian;

/**
 *
 * @author Atha
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Manajemenoutfitharian {
    public static void main(String[] args) {
        ArrayList<String> outfits = new ArrayList<>();
        
        outfits.add("cardigan pink, celana biru, pashmina abu");
        outfits.add("baju mofusand, celana putih, pashmina pink");
        outfits.add("kemeja pink, celana jeans, pashmina biru");
        
        Scanner objekScanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Outfit Harian ===");
            System.out.println("1. Tambah Outfit");
            System.out.println("2. Lihat Outfit");
            System.out.println("3. Ubah Outfit");
            System.out.println("4. Hapus Outfit");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = objekScanner.nextInt();
            objekScanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan outfit baru: ");
                    String outfitBaru = objekScanner.nextLine();
                    
                    if (outfits.contains(outfitBaru)) {
                        System.out.println("Outfit sudah ada!");
                    } else {
                        System.out.println("Yakin mau nambah? (ya/tidak): ");
                        String Yakin = objekScanner.nextLine();
                    
                        if (Yakin.equals("ya")) {
                            outfits.add(outfitBaru);
                            System.out.println("Ok! Berhasil ditambah!");
                        } else if (Yakin.equals("tidak")) {
                            System.out.println("Tidak jadi nambah, kembali ke menu.");
                        } else {
                            System.out.println("Input tidak valid, silakan kembali ke menu.");
                            pilihan = 0;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Outfit Harian:");
                    if (outfits.isEmpty()) {
                        System.out.println("(Belum ada outfit)");
                    } else {
                        for (int i = 0; i < outfits.size(); i++) {
                            System.out.println((i + 1) + ". " + outfits.get(i));
                        }
                    }
                    break;

                case 3:
                    if (outfits.isEmpty()) {
                        System.out.println("Belum ada outfit untuk diubah.");
                    } else {
                        System.out.println("Pilih nomor outfit yang mau diubah:");
                        for (int i = 0; i < outfits.size(); i++) {
                            System.out.println((i + 1) + ". " + outfits.get(i));
                        }
                        System.out.print("Nomor: ");
                        int Ubah = objekScanner.nextInt();
                        objekScanner.nextLine();
                        
                        if (Ubah == 0) {
                            System.out.println("Tidak jadi ubah, kembali ke menu.");
                        } else if (Ubah > 0 && Ubah <= outfits.size()) {
                            System.out.println("Yakin mau ubah? (ya/tidak): ");
                            String yakin = objekScanner.nextLine();

                            if (yakin.equals("ya")) {
                                System.out.print("Masukkan outfit baru: ");
                                String outfitUbah = objekScanner.nextLine();
                                outfits.set(Ubah - 1, outfitUbah);
                                System.out.println("Outfit berhasil diubah!");
                            } else if (yakin.equals("tidak")) {
                                System.out.println("Pengubahan dibatalkan, kembali ke menu.");
                            } else {
                                System.out.println("Input tidak valid, kembali ke menu.");
                            }
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;

                case 4:
                    if (outfits.isEmpty()) {
                        System.out.println("Belum ada outfit untuk dihapus.");
                    } else {
                        System.out.println("Pilih nomor outfit yang mau dihapus: ");
                        for (int i = 0; i < outfits.size(); i++) {
                            System.out.println((i + 1) + ". " + outfits.get(i));
                        }
                        System.out.print("Nomor: ");
                        int Hapus = objekScanner.nextInt();
                        objekScanner.nextLine();

                        if (Hapus == 0) {
                            System.out.println("Tidak jadi menghapus, kembali ke menu.");
                        } else if (Hapus > 0 && Hapus <= outfits.size()) {
                            System.out.print("Yakin mau hapus? (ya/tidak): ");
                            String yakinHapus = objekScanner.nextLine();

                            if (yakinHapus.equals("ya")){
                                outfits.remove(Hapus - 1);
                                System.out.println("Outfit berhasil dihapus!");
                            } else if (yakinHapus.equals("tidak")) {
                                System.out.println("Penghapusan dibatalkan, kembali ke menu.");
                            } else {
                                System.out.println("Input tidak valid, kembali ke menu.");
                            }
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                    break;


                case 5:
                    System.out.print("Anda yakin mau keluar? (ya/tidak): ");
                    String yakin = objekScanner.nextLine();

                    if (yakin.equals("ya")) {
                        System.out.println("Keluar dari program. Sampai jumpa!");
                    } else if (yakin.equals("tidak")) {
                        System.out.println("Tidak jadi keluar, kembali ke menu");
                        pilihan = 0;
                    } else {
                        System.out.println("Input tidak valid, silakan kembali ke menu.");
                        pilihan = 0;
                    }
                    break;
                    
            default:
               System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 5);

        objekScanner.close();
    }
}

