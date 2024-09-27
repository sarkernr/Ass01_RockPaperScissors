import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String play1 = "";
        String play2 = "";

        System.out.println("Player 1, enter your move [RPS]: ");
        play1 = in.nextLine();
        System.out.println("Player 2, enter your move [RPS]: ");
        play2 = in.nextLine();

        if (play1.equalsIgnoreCase("R"))
            if (play2.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs. Rock, it's a TIE!");
            }
            else if (play2.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock, player 2 WINS!");
            }
            else if (play2.equalsIgnoreCase("S"))
            {
                System.out.println("Rock beats Scissors, player 1 WINS!");
            }

        else if (play1.equalsIgnoreCase("P"))
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player 1 WINS!");
                }
                else if (play2.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs. Paper, it's a TIE!");
                }
                else if (play2.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissor cuts Paper, Player 2 WINS!");
                }

        else if (play1.equalsIgnoreCase("S"))
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock beats Scissors, player 2 WINS!");
                }
                else if (play2.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissor cuts Paper, Player 1 WINS!");
                }
                else if (play2.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissor vs. Scissors, it's a TIE!");
                }
    }
}