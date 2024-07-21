import java.util.Scanner ;

public class student_grade_calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter marks of Mathematics : ");
        int Mathematics = sc.nextInt() ;

        System.out.print("Enter marks of Physics : ");
        int Physics = sc.nextInt() ;

        System.out.print("Enter marks of Chemistry : ");
        int Chemistry = sc.nextInt() ;

        System.out.print("Enter marks of English : ");
        int English = sc.nextInt() ;

        System.out.print("Enter marks of Hindi : ");
        int Hindi = sc.nextInt() ;

        double sum = Mathematics + Physics + Chemistry + English + Hindi ;
        double averagePercentage = sum/5 ;

        char grade ;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("Total Marks : " + sum);
        System.out.println("Average Percentage : " + averagePercentage);
        System.out.println("Grade : " + grade);


    }
    
}
