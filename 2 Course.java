class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;

    Course(String courseName ){
        this.courseName=courseName;
        this.enrollments=0;
    }

    String[] enrollStudents=new String[maxCapacity];


    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    void enrollStudent(String studentName){
        enrollStudents[enrollments]=studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }


}
