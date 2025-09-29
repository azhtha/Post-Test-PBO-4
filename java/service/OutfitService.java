package service;

import model.Outfit;
import model.CasualOutfit;
import model.FormalOutfit;
import java.util.ArrayList;

public class OutfitService {
    private ArrayList<Outfit> outfits = new ArrayList<>();

    public OutfitService() {
        outfits.add(new CasualOutfit("Cardigan Pink", "Celana Biru", "Pashmina Abu", "Jalan-jalan"));
        outfits.add(new FormalOutfit("Kemeja Putih", "Celana Hitam", "Dasi Merah", "Meeting"));
    }

    public void tambahOutfit(Outfit outfit) {
        outfits.add(outfit);
        System.out.println("Outfit berhasil ditambah!");
    }

    public void tambahOutfit(String atasan, String bawahan, String aksesoris) {
        outfits.add(new CasualOutfit(atasan, bawahan, aksesoris, "Santai"));
        System.out.println("Outfit casual berhasil ditambah lewat overloading!");
    }

    public void lihatOutfit() {
        if (outfits.isEmpty()) {
            System.out.println("(Belum ada outfit)");
        } else {
            for (int i = 0; i < outfits.size(); i++) {
                Outfit outfit = outfits.get(i);
                System.out.println((i + 1) + ". " + outfit.tampilkanOutfit());
            }
        }
    }

    public void ubahOutfit(int index, Outfit outfitBaru) {
        if (index >= 0 && index < outfits.size()) {
            outfits.set(index, outfitBaru);
            System.out.println("Outfit berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    public void hapusOutfit(int index) {
        if (index >= 0 && index < outfits.size()) {
            outfits.remove(index);
            System.out.println("Outfit berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    public boolean isEmpty() {
        return outfits.isEmpty();
    }

    public int getSize() {
        return outfits.size();
    }
}
