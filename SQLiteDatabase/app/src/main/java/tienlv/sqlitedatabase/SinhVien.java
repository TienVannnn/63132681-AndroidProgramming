package tienlv.sqlitedatabase;

public class SinhVien {
    private int id;
    private String ten, lop, hocluc;

    public SinhVien(int id, String ten, String lop, String hocluc) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.hocluc = hocluc;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getHocluc() {
        return hocluc;
    }
}
