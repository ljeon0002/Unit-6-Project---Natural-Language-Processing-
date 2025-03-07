# Unit-6-Project---Natural-Language-Processing-

## Description
This project prompts the user in the console and parses user input. Based on the first "command" word found in the user input, the code returns a corresponding response. When the user exits the console, a summary of commands and responses are provided to the user.

## UML Diagram

ChatBot.java

==============================

Commands: ArrayList<String>

Responses: ArrayList<String>


===============================

ChatBot(String commandsFile, String responsesFile)

processInput(String userInput)

printSummary():




## NLP Techniques Used

Text Segmentation: This is accomplished in ChatBot.java in the processInput method, using .split to segment the user input by spaces in the text.

Stop Word Removal: Punctuation are designated as stop words and are removed using the .replaceAll method, as punctuation can introduce difficulty in text segmentation and are not necessary for searching for a command keyword in the user input.


## Video Demonstration
https://drive.google.com/file/d/1TMS3W4pK7k4gK7-88b43Cms3zML4TNpq/view?usp=sharing
