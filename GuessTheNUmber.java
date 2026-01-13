import java.util.Scanner;
import java.util.Random;

class Guess{
    private int computer;
    private int user;
    private int chances;

    public Guess(){
        Random rc = new Random();
        computer = rc.nextInt(100);
        chances = 0;

    }

    public void userinput(int x) {
        user = x;
        chances++;
    }

    public  boolean correctNum(){
        if(user>computer){
            System.out.println("you have netered a larger number");
            return false;
        }else if(user<computer){
            System.out.println("you have enetred a smaller number");
            return false;
        }else{
            System.out.println("you guessed the number right");
            System.out.println("the number of chances take" + chances);
            return true;
        }

    }
}



public class  GuessTheNUmber {
    public static void main(String args[]) {
        Guess player = new Guess();
        Scanner sc = new Scanner(System.in);
        boolean win = false;

        while (!win) {
            System.out.println("enetr the number");
            int n = sc.nextInt();
            player.userinput(n);
            win =  player.correctNum();
        }
        sc.close();
    }
}
