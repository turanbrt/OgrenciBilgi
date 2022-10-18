public class main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Cabbar","5465555844","YZLM");
        Teacher t2=new Teacher("Mutlu","054265454","ELK");
        Teacher t3=new Teacher("Ahmet","054654854","İMG");

        Course c1=new Course("PROGRAMLAMA","YZLM",101,80,0.2);
        Course c2=new Course("ELEKTRONİK","ELK",101,70,0.25);
        Course c3=new Course("GÖRÜNTÜLEME","İMG",205,100,0.10);

        Student s1=new Student("Turan",123,c1,c2,c3);
        Student s2=new Student("Berna",456,c1,c2,c3);
        Student s3=new Student("Furkan",789,c1,c2,c3);

        s1.addBulkExamnote(100,50,75);
        s1.printNote();
        s2.addBulkExamnote(80,50,90);
        s2.printNote();
        s3.addBulkExamnote(100,20,30);
        s3.printNote();


        c1.addTeacher(t1);
        c1.PrintTeacherInfo();
        c2.addTeacher(t2);
        c2.PrintTeacherInfo();
        c3.addTeacher(t3);
        c3.PrintTeacherInfo();


    }
}
