import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        String[] studentsList = new String[numberOfStudents];
        int[] agesList = new int[numberOfStudents];
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student's name:");
            studentsList[i] = scanName.nextLine();
            System.out.println("Enter student's age:");
            agesList[i] = scanAge.nextInt();
        }

        for(int i = 0; i < numberOfStudents; i++) {
            if(agesList[i] >= 15) {
                System.out.println(studentsList[i] + " can receive the vaccine.");
                System.out.println("The student is " + agesList[i]);
            }
        }
        scanner.close();
        scanName.close();
        scanAge.close();
    }
}