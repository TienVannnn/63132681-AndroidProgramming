package ntu_63132681.cau2_weatherinfomationapp;

public class Weather {
    String tenTP, moTaThoiTiet, doC;
    int image;

    public Weather(String tenTP, String moTaThoiTiet, String doC, int image) {
        this.tenTP = tenTP;
        this.moTaThoiTiet = moTaThoiTiet;
        this.doC = doC;
        this.image = image;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public String getMoTaThoiTiet() {
        return moTaThoiTiet;
    }

    public void setMoTaThoiTiet(String moTaThoiTiet) {
        this.moTaThoiTiet = moTaThoiTiet;
    }

    public String getDoC() {
        return doC;
    }

    public void setDoC(String doC) {
        this.doC = doC;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
