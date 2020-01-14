package objectarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Array of Student class
        Student []students = new Student[3];
        //Scanner object
        Scanner scanner = new Scanner(System.in);
        //to assign input to students objects
        for(int i = 0; i< students.length; i ++){
            students[i] = new Student();
            
            System.out.print("Enter Student Id :  ");
            int sid = scanner.nextInt();
            students[i].setStudentId(sid);
            System.out.print ("Enter Name :  ");
            String name = scanner.next();
            students[i].setName(name);        
        }
        System.out.println("");
        System.out.println("Student Information : ");
        for (Student student : students) {
            student.showDetails();
        }
    }
}
