package Assingment01;
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name +" address: "+ address +" phone: "+ phone +" email: "+email+
                " office: " +office +" salary: "+salary+" dateHired: "+dateHired;
    }
}