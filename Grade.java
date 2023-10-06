
// Java Program to Enter Marks of Five Subjects and Calculate Total, Percentage, and Grade
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        // store the values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

        float total;
        float percentage;
        char grade;

        // Calculate total and percentage
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        percentage = (float) ((total / 500.0) * 100);

        // calculate the Grade
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80 && percentage < 90)
            grade = 'B';
        else if (percentage >= 70 && percentage < 80)
            grade = 'C';
        else if (percentage >= 60 && percentage < 70)
            grade = 'D';
        else
            grade = 'E';

        // final output
        System.out.println("\nThe Total marks   = " + total++);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}