import java.time.LocalDateTime;

public class AttendanceGenerator {
    public static void main(String[] args) {
        Employee e = new Employee("Sudhanshu", 66, 19, "Lead Developer", 55000);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 1, 1, 9, 0), LocalDateTime.of(2019, 1, 1, 16, 52)), 1, 1);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 1, 2, 9, 10), LocalDateTime.of(2019, 1, 2, 17, 3)), 1, 2);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 1, 3, 9, 20), LocalDateTime.of(2019, 1, 3, 16, 41)), 1, 3);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 1, 4, 9, 05), LocalDateTime.of(2019, 1, 4, 17, 26)), 1, 4);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 2, 8, 9, 23), LocalDateTime.of(2019, 2, 8, 17, 7)), 2, 8);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 2, 3, 9, 18), LocalDateTime.of(2019, 2, 3, 17, 9)), 2, 3);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 3, 1, 9, 7), LocalDateTime.of(2019, 3, 1, 16, 37)), 3, 1);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 4, 2, 8, 54), LocalDateTime.of(2019, 4, 2, 17, 30)), 4, 2);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 8, 3, 9, 9), LocalDateTime.of(2019, 8, 3, 15, 32)), 8, 3);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 9, 7, 9, 8), LocalDateTime.of(2019, 9, 7, 18, 25)), 9, 7);
        e.setAttendance(new Attendance(LocalDateTime.of(2019, 5, 5, 10, 0), LocalDateTime.of(2019, 5, 5, 17, 0)), 5, 5);
        e.printAttendance();
        

    }
}
