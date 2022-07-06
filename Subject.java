import java.util.List;

public class Subject {
    private String name;
    private List<Student> students;
    private List<FinalGrade> finalGrades;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<FinalGrade> getFinalGrade() {
        return finalGrades;
    }

    public void setFinalGrade(List<FinalGrade> finalGrades) {
        this.finalGrades = finalGrades;
    }
}
