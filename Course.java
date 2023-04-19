public class Course {
    Teacher courseTeacher;
    String name, code, prefix;
    int note, performanceGrade;
    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performanceGrade = 0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println(t.name + " has been attended to this course.");
        }
        else {
            System.out.println(t.name + "cannot be attended to this course.");
        }
    }
    public void printTeacher(){
        if(courseTeacher == null){
            System.out.println("No teacher has been attended yet.");
        }
        else {
            System.out.println(this.courseTeacher + " has been attended to " + this.name);
        }
    }
}
