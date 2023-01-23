
import java.util.Scanner; 
import java.util.Random;


class Game
{
    int user;
    int guesses;
    int ran; 

    Game()
    {
        Random r = new Random();
        ran = r.nextInt(100);  
    }

    // getter - setter for guesses 
    public int getGuess()
    {
        return guesses;
    }

    public void setGuess(int guesses)
    {
        this.guesses = guesses; 
    }  

    public void userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any Number : ");
        user = sc.nextInt();
    }  

    public boolean isCorrect()
    {
        guesses++; 
        if(user == ran)
        {
            System.out.println("Guessed Right in Attempts : " + guesses);
            return true;
        }

        else if(user > ran)
        {
            System.out.println("Too High");
            return false;
        }

        else 
        {
            System.out.println("Too Low ");
            return false;
        }
    }

}




public class Project_3 
{
    public static void main(String[] args) 
    {
        Game g = new Game();

        boolean f = false;
        while(!f)
        {
            g.userInput();

            f = g.isCorrect();
        }
    }    
}
