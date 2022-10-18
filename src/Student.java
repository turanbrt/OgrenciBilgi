public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    int stuNo;
    double avarage;
    boolean isPass=false;


    Student(String name,int stuNo,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

    }
    void addBulkExamnote(int n1,int n2,int n3){
        if(n1<=100 && n1>=0){
            this.c1.note=n1;
        }
        if(n2<=100 && n2>=0){
            this.c2.note=n2;
        }
        if(n3<=100 && n3>=0){
            this.c3.note=n3;
        }

    }
    void calcAvarage(){
        double n1,n2,n3;
        n1=((this.c1.note*(1-this.c1.noteEffect))+ (this.c1.exNote*this.c1.noteEffect) );
        n2=((this.c2.note*(1-this.c2.noteEffect))+ (this.c2.exNote*this.c2.noteEffect) );
        n3=((this.c3.note*(1-this.c3.noteEffect))+ (this.c3.exNote*this.c3.noteEffect) );
        this.avarage=(n1+n2+n3)/3;
        //this.avarage=(this.c1.note +this.c2.note + this.c3.note)/3;

    }
    void isPass(){
        this.calcAvarage();
        if(this.avarage>=50){
           isPass=true;
        }else {
            isPass=false;
        }
    }
    void printNote(){
        System.out.println("-------------");
        System.out.println("Öğrenci İsmi: "+this.name);
        System.out.println("Öğrenci No: "+this.stuNo);
        System.out.println(c1.name+" Notu:"+this.c1.note);
        System.out.println(c2.name+" Notu:"+this.c2.note);
        System.out.println(c3.name+" Notu:"+this.c3.note);
        isPass();
        if(this.isPass){
            System.out.println("Sınıfı Geçti...");
        }else{
            System.out.println("Sınıfı Geçemedi...");
        }
        System.out.println("Ortalam:" +this.avarage);


    }
}
