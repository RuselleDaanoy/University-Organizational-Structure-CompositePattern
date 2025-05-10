public class Student implements AcademicFramework {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void getDetails(String indent) {
        System.out.println(indent + "-Student: " + name);
        System.out.println(indent + indent + "ID: " + studentID);
        System.out.println(indent + indent + "Tuition Fee: " + tuitionFee + "\n");
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }
}
