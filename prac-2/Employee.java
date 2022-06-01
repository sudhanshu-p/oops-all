class Employee {
    String name;
    int id;
    int age;
    String designation;
    int salary;
    Attendance [][] attendance;

    Employee (String name, int id, int age, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        attendance = new Attendance[12][10];
    }
    void setAttendance(Attendance attendance, int month, int day) {
        this.attendance[month - 1][day - 1] = attendance;
    }
    Attendance getAttendance(int month, int day) {
        return attendance[month - 1][day - 1];
    }

    void printAttendance() {
        System.out.println ("Name: " + name);
        System.out.println ("ID: " + id);
        System.out.println ("Age: " + age);
        System.out.println ("Designation: " + designation);
        System.out.println ("Salary: " + salary);
        System.out.println ("Attendance: ");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if(attendance [i][j] != null) {
                    System.out.println ("-------------------------------");
                    System.out.println ("Month: " + (i + 1));
                    System.out.println ("Day: " + (j + 1));
                    System.out.println ("In Time: " + attendance[i][j].getInTime());
                    System.out.println ("Out Time: " + attendance[i][j].getOutTime());
                }
            }
        }
    }
}