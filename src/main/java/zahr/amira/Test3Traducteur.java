package zahr.amira;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;

import java.util.Map;

public class Test3Traducteur {
    public static void main(String[] args) {
        String cle = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash")
                .temperature(0.7)
                .build();

        // Partie 1 : template avec UNE variable ({{it}})
        PromptTemplate template1 = PromptTemplate.from(
                "Traduis le texte suivant en anglais : {{it}}");
        Prompt prompt1 = template1.apply("Je voudrais un café, s'il vous plaît.");
        ChatResponse reponse1 = model.chat(prompt1.toUserMessage());
        System.out.println("Prompt 1 : " + prompt1.text());
        System.out.println(reponse1.aiMessage().text());

        // Partie 2 : template avec DEUX variables (langue et texte)
        PromptTemplate template2 = PromptTemplate.from(
                "Traduis le texte suivant en {{langue}} : {{texte}}");
        Prompt prompt2 = template2.apply(Map.of(
                "langue", "espagnol",
                "texte", "Je voudrais un café, s'il vous plaît."));
        ChatResponse reponse2 = model.chat(prompt2.toUserMessage());
        System.out.println("Prompt 2 : " + prompt2.text());
        System.out.println(reponse2.aiMessage().text());
    }
}