import java.time.LocalDateTime;

class Attendance {
    LocalDateTime inTime;
    LocalDateTime outTime;
    Attendance(LocalDateTime inTime, LocalDateTime outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
    }

    LocalDateTime getInTime() {
        return inTime;
    }

    void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    LocalDateTime getOutTime() {
        return outTime;
    }

    void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }
}
