package model;

public class CasualOutfit extends Outfit {
    private String jalanJalan;

    public CasualOutfit(String atasan, String bawahan, String aksesoris, String jalanJalan) {
        super(atasan, bawahan, aksesoris);
        this.jalanJalan = jalanJalan;
    }

    public String getjalanJalan() {
        return jalanJalan;
    }

    public void setjalanJalan(String jalanJalan) {
        this.jalanJalan = jalanJalan;
    }
}
