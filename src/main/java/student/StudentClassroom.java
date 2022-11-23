package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentClassroom {

//Your application should be able to add students to the classroom
//View all students in the classroom
//View single student by name
//remove a student in the classroom
//view students with grade greater than 5
//view students with grade less than 5

    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Adding a student  to the classroom!");

        System.out.println("Please enter the students name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the grade of the student: ");
        float grade = intScanner.nextFloat();

        System.out.println("Please enter year of course: ");
        int yearOfCourse = intScanner.nextInt();


        Student student = new Student(name, grade, yearOfCourse);

        System.out.println(name + " added successfully");
    }

    public void listStudents() {
        System.out.println("Listing all students in the classroom! ");

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", grade:  " + student.grade);
        }
    }
    public void viewStudent() {
        System.out.println("Please enter the name of student to find ");
        int name = intScanner.nextInt();
        for (Student student : student) {
            if (student.name == name) {
                System.out.println("Name: " + student.name + " , grade " + student.grade);
                return;
            }
        }

        System.out.println("Student not found!");
    }
    public void removeStudent() {
        System.out.println("Please enter the name of the student to remove: ");

        String name = scanner.nextLine();

        for (Student student : students) {

            if (student.equals(name)) {
                int index = students.indexOf(student);
                students.remove(index);
                System.out.println("Student removed successfully!");
                return;
                }
            }
        }
        //View students with grade greater than 5
    public void viewHigherGrade() {
        Student viewHigherGrade = students.get(0);

        Student currentStudent = null;
        for (int i = 5; i < students.size(); i++) {
            currentStudent = students.get(i);
            if (currentStudent.grade > viewHigherGrade.grade) {

                viewHigherGrade = currentStudent;
            }
        }
        System.out.println("The most higher grade is: " + viewHigherGrade + " , grade: " + currentStudent);
    }
    public void viewLowerGrade() {
        Student viewLowerGrade = students.get(0);

        Student currentStudent = null;
        for (int i = 5; i >= students.size(); i++) {
            currentStudent = students.get(i);
            if (currentStudent.grade >= viewLowerGrade.grade) {

                viewLowerGrade = currentStudent;
            }
        }
        System.out.println("The lower grade is: " + viewLowerGrade(); + " , grade: " + currentStudent);
    }
}