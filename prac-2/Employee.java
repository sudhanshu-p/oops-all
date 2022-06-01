import java.time.format.DateTimeFormatter;

class Employee {
    String name;
    int id;
    int age;
    String designation;
    int salary;
    Attendance [][] attendance;
    int totalDays;

    Employee (String name, int id, int age, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.attendance = new Attendance[12][10];
        this.totalDays = 0;
    }
    void setAttendance(Attendance attendance, int month, int day) {
        this.attendance[month - 1][day - 1] = attendance;
    }
    Attendance getAttendance(int month, int day) {
        return attendance[month - 1][day - 1];
    }

    void printAttendance() {
        int workingDays = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println ("Name: " + name);
        System.out.println ("ID: " + id);
        System.out.println ("Age: " + age);
        System.out.println ("Designation: " + designation);
        System.out.println ("Salary: " + salary);
        System.out.println ("Attendance: ");
        System.out.println ("-------------------------------");
        for (int i = 0; i < 12; i++) {
            System.out.println ("Month: " + (i + 1));
            System.out.println ("-------------------------------");
            for (int j = 0; j < 10; j++) {
                if(attendance [i][j] != null) {
                    System.out.println ("Day: " + (j + 1));
                    System.out.println ("In Time: " + attendance[i][j].getInTime().format(formatter));
                    System.out.println ("Out Time: " + attendance[i][j].getOutTime().format(formatter));
                    System.out.println ("Working Hours: " + (attendance[i][j].getOutTime().getHour() - attendance[i][j].getInTime().getHour()));
                    System.out.println ("-------------------------------");
                    workingDays ++;
                }
            }
            System.out.println ("Working Days: " + workingDays);
            System.out.println ("-------------------------------");
            totalDays += workingDays;
            workingDays = 0;
        }
        System.out.println("Total Working Days in the year: " + totalDays);
    }
}