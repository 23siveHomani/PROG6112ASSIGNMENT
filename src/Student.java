import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(String studentId, String name, int age, String email, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public static void captureStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("************************");

        System.out.print("Enter the student id: ");
        String studentId = scanner.nextLine();

        System.out.print("En" +
                "" +
                "" +
                "" +
                "" +
                "Enter the student name: ");
        String name = scanner.nextLine();

        int age = 0;
        while (true) {
            System.out.print("Enter the student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 16) {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter the student age >>");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter the student age >>");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        students.add(new Student(studentId, name, age, email, course));
        System.out.println("Student details have been successfully saved.");
    }

    public static void searchStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter the id to search: ");
        String searchId = scanner.nextLine();

        for (Student student : students) {
            if (student.studentId.equals(searchId)) {
                System.out.println("----------------------------------");
                System.out.println("STUDENT ID: " + student.studentId);
                System.out.println("STUDENT NAME: " + student.name);
                System.out.println("STUDENT AGE: " + student.age);
                System.out.println("STUDENT EMAIL: " + student.email);
                System.out.println("STUDENT COURSE: " + student.course);
                System.out.println("---------------------------------------");
                return;
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Student with Student Id: " + searchId + " was not found!");
        System.out.println("----------------------------------");
    }

    public static void deleteStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter the student id to delete: ");
        String deleteId = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId.equals(deleteId)) {
                System.out.print("Are you sure you want to delete student " + deleteId + " from the system? Yes (y) to delete No (n) to cancel: ");
                String confirmation = scanner.nextLine().toLowerCase();

                if (confirmation.equals("y")) {
                    students.remove(i);
                    System.out.println("--------------------------------------------");
                    System.out.println("Student with STUDENT ID: " + deleteId + " WAS DELETED!!");
                    System.out.println("--------------------------------------------");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                return;
            }
        }

        System.out.println("Student with Student Id: " + deleteId + " was not found!");
    }

    public static void studentReport(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("STUDENT " + (i + 1));
            System.out.println("---------------------------------------");
            System.out.println("STUDENT ID: " + student.studentId);
            System.out.println("STUDENT NAME: " + student.name);
            System.out.println("STUDENT AGE: " + student.age);
            System.out.println("STUDENT EMAIL: " + student.email);
            System.out.println("STUDENT COURSE: " + student.course);
            System.out.println("---------------------------------------");
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }
}