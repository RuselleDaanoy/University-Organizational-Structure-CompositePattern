public class UniversityOrgStructure {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "2023001", 50000);
        Student student2 = new Student("Bob", "2023002", 52000);
        Student student3 = new Student("Charlie", "2023003", 51000);

        Professors prof1 = new Professors("Prof. Ramos", "Java Programming", 80000);
        Professors prof2 = new Professors("Prof. Santos", "Databases", 75000);

        Department csDept = new Department("Computer Science");
        csDept.addUnit(prof1);
        csDept.addUnit(student1);
        csDept.addUnit(student2);

        Department itDept = new Department("Information Technology");
        itDept.addUnit(prof2);
        itDept.addUnit(student3);

        College csCollege = new College("College of Informatics and Computing Studies");
        csCollege.addUnit(csDept);
        csCollege.addUnit(itDept);

        csCollege.getDetails("");

        System.out.println("\nTotal Students in College: " + csCollege.getStudentCount());

        System.out.println("Total Budget of College: " + csCollege.getBudget());
    }
}
