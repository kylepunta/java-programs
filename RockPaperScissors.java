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

        return result;
    }

    public static void main(String[] args) 
    {
        
    }
}