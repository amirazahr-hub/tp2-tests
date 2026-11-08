package zahr.amira;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;

public class Test1 {
    public static void main(String[] args) {
        String cle = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash")
                .temperature(0.7)
                .build();

        // Test A : l'heure
        System.out.println("Question 1 : Quelle heure est-il ?");
        System.out.println(model.chat("Quelle heure est-il ?"));

        // Test B : ton nom, en 2 questions séparées
        System.out.println("Question 2 : Bonjour, je m'appelle Amira Zahr.");
        System.out.println(model.chat("Bonjour, je m'appelle Amira Zahr."));

        System.out.println("Question 3 : Comment je m'appelle ?");
        System.out.println(model.chat("Comment je m'appelle ?"));
    }
}