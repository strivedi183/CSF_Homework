import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        Random generator = new Random();
        students.add("Kevin");
        students.add("Ernie");
        students.add("Marine");
        students.add("Granger");
        students.add("Shirley");
        students.add("Fred");
        students.add("Rachel");
        students.add("Mandeep");
        students.add("Hunter");
        students.add("TJ");
        printRandomPartner(students);
    }

    public static void printRandomPartner(ArrayList students) {
        for (int i = 0; i < students.size(); i+=2) {
            System.out.println(students.get(i) + " " + students.get(i + 1));
        }
    }
}
