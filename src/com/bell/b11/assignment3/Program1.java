package com.bell.b11.assignment3;
import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        Scanner m2=new Scanner(System.in);
        System.out.println("Number of Students");
        int number=m2.nextInt();
        int id,count=1;
        String name;
        double fee;
        char section;
        Student[] g=new Student[number];
        for (int i=0; i<number; i++){
            System.out.println(" Enter Student " + count+ " ID" );
            id= m2.nextInt();
            m2.nextLine();
            System.out.println(" Enter Student " + count+ " Name ");
            name=m2.nextLine();
            System.out.println(" Enter Student "+ count + " Fee ");
            fee=m2.nextDouble();
            m2.nextLine();
            System.out.println(" Enter Student "+count+ " Scetion+ ");
            section = m2.next().charAt(0);
            count++;
            Student  stud=new Student(id, name, fee, section);
            g[i]=stud;
        }
        System.out.println("    Result      \n Id Name Fee Section" );
        for (int i=0; i<number; i++){
            System.out.println(g[i]);
        }
        m2.close();
    }
}
class Student{
    private int id;
    private String name;
    private double fee;
    private char section;

    Student(){

    }

    Student(int id, String name, double fee, char section){
        this.id= id;
        this.name=name;
        this.fee=fee;
        this.section=section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", section=" + section +
                '}';
    }
}
