package HWClass15;

public class Students {
    String name;
    int ID;
    static int numberOfStudents=0;

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Yana";
        student1.ID = 123;
        numberOfStudents++;

        Students student2 = new Students();
        student2.name = "Brandon";
        student2.ID = 456;
        numberOfStudents++;

        Students student3 = new Students();
        student3.name = "Zoya";
        student3.ID = 789;
        numberOfStudents++;

        System.out.println("Total number of students: " + numberOfStudents);
    }
}
