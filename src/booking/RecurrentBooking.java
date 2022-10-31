package booking;

import java.time.LocalDate;

public class RecurrentBooking {
    private int recurrentId;
    private LocalDate startDate;
    private LocalDate endDate;




    public RecurrentBooking(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public RecurrentBooking() {
    }

    public int getRecurrentId() {
        return recurrentId;
    }

    public void setRecurrentId(int recurrentId) {
        this.recurrentId = recurrentId;
    }

    public Booking makeRecurrentBooking(LocalDate startDate, LocalDate endDate, int recurringInterval){
        Desk desk = new Desk(1,"Desk-100");
        while(startDate.isBefore(endDate)){
            RecurrentBooking recurrentBooking = new RecurrentBooking(startDate, startDate);
            startDate = startDate.plusDays(recurringInterval);
            System.out.println(recurrentBooking);
        }
        StartEndDate startEndDate = new StartEndDate(startDate, endDate);
        return new Booking(1, startEndDate, desk);
    }

    @Override
    public String toString() {
        return "RecurrentBooking{" +
                "recurrentId=" + recurrentId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
