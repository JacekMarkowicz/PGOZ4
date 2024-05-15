import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        student st= new student();
        st.FirstName = "Michal";
        st.LastName = "Wierzchowski";
        st.adres = "Tarczyn słoneczna 32";
        st.IndexNumber = 1;
        st.email = "MIchalW@spoko.pl";
        st.grades = new ArrayList<>();
        st.grades.add(3.0);
        st.grades.add(4.0);
        st.grades.add(5.0);
        st.grades.add(3.5);
        st.grades.add(4.5);
        try {
            double srednia = st.calculateAverage();
            System.out.println("średnia = " + srednia);
        }catch(IllegalArgumentException e){
            System.out.println("Błąd: " + e.getMessage());
        }
        GrupaStudent grupa = new GrupaStudent();
        try {
            grupa.addStudent("Tomek Janisiewicz");
            grupa.addStudent("Milena Nowak");
            grupa.addStudent("Mariusz ptyś");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}