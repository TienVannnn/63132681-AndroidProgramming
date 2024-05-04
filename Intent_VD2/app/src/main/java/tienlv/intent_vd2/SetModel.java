package tienlv.intent_vd2;

public class SetModel {
    private int img;
    private String tenMH;

    public SetModel(String tenMH, int img) {
        this.img = img;
        this.tenMH = tenMH;
    }

    public int getImg() {
        return img;
    }

    public String getTenMH() {
        return tenMH;
    }
}
