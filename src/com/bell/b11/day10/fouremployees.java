package com.bell.b11.day10;
import java.util.Scanner;
public class fouremployees {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Employees");
        int count = scan.nextInt();

        employee[] empArray = new employee[count];
        employee emp = null;

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Employee " + i + "details");
            System.out.println("Rnter Id");
            int id = scan.nextInt();
            System.out.println("Enter Name");
            String name = scan.next();
            System.out.println("Enter Salary");
            double salary = scan.nextDouble();


            emp = new employee(id, name, salary);
            empArray[i] = emp;
        }

        double highestSalary = 0;

        String Name = null;
        for (employee emp1 : empArray) {
            if (highestSalary < emp1.getSalary()) {
                highestSalary = emp1.getSalary();
                Name = emp1.getName();

                System.out.println(Name + " has the Highest salary");
            }

        }
    }

    private static class employee {
        int id;
        String name;
        double salary;

        employee() {

        }

        public employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
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

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}

