import java.util.ArrayList;

/**
 * ChatBot uses basic natural language processing techniques to analyze user input
 * and generate responses. It loads command keywords and corresponding responses from
 * text files into ArrayLists.
 */
public class ChatBot {
    private ArrayList<String> commands;  // ArrayList holding command keywords from the file.
    private ArrayList<String> responses; // ArrayList holding responses corresponding to each command.

    /**
     * Constructs a ChatBot object by loading command keywords and responses from text files.
     * 
     * Preconditions: The files exist and contain one entry per line.
     * Postconditions: The commands and responses ArrayLists are populated with the file data.
     */
  
    public ChatBot(String commandsFile, String responsesFile) {
        commands = FileReader.toStringList(commandsFile);
        responses = FileReader.toStringList(responsesFile);
    }

    /**
     * Processes the user input by segmenting the sentence and checking for commands.
     * If a command is found in the input, the corresponding response is printed.
     * Otherwise, an error message is displayed.
     */
    public void processInput(String userInput)
  {
        // Convert input to lowercase and split the sentence into words.
        String[] tokens = userInput.toLowerCase().split(" ");
        boolean commandFound = false;
        
        // Loop through each token in the user's input.
        for (int i = 0; i < tokens.length; i++)
        {
            String token = tokens[i];
            // Remove any punctuation so only letters remain.
            token = token.replaceAll("[^a-zA-Z]", "");
            
            // Check if the token matches any command in the commands ArrayList.
            for (int j = 0; j < commands.size(); j++)
            {
                String command = commands.get(j).toLowerCase();
                if (token.equals(command))
                {
                    // If a command is found, output the corresponding response.
                    System.out.println("Bot: " + responses.get(j));
                    commandFound = true;
                    break; // Stop checking further commands.
                }
            }
            
            // Process only the first recognized command per input.
            if (commandFound)
            {
                break;
            }
        }
        
        // If no commands match, output error
        if (!commandFound)
        {
            System.out.println("Bot: I'm not sure how to respond to that.");
        }
    }

    /**
     * Prints a summary of the loaded commands and their corresponding responses.
     * This method iterates through the ArrayLists and displays each command–response pair.
     *
     * Preconditions: The commands and responses ArrayLists are populated.
     * Postconditions: A summary is printed to the console.
     */
    public void printSummary()
  {
        System.out.println("\nChatBot Summary:");
        for (int i = 0; i < commands.size(); i++)
        {
            System.out.println("Command: " + commands.get(i) + " | Response: " + responses.get(i));
        }
        System.out.println();
    }
}
