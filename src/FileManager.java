import java.io.*;
import java.util.*;

public class FileManager {

    public static void saveToFile(List<Course> courses, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Course c : courses) {
                writer.println(c.toString());
            }
            System.out.println("Data exported successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public static List<Course> loadFromFile(String fileName) {
        List<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                courses.add(new Course(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3]
                ));
            }
            System.out.println("Data imported successfully.");
        } catch (Exception e) {
            System.out.println("Error loading file.");
        }
        return courses;
    }
}
