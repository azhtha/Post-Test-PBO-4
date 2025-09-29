package main;

import model.Outfit;
import service.OutfitService;
import java.util.Scanner;

public class ManajemenOutfit {
    public static void main(String[] args) {
        Scanner objekScanner = new Scanner(System.in);
        OutfitService service = new OutfitService();
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
                    System.out.print("Masukkan atasan: ");
                    String atasan = objekScanner.nextLine();
                    System.out.print("Masukkan bawahan: ");
                    String bawahan = objekScanner.nextLine();
                    System.out.print("Masukkan aksesoris: ");
                    String aksesoris = objekScanner.nextLine();

                    System.out.print("Yakin mau menambah outfit ini? (ya/tidak): ");
                    String tambah = objekScanner.nextLine();
                    if (tambah.equalsIgnoreCase("ya")) {
                        Outfit outfitBaru = new Outfit(atasan, bawahan, aksesoris);
                        service.tambahOutfit(outfitBaru);
                    } else if (tambah.equalsIgnoreCase("tidak")) {
                        System.out.println("Tidak jadi menambah, silakan kembali ke menu.");
                    } else {
                        System.out.println("Input tidak valid, silakan kembali ke menu.");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Outfit Harian:");
                    service.lihatOutfit();
                    break;

                case 3:
                    if (service.isEmpty()) {
                        System.out.println("Belum ada outfit untuk diubah.");
                    } else {
                        service.lihatOutfit();
                        System.out.print("Pilih nomor outfit yang mau diubah: ");
                        int ubahIndex = objekScanner.nextInt() - 1;
                        objekScanner.nextLine();

                        if (ubahIndex < 0 || ubahIndex >= service.getSize()) {
                            System.out.println("Nomor tidak valid, silakan kembali ke menu.");
                            break;
                        }

                        System.out.print("Masukkan atasan baru: ");
                        String atasanBaru = objekScanner.nextLine();
                        System.out.print("Masukkan bawahan baru: ");
                        String bawahanBaru = objekScanner.nextLine();
                        System.out.print("Masukkan aksesoris baru: ");
                        String aksesorisBaru = objekScanner.nextLine();

                        System.out.print("Yakin mau mengubah outfit ini? (ya/tidak): ");
                        String ubah = objekScanner.nextLine();
                        if (ubah.equalsIgnoreCase("ya")) {
                            Outfit outfitUbah = new Outfit(atasanBaru, bawahanBaru, aksesorisBaru);
                            service.ubahOutfit(ubahIndex, outfitUbah);
                        } else if (ubah.equalsIgnoreCase("tidak")) {
                            System.out.println("Tidak jadi mengubah, silakan kembali ke menu.");
                        } else {
                            System.out.println("Input tidak valid, silakan kembali ke menu.");
                        }
                    }
                    break;

                case 4:
                    if (service.isEmpty()) {
                        System.out.println("Belum ada outfit untuk dihapus.");
                    } else {
                        service.lihatOutfit();
                        System.out.print("Pilih nomor outfit yang mau dihapus: ");
                        int hapusIndex = objekScanner.nextInt() - 1;
                        objekScanner.nextLine();

                        if (hapusIndex < 0 || hapusIndex >= service.getSize()) {
                            System.out.println("Nomor tidak valid, silakan kembali ke menu.");
                            break;
                        }

                        System.out.print("Yakin mau menghapus outfit ini? (ya/tidak): ");
                        String hapus = objekScanner.nextLine();
                        if (hapus.equalsIgnoreCase("ya")) {
                            service.hapusOutfit(hapusIndex);
                        } else if (hapus.equalsIgnoreCase("tidak")) {
                            System.out.println("Tidak jadi menghapus, silakan kembali ke menu.");
                        } else {
                            System.out.println("Input tidak valid, silakan kembali ke menu.");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Anda yakin mau keluar? (ya/tidak): ");
                    String yakin = objekScanner.nextLine();
                    if (yakin.equalsIgnoreCase("ya")) {
                        System.out.println("Terima kasih. Sampai bertemu lagi!");
                    } else if (yakin.equalsIgnoreCase("tidak")) {
                        System.out.println("Tidak jadi keluar, silakan kembali ke menu.");
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
