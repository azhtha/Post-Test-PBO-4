package model;

public class Outfit {
    private String atasan;
    private String bawahan;
    private String aksesoris;

    public Outfit(String atasan, String bawahan, String aksesoris) {
        this.atasan = atasan;
        this.bawahan = bawahan;
        this.aksesoris = aksesoris;
    }

    public String getAtasan() {
        return atasan;
    }

    public void setAtasan(String atasan) {
        this.atasan = atasan;
    }

    public String getBawahan() {
        return bawahan;
    }

    public void setBawahan(String bawahan) {
        this.bawahan = bawahan;
    }

    public String getAksesoris() {
        return aksesoris;
    }

    public void setAksesoris(String aksesoris) {
        this.aksesoris = aksesoris;
    }

    public String tampilkanOutfit() {
        return atasan + ", " + bawahan + ", " + aksesoris;
    }

}



