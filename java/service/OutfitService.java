package service;

import model.Outfit;
import java.util.ArrayList;

public class OutfitService {
    private ArrayList<Outfit> outfits = new ArrayList<>();

    public OutfitService() {
        outfits.add(new Outfit("cardigan pink", "celana biru", "pashmina abu"));
        outfits.add(new Outfit("baju mofusand", "celana putih", "pashmina pink"));
        outfits.add(new Outfit("kemeja pink", "celana jeans", "pashmina biru"));
    }

    public void tambahOutfit(Outfit outfit) {
    for (Outfit outfitLama : outfits) {
        if (outfitLama.getAtasan().equalsIgnoreCase(outfit.getAtasan()) &&
            outfitLama.getBawahan().equalsIgnoreCase(outfit.getBawahan()) &&
            outfitLama.getAksesoris().equalsIgnoreCase(outfit.getAksesoris())) {
            System.out.println("Outfit sudah ada, tidak bisa ditambahkan lagi!");
            return;
        }
    }

    outfits.add(outfit);
    System.out.println("Outfit berhasil ditambah!");
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
            for (int i = 0; i < outfits.size(); i++) {
                if (i != index) {
                    Outfit outfitLama = outfits.get(i);
                    if (outfitLama.getAtasan().equalsIgnoreCase(outfitBaru.getAtasan()) &&
                        outfitLama.getBawahan().equalsIgnoreCase(outfitBaru.getBawahan()) &&
                        outfitLama.getAksesoris().equalsIgnoreCase(outfitBaru.getAksesoris())) {
                        System.out.println("Outfit sudah ada!");
                        return;
                    }
                }
            }

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
