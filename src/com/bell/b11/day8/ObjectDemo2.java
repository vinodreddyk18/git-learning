package com.bell.b11.day8;

import java.util.Objects;

public class ObjectDemo2 {

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        if (a==b)
            System.out.println("a and b are equal");
        else
            System.out.println("a and b are not equal");

        Hello h1 = new Hello(10,20);
        Hello h2 = new Hello(10, 20);

        if(h1==h2) {
            System.out.println("both h1 and h2 are same");
        }else{
            System.out.println("h1 and h2 are not same");
        }


        Student s1 = new Student(201, "Malli" );
        Student s2 = new Student(202, "Malli");

        if (s1.equals(s2)){
            System.out.println("Both Students are same");
        }else{
            System.out.println("Both Students are different");
        }

        if (s1.equals(s1)) {
            System.out.println("both are same");
        }else{
            System.out.println("both are different");
        }
    }
}

class Hello{

    int x, y;

    Hello(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Hello)) return false;
        Hello hello = (Hello) o;
        return x == hello.x &&
                y == hello.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Student{

    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}