package booking;

import java.time.LocalDate;

public class StartEndDate {
    private LocalDate startDate;
    private LocalDate endDate;

    public StartEndDate(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StartEndDate() {
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

    @Override
    public String toString() {
        return "StartEndDate{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
