package booking;

public class Desk {
    private int deskId;
    private String ddeskname;
    private int counter = 1;

    public Desk(int deskId, String ddeskname) {
        this.ddeskname = ddeskname;
        this.deskId = deskId;

    }

    public Desk() {
    }

    public int getDeskId() {
        return deskId;
    }

    public void setDeskId(int deskId) {
        this.deskId = deskId;
    }

    public String getDdeskname() {
        return ddeskname;
    }

    public void setDdeskname(String ddeskname) {
        this.ddeskname = ddeskname;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "deskId=" + deskId +
                ", ddeskname='" + ddeskname + '\'' +
                '}';
    }
}
