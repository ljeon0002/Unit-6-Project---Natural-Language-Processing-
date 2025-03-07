import java.util.Scanner;

/**
 * NLPRunner is the entry point for the ChatBot project.
 * Prompts the user for input and uses the ChatBot class to
 * process the sentence using basic natural language processing techniques.
 */
public class NLPRunner
{
    public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        
        // Create an instance of ChatBot, loading data from text files.
        ChatBot bot = new ChatBot("commands.txt", "responses.txt");
        
        // Main interaction loop with the user.
        while (true)
        {
            System.out.println("Enter a sentence to chat (or type 'exit' to quit): ");
            userInput = input.nextLine();
            
            // Exit condition based on user input.
            if (userInput.equalsIgnoreCase("exit"))
            {
                System.out.println("Goodbye!");
                break;
            }
            
            // Process user input to generate and display a response.
            bot.processInput(userInput);
        }
        
        // Print a summary of the ChatBot's loaded commands.
        bot.printSummary();
        
        input.close();
    }
}
   
   




   
   
   
   
  
