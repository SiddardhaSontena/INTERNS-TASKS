import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleChatbot {
    private static Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hello", "Hi there!");
        responses.put("how are you", "I'm doing well, thank you!");
        responses.put("your name ", "i am a chatbot ready to help you!");
        responses.put("climate condition", "IT's hot today 36 degree!");
        responses.put("hey chatbot how is your day", "I don't have personal experiences or feelings like humans!");
        responses.put("my name", "your name is siddhu");
        responses.put("will you be my assistent", "Of course! I'm here to assist you with any questions or tasks you have. Just let me know what you need help with, and I'll do my best to assist you.");
        responses.put("bye", "Goodbye! Have a great day!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a simple chatbot. How can I assist you today?");

        while (true) {
            String input = scanner.nextLine().toLowerCase();
            String response = getResponse(input);
            System.out.println(response);

            if (input.equals("bye")) {
                break;
            }
        }

        scanner.close();
    }

    private static String getResponse(String input) {
        for (Map.Entry<String, String> entry : responses.entrySet()) {
            Pattern pattern = Pattern.compile(entry.getKey());
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                return entry.getValue();
            }
        }
        return "I'm sorry, I don't understand.";
    }
}