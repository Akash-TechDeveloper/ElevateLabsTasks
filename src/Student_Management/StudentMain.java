package Student_Management;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Student Record Management");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: manager.addStudent(); break;
                case 2: manager.viewStudents(); break;
                case 3: manager.updateStudent(); break;
                case 4: manager.deleteStudent(); break;
                case 5: manager.sortStudentsByMarks(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
