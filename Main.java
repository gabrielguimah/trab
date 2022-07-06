import java.util.Arrays;

public class Main {
    
  public static void main(String[] args) {

    Subject subject_1 = new Subject("English");
    Student student_1 = new Student("Gabriel");
    Work work_1 = new Work(10, 8, subject_1);
    Test test_1 = new Test(10, 9, subject_1);
    FinalGrade finalGrade_1 = new FinalGrade(subject_1, student_1, Arrays.asList(work_1), Arrays.asList(test_1));
    String status_1 = finalGrade_1.studentStatus();
    System.out.println(student_1.getName() + status_1 + " | Final grade: " + finalGrade_1.calculateFinalGrade());

    Subject subject_2 = new Subject("Biology");
    Student student_2 = new Student("Gerson");
    Work work_2 = new Work(10, 4, subject_2);
    Test test_2 = new Test(10, 3, subject_2);
    FinalGrade finalGrade_2 = new FinalGrade(subject_2, student_2, Arrays.asList(work_2), Arrays.asList(test_2));
    String status_2 = finalGrade_2.studentStatus();
    System.out.println(student_2.getName() + status_2 + " | Final grade: " + finalGrade_2.calculateFinalGrade());
  }
}