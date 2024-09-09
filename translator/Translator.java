import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The Translator class loads a dictionary file and uses it to translate
 * text input based on word-to-word mappings.
 */
public final class Translator {

    /**
     * Regular expression to split the input text by words while converting
     * punctuation, such as apostrophes
     * 
     * @see <a href=
     *      "https://stackoverflow.com/questions/21672061/splitting-words-from-text-using-regex">StackOverflow</a>
     */
    private static final String WORD_SPLIT_REGEX = "(?:(?<![a-zA-Z])'|'(?![a-zA-Z])|[^a-zA-Z'])+";

    /**
     * Stores translations. Key is the word/phrase and value is its translation
     */
    private final Map<String, String> dictionary = new HashMap<>();

    /**
     * Loads the dictionary file and initializes translations. Each line in the file
     * should contain a word and its translation separated by " | ".
     * 
     * @param filePath the path to the dictionary file
     * @throws InvalidFileFormatException if the file format is invalid
     * @throws FileReadException          if the file cannot be read
     */
    public void loadDictionaryFromFile(String filePath) throws InvalidFileFormatException, FileReadException {
        try {
            for (final var line : Files.readAllLines(Paths.get(filePath))) {
                final var parts = line.split("\\|");
                if (parts.length != 2)
                    throw new InvalidFileFormatException(
                            "Invalid format in dictionary file: " + line + ". Expected 'word | translation'");

                dictionary.put(parts[0].trim().toLowerCase(), parts[1].trim());
            }
        } catch (IOException e) {
            throw new FileReadException("Unable to read the file: " + e.getMessage());
        }
    }

    /**
     * Translates input text based on the dictionary while handling punctuation.
     * 
     * @param inputText the text to translate
     * @return the translated text
     */
    public String translate(String inputText) {
        final var translationResult = new StringBuilder();

        for (final var word : inputText.split(WORD_SPLIT_REGEX))
            translationResult.append(dictionary.getOrDefault(word.toLowerCase(), word)).append(" ");

        return translationResult.toString().trim();
    }

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Enter the path to the dictionary file: ");
            final var dictionaryPath = scanner.nextLine();
            final var translator = new Translator();
            translator.loadDictionaryFromFile(dictionaryPath);
            System.out.println("Dictionary loaded successfully!");

            // Keep translating until the user enters "exit" or an exception is thrown
            while (true) {
                System.out.print("Enter text to translate (or type 'exit' to quit): ");
                final var inputText = scanner.nextLine();

                if (inputText.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                }

                final var translation = translator.translate(inputText);
                System.out.println("Translated text: " + translation);
            }
        } catch (InvalidFileFormatException | FileReadException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
