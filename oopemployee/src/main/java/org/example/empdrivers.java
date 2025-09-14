package org.example;

public class empdrivers {
    public double hireyear;
    public double salary;
    public int workhours;
    public String employeename;


    empdrivers(int hireyear, double salary, int workhours, String employeename) {
        this.hireyear = hireyear;
        this.salary = salary;
        this.workhours = workhours;
        this.employeename = employeename;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0.0;
        }
        else if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }
    public int bonus() {
        return (this.workhours-40)*30;
    }

    public double raisesalary(){
        if((2025-this.hireyear)<10){
            return this.salary*0.05;
        }
        else if (10<=(2025- this.hireyear) && (2025-this.hireyear) <20) {
            return this.salary*0.1;
        }
        else{
            return this.salary*0.15;
        }
    }

    public String information() {
        return this.employeename;



    }


}
