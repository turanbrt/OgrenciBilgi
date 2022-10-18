public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno,String branch ){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void printTeacher(){
        System.out.println("---------------------");
        System.out.println("İsim\t: "+ this.name);
        System.out.println("Telefon no\t: "+ this.mpno);
        System.out.println("Branş\t: "+ this.branch);

    }

}

