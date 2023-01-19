/**
 * This class +++ Insert class description here+++
 * @author Khalil
 */
//comment
import java.util.*;
public class Student_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] sList = new Student[5];
        String name;
        int ID;
        for (int i=0;i<=4;i++){
            System.out.println("Enter a student name");
            name = sc.next();
            System.out.println("enter the student's ID");
            ID = sc.nextInt();
            sList[i] = new Student(name,ID);
        }
        for(int i=0;i<=4;i++){
           System.out.println(sList[i].toString());
        }
    }

}
