import java.util.ArrayList;
public class GrupaStudent {
    public String nazwa;
    public ArrayList<String> students;
    public static final int MAX_SIZE = 15;
    public GrupaStudent() {
        this.students = new ArrayList<>();
    }
    public void addStudent(String student) {
        if (students.size() >= MAX_SIZE) {
            throw new IllegalStateException("Grupa studencka jest pełna. Maksymalna liczba studentów to " + MAX_SIZE + ".");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student " + student + "jest już w tej grupie");
        }
        students.add(student);
    }






}
