public class Student {
    String name, studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean doesPass;

    Student(String name, int classes, String studentNo, Course math, Course physics, Course chemistry ){
        this.name = name;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        this.doesPass = false;

    }
    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }
    public void addBulkPerformanceNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.performanceGrade = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.performanceGrade = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.performanceGrade = chemistry;
        }

    }
    public void calculateAverage(){
        this.average = ((((this.math.note) * 0.8) + (this.math.performanceGrade) * 0.2) + (((this.physics.note) * 0.8) + (this.physics.performanceGrade) * 0.2) + (((this.chemistry.note) * 0.8) + (this.chemistry.performanceGrade) * 0.2)) / 3;
    }

    public boolean isDoesPass(){
        calculateAverage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=======================");
        System.out.println("Student: " + this.name);
        System.out.println("Mathematics: " + ((this.math.note * 0.8) + (this.math.performanceGrade) * 0.2) + " Exam Note: " + this.math.note + " Performance grade: " + this.math.performanceGrade);
        System.out.println("Physics: " + ((this.physics.note * 0.8) + (this.physics.performanceGrade) * 0.2) + " Exam Note: " + this.physics.note + " Performance grade: " + this.physics.performanceGrade);
        System.out.println("Chemistry: " + ((this.chemistry.note * 0.8) + (this.chemistry.performanceGrade) * 0.2) + " Exam Note: " + this.chemistry.note + " Performance grade: " + this.chemistry.performanceGrade);
    }
    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 || this.math.performanceGrade == 0 || this.physics.performanceGrade == 0 || this.chemistry.performanceGrade == 0) {
            System.out.println("The student have not been graded yet.");
        } else {
            this.doesPass = isDoesPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.doesPass) {
                System.out.println("The student passed the class.");
            } else {
                System.out.println("The student have failed the class.");
            }
        }
    }
}
