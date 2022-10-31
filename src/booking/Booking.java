package booking;

public class Booking {
    private int bookingId;
    private StartEndDate startEndDate;
    private Desk desk;

    public Booking(int bookingId, StartEndDate startEndDate, Desk desk) {
        this.bookingId = bookingId;
        this.startEndDate = startEndDate;
        this.desk = desk;
    }

    public Booking() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public StartEndDate getStartEndDate() {
        return startEndDate;
    }

    public void setStartEndDate(StartEndDate startEndDate) {
        this.startEndDate = startEndDate;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", startEndDate=" + startEndDate +
                ", desk=" + desk +
                '}';
    }
}
