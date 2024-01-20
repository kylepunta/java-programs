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
                if (computerSelection == "paper")
                    {
                        result = "You lose. Paper beats rock.";
                    }
                if (computerSelection == "scissors")
                    {
                        result = "You win! Rock beats scissors.";
                    }
            }

        if (playerSelection == "paper")
            {
                if (computerSelection == "rock")
                    {
                        result = "You win! Paper beats rock.";
                    }
                if (computerSelection == "scissors")
                    {
                        result = "You lose. Scissors beats paper.";
                    }
            }

        if (playerSelection == "scissors")
            {
                if (computerSelection == "rock")
                    {
                        result = "You lose. Rock beats scissors.";
                    }
                if (computerSelection == "paper")
                    {
                        result = "You win! Scissors beats paper.";
                    }
            }

        return result;
    }

    static void game()
    {
        Scanner input = new Scanner(System.in);

        String playerSelection = "";
        String computerSelection = "";
        int computerScore = 0;
        int playerScore = 0;
        String result = "";
        boolean playerWon = true;

        System.out.println("Lets play Rock, Paper, Scissors!");

        do 
        {
            System.out.print("Rock, Paper, or Scissors? -> ");
            playerSelection = (input.nextLine()).toLowerCase();
            computerSelection = (getComputerChoice()).toLowerCase();

            System.out.println("You chose " + playerSelection);
            System.out.println("Computer chose " + computerSelection);

            result = playRound(computerSelection, playerSelection);

            if (result.substring(0, 7) == "You win!")
                {
                    playerScore++;
                }
            else if (result.substring(0, 8) == "You lose.")
                {
                    computerScore++;
                }
            
            System.out.println(result);
            System.out.println("Computer " + computerScore + "-" + playerScore + " Player");
        } 
        while(computerScore != 3 && playerScore != 3);

        if (computerScore > playerScore)
            {
                System.out.println("Computer beats player " + computerScore + "-" + playerScore);
            }
        else if (playerScore > computerScore)
            {
                System.out.println("Player beats computer " + playerScore + "-" + computerScore);
            }
    }

    public static void main(String[] args) 
    {
        System.out.println("Let's play best of five of Rock, Paper, Scissors!");
        System.out.println();

        game();
    }
}