public class Professors implements AcademicFramework {
    private String name;
    private String subject;
    private double salary;

    public Professors(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void getDetails(String indent) {
        System.out.println(indent + "-Professor: " + name);
        System.out.println(indent + indent + "Subject: " + subject);
        System.out.println(indent + indent + "Salary: " + salary + "\n");
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}
