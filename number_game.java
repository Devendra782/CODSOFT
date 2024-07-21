import java.util.Random;
import java.util.Scanner;

public class game{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times you want to play the game: ");
        int times = sc.nextInt();


        for(int i=1;i<=times;i++){
        playGame();
        }
    }

    public static void playGame() {
        Random random = new Random();
        int a = random.nextInt(100) + 1; //nextInt(1,100) is not a valid method, use nextInt(100) + 1 instead

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of attempts you want to play: ");
        int times = sc.nextInt();

        for(int i=1;i<=times;i++){
            System.out.print("Enter your number : ");
            int number = sc.nextInt();

            if(number == a) {
                System.out.println("Congratulations ! You guess the right number");
                break;
            } else if (a>number) {
                System.out.println("You entered smaller number");
            }else if (a<number) {
                System.out.println("You entered larger number");
            }else {
                System.out.println("you guess the wrong number");
            }
        }
    }
}