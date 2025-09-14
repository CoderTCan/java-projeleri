package org.example;

public class Employee {
    public static void main(String[] args) {
        empdrivers emp1 = new empdrivers(2025, 3000, 60, "Ahmet");
        System.out.println("Tax: " + emp1.tax());
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Raisesalary: " + emp1.raisesalary());
        System.out.println("Information: " + emp1.information());
        System.out.println("Total salary: " + (emp1.salary+emp1.bonus()-emp1.tax()) );

    }

}
