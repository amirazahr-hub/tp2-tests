package zahr.amira;

import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.model.output.TokenUsage;

public class Test2Couts {
    public static void main(String[] args) {
        String cle = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleGenAiChatModel.builder()
                .apiKey(cle)
                .modelName("gemini-3.5-flash-lite")
                .temperature(0.7)
                .build();

        ChatRequest requete = ChatRequest.builder()
                .messages(UserMessage.from("Quelle est la capitale du Maroc ?"))
                .build();

        ChatResponse reponse = model.chat(requete);
        System.out.println(reponse.aiMessage().text());

        TokenUsage usage = reponse.metadata().tokenUsage();
        int entree = usage.inputTokenCount();
        int sortie = usage.outputTokenCount();
        System.out.println("Tokens en entrée : " + entree);
        System.out.println("Tokens en sortie : " + sortie);

        // Tarifs gemini-3.5-flash-lite (dollars par million de tokens)
        double cout = entree * 0.30 / 1_000_000 + sortie * 2.50 / 1_000_000;
        System.out.println("Coût de la requête : " + cout + " $");
        System.out.println("Requêtes similaires pour 1 $ : " + (1 / cout));
    }
}