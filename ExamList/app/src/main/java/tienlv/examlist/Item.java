package tienlv.examlist;

public class Item {
    private String tilte, time, graduate;

    public Item(String tilte, String time, String graduate) {
        this.tilte = tilte;
        this.time = time;
        this.graduate = graduate;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }
}
