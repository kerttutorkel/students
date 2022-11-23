import student.StudentClassroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Build a commandline application that tracks students in a classroom.
        //student should have :
        //Name
        //grade
        //course

        //You application should be able to add students to the classroom
        //View all students in the classroom
        //View single student by name
        //remove a student in the classroom
        //view students with grade greater than 5
        //view students with grade less than 5
        System.out.println("Welcome to the student classroom, what would you like to do today?");
        Scanner scanner = new Scanner(System.in);

        StudentClassroom studentClassroom = new StudentClassroom();


        String input = "";
        do {
            System.out.println("""
                    1. Add a student
                    2. List all students
                    3. View single student by name
                    4. Remove student 
                    5. View students with grade greater than 5
                    6. View students with grade less than 5
                    """);
            input = scanner.nextLine();

            switch (input) {
                case "quit":
                    System.out.println("Exiting application");
                    break;
                case "1":
                    studentClassroom.addStudent();
                    break;
                case "2":
                    studentClassroom.listStudents();
                    break;
                case "3":
                    studentClassroom.viewStudent();
                    break;
                case "4":
                    studentClassroom.removeStudent();
                    break;
                case "5":
                    studentClassroom.viewHigherGrade();
                    break;
                case "6":
                    studentClassroom.viewLowerGrade();
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;

            }

        } while (!input.equals("quit"));
    }
}
