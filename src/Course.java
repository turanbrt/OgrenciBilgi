
public class Course {
    Teacher teacher;
    String name;
    String prefix;
    int note=0;
    int exNote=0;
    double noteEffect=0;

    int code;

    Course(String name, String prefix,int code,int exNote,double noteEffect){
        this.name=name;
        this.prefix=prefix;
        this.code=code;
        this.exNote=exNote;
        this.noteEffect=noteEffect;

    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
        }else {
            System.out.println("Ders ve Öğretmen branşları uyuşmuyor.");
        }


    }
    void PrintTeacherInfo(){
        this.teacher.printTeacher();

    }

}
