package OOPS;

public class StudID extends Student{
    public StudID(int rollno,String name,float marks){
        super(rollno,name,marks);
    }

    @Override
    void area(){
        System.out.println("This is child class");
    }
}
