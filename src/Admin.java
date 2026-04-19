public class Admin extends User {

    @Override
    public void showMenu() {
        System.out.println("\n--- Course Schedule Organizer ---");
        System.out.println("1. Add Course");
        System.out.println("2. View Courses");
        System.out.println("3. Update Course");
        System.out.println("4. Delete Course");
        System.out.println("5. Export to File");
        System.out.println("6. Import from File");
        System.out.println("7. Exit");
    }
}