package model;

public class CasualOutfit extends Outfit {
    private String tempatSantai;

    public CasualOutfit(String atasan, String bawahan, String aksesoris, String tempatSantai) {
        super(atasan, bawahan, aksesoris);
        this.tempatSantai = tempatSantai;
    }

    public String getTempatSantai() {
        return tempatSantai;
    }

    public void setTempatSantai(String tempatSantai) {
        this.tempatSantai = tempatSantai;
    }

    @Override
    public String tampilkanOutfit() {
        return "[Casual] " + getAtasan() + " + " + getBawahan() + " + " + getAksesoris()
                + " (Santai di: " + tempatSantai + ")";
    }
}
