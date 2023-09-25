import java.util.Scanner;

public class marks_calculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of marks to enter: ");
        int numberOfMarks = inputScanner.nextInt();

        double total_marks = 0;

        for (int i = 1; i <= numberOfMarks; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            double subject_mark = inputScanner.nextDouble();
            total_marks = total_marks + subject_mark;
        }

        double averageMark = total_marks / numberOfMarks;

        System.out.println(" Result ");
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Average Mark: " + averageMark);

        inputScanner.close();
    }
}
