public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax(){
        if(this.salary > 1000){
            return (this.salary * 3/100);
        }
        else{
            return 0;
        }
    }
    public int bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }
        return 0;
    }
    public int raiseSalary(){
        if((2021 - this.hireYear) < 10){
            return this.salary * 5 / 100;
        }
        else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20){
            return this.salary * 10 / 100;
        }
        else if ((2021 - this.hireYear) >= 20){
            return this.salary * 15 /100;
        }
        return 0;
    }
    public void tostring(){
        System.out.println("Employee\'s name: " + this.name);
        System.out.println("Employee\'s salary: " + this.salary);
        System.out.println("Employee\'s work hours: " + this.workHours);
        System.out.println("Employee\'s hire year: " + this.hireYear);
        System.out.println("Employee\'s tax: " + this.tax());
        System.out.println("Employee\'s bonus: " + this.bonus());
        System.out.println("Employee\'s income rise: " + this.raiseSalary());
        System.out.println("Employee\'s income with bonuses and payed tax: " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Employee\'s income with rise: " + (this.salary + this.raiseSalary()));
    }

}
