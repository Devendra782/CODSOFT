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

        int sum = Mathematics + Physics + Chemistry + English + Hindi ;
        double Avg_Percentage = sum/5 ;

        System.out.println("Total Marks : " + sum);
        System.out.println("Average Percentage : " + Avg_Percentage);

        if(Avg_Percentage>=90) {
            System.out.println("Grade : A+");
        }else if(Avg_Percentage>=80) {
            System.out.println("Grade : A");
        }else if(Avg_Percentage>=70) {
            System.out.println("Grade : B+");
        }else if(Avg_Percentage>=60) {
            System.out.println("Grade : B");
        }else if(Avg_Percentage>=50) {
            System.out.println("Grade : C+");
        }else if(Avg_Percentage>=40) {
            System.out.println("Grade : C");
        }else if(Avg_Percentage>=33) {
            System.out.println("Grade : D+");
        }else if(Avg_Percentage>=0) {
            System.out.println("Grade : D");
        }

    }
    
}
