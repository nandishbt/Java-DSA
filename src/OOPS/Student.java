package OOPS;

public class Student {
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    private int rollno;
    private String name;
    private float marks;
    final int goi = 150;
    private int strength = 50;

    public int getStrength() {
        return strength;
    }
    public void setStrength(int n){
        strength = n;
    }




    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public Student() {
        System.out.println("This is a Default Constructor");
    }
    public Student(Student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }
    void area(){
        System.out.println("This is Parent class");
    }


}
