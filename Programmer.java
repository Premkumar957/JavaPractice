//Inheritance
class Employee{
    public String name;
    public double workingDuration;



    Employee(String name, double workingDuration) {
        this.name = "name";
        this.workingDuration = workingDuration;
    }

    void showEmployeeDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee working duration: "+ workingDuration);
    }

    void sayHello() {
        System.out.println("Parent class called!");
    }

}


class Programmer extends Employee {
    int salary;

    Programmer(String name, double workingDuration, int salary) {
        super(name, workingDuration);
        this.salary = salary;
    }
    

    void showProgrammerDetails() {
        super.showEmployeeDetails();
        System.out.println("Programmer salary: "+ salary);
    }

    void sayHello() {
        System.out.println("Child class called");
    }

}


