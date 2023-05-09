package HWClass15;

public class SyntaxEmployee {
    int empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = 123;
        emp1.salary = 80000.0;

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empID = 456;
        emp2.salary = 90000.0;

        System.out.println("Employee 1 - ID: " + emp1.empID + ", Salary: $" + emp1.salary + ", CEO: " + CEO);
        System.out.println("Employee 2 - ID: " + emp2.empID + ", Salary: $" + emp2.salary + ", CEO: " + CEO);
    }
}
