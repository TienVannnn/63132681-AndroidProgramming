package tienlv.customlistview_appfood;

public class Food {
    private String tenMonAn, moTa;
    private float donGia;
    private int idImage;

    public Food(String tenMonAn, float donGia, String moTa,  int idImage) {
        this.tenMonAn = tenMonAn;
        this.moTa = moTa;
        this.donGia = donGia;
        this.idImage = idImage;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
