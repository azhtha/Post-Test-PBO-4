package model;

public class FormalOutfit extends Outfit {
    private String acara;

    public FormalOutfit(String atasan, String bawahan, String aksesoris, String acara) {
        super(atasan, bawahan, aksesoris);
        this.acara = acara;
    }

    public String getAcara() {
        return acara;
    }

    public void setAcara(String acara) {
        this.acara = acara;
    }
}
