import java.util.Scanner;

public class RockPaperScissors 
{
    static String getComputerChoice()
    {
        String computerChoice = "";

        double randomNumber = Math.floor((Math.random() * 10) + 1);

        while (randomNumber != 1 && randomNumber != 2 && randomNumber != 3)
            {
                randomNumber = Math.floor((Math.random() * 10) + 1);
            }
        
        randomNumber = (int)randomNumber;

        if (randomNumber == 1)
            {
                computerChoice = "Rock";
            }
        else if (randomNumber == 2)
            {
                computerChoice = "Paper";
            }
        else if (randomNumber == 3)
            {
                computerChoice = "Scissors";
            }
        
        return computerChoice;
    }

    static String playRound(String computerSelection, String playerSelection)
    {
        String result = "";

        if (playerSelection == computerSelection)
            {
                result = "It's a draw!";
            }
        if (playerSelection == "rock")
            {

            }

        if (playerSelection == "paper")
            {

            }

        if (playerSelection == "scissors")
            {

            }

        return result;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String playerSelection = "";
        String computerSelection = "";
        int computerScore = 0;
        int playerScore = 0;

        System.out.println("Lets play Rock, Paper, Scissors!");
        System.out.print("Rock, Paper, or Scissors? -> ");
        playerSelection = (input.nextLine()).toLowerCase();
        computerSelection = (getComputerChoice()).toLowerCase();
    }
}