import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\Asus\\Downloads\\students.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                Student student = new Student();
                student.setName(scanner.next());
                student.setSurname(scanner.next());
                student.setAge(Integer.parseInt(scanner.next()));
                student.setGender(Boolean.parseBoolean(scanner.next()));
                students.add(student);
            }

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
