public class StudentInfoSystem {
    public static void main(String[] args) {
        Course math = new Course("Math","MATH101","MATH");
        Course physics = new Course("Physics","PHY101","PHY");
        Course chemistry = new Course("Chemistry", "CHE101","CHE");

        Teacher one = new Teacher("James Cameron", "0546464646","MATH");
        Teacher two = new Teacher("Tom Hanks", "05654646284","PHY");
        Teacher three = new Teacher("Abuzer Kömürcü", "0578979213134","CHE");

        math.addTeacher(one);
        physics.addTeacher(two);
        chemistry.addTeacher(three);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkPerformanceNote(70,50,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkPerformanceNote(100,50,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkPerformanceNote(60, 50, 60);
        s3.isPass();
    }
}
