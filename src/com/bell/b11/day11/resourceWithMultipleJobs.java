package com.bell.b11.day11;

public class resourceWithMultipleJobs {

    public static void main(String[] args) {
        Address addr1 = new Address(12, "Chantilly", 20105);
        Employee emp1 = new Employee(01, "Siva", addr1);

        Address addr2 = new Address(13, "Aldie", 20166);
        Employee emp2 = new Employee(23, "Simha", addr2);

        Address addr3 = new Address(15, "Ashburn", 20148);
        Employee emp3 = new Employee(20, "Malli", addr3);

        Employee[] empArray1 = {emp1, emp2};
        Employee[] empArray2 = {emp2, emp3};

        Company c1 = new Company("WellsFargo", empArray1);
        Company c2 = new Company("BOFA", empArray2);

        resourceWithMultipleJobs(c1,c2);
    }

    public static void resourceWithMultipleJobs(Company c1, Company c2) {

        Employee[] firstCompanyEmp = c1.getEmployees();
        Employee[] secondCompanyEmp = c2.getEmployees();

        for (Employee e1 : firstCompanyEmp) {
            for (Employee e2 : secondCompanyEmp) {
                if (e1.getName().equals(e2.getName()) && e1.getAddress().equals(e2.getAddress())) {
                    System.out.println(e1.getName());
                }
            }
        }
    }
}
