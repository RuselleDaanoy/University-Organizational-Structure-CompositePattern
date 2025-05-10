import java.util.ArrayList;
import java.util.List;

public class Department implements AcademicFramework {
    private String name;
    private List<AcademicFramework> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(AcademicFramework unit) {
        units.add(unit);
    }

    @Override
    public void getDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (AcademicFramework unit : units) {
            unit.getDetails(indent + "  ");
        }
    }

    @Override
    public int getStudentCount() {
        return units.stream().mapToInt(AcademicFramework::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return units.stream().mapToDouble(AcademicFramework::getBudget).sum();
    }
}
