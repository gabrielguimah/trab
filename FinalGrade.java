import java.util.List;

public class FinalGrade {

    private Subject subject;
    private Student student;
    private List<Work> works;
    private List<Test> test;

    public FinalGrade( Subject subject, Student student, List<Work> works, List<Test> test) {
        this.subject = subject;
        this.student = student;
        this.works = works;
        this.test = test;
    }
    
    public Number calculateFinalGrade() {
        Integer worksGrade = 0;
        Integer testGrade = 0;
        Integer workValue = 0;
        Integer testValue = 0;
        Integer finalValue = 0;
        Integer finalGrade = 0;
        for (Work work : this.getWorks()) {
             worksGrade += work.getGrade().intValue();
             workValue = work.getValue().intValue();
        }
        for (Test test : this.getTest()){
            testGrade += test.getGrade().intValue();
            testValue = test.getValue().intValue();
        }
        finalValue = (testValue + workValue)  / 2;
        finalGrade = testGrade + worksGrade;
        return worksGrade;
    }

    public String studentStatus(){
        Integer finalGrade = 0;
        finalGrade = this.getWorks().get(0).getGrade().intValue() + this.getTest().get(0).getGrade().intValue();
        if (finalGrade >= 7) {
            return ", congratulations, you were approved!";
        } else {
            return ", sadly you were not approved.";
        }
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public List<Test> getTest() {
        return test;
    }

    public void serTest(List<Test> test) {
        this.test = test;
    }
}
