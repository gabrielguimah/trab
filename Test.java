public class Test {

    private Integer value;
    private Integer grade;
    private Subject subject;

    public Test(Integer value, Integer grade, Subject subject) {
        this.value = value;
        this.grade = grade;
        this.subject = subject;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject disciplina) {
        this.subject = disciplina;
    }
}
