import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseManager manager = new CourseManager();
        Admin admin = new Admin();

        int choice;

        do {
            admin.showMenu();

            try {
                System.out.print("Choose option: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter course name: ");
                        String name = scanner.nextLine();

                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty!");
                            break;
                        }

                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();

                        System.out.print("Enter time (HH:MM): ");
                        String time = scanner.nextLine();

                        manager.addCourse(new Course(id, name, date, time));
                        break;

                    case 2:
                        manager.viewCourses();
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int uid = Integer.parseInt(scanner.nextLine());

                        System.out.print("New name: ");
                        String uname = scanner.nextLine();

                        System.out.print("New date: ");
                        String udate = scanner.nextLine();

                        System.out.print("New time: ");
                        String utime = scanner.nextLine();

                        manager.updateCourse(uid, uname, udate, utime);
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int did = Integer.parseInt(scanner.nextLine());
                        manager.deleteCourse(did);
                        break;

                    case 5:
                        FileManager.saveToFile(manager.getCourses(), "courses.csv");
                        break;

                    case 6:
                        manager.setCourses(FileManager.loadFromFile("courses.csv"));
                        break;

                    case 7:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Try again.");
                choice = 0;
            }

        } while (choice != 7);

        scanner.close();
    }
}