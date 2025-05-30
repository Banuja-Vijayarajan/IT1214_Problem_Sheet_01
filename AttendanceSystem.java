public class AttendanceSystem {

 
    static class Student {
        private int studentId;
        private String name;
        private int daysAttended;

        public Student(int studentId, String name, int daysAttended) {
            this.studentId = studentId;
            this.name = name;
            this.daysAttended = daysAttended;
        }

        public int getStudentId() {
            return studentId;
        }
        public String getName() {
            return name;
        }

        public int getDaysAttended() {
            return daysAttended;
        }
        public void setDaysAttended(int daysAttended) {
            this.daysAttended = daysAttended;
        }
        public String toString() {
            return "ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended;
        }
    }


        public void displayStudents() {
            System.out.println("Student List:");
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
            }
     }
    }


    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        classroom.addStudent(new Student(101, "Alice Smith", 12));
        classroom.addStudent(new Student(102, "Bob Jones", 15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.updateAttendance(102, 16);
        classroom.updateAttendance(104, 8);

       
 }
}
