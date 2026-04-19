import java.util.*;

public class CourseManager {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        for (Course c : courses) {
            System.out.println(c.getId() + ". " + c.getName() +
                    " | " + c.getDate() + " | " + c.getTime());
        }
    }

    public void updateCourse(int id, String name, String date, String time) {
        for (Course c : courses) {
            if (c.getId() == id) {
                c.setName(name);
                c.setDate(date);
                c.setTime(time);
                System.out.println("Updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void deleteCourse(int id) {
        courses.removeIf(c -> c.getId() == id);
        System.out.println("Deleted successfully.");
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
