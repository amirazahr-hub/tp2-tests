package zahr.amira;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.embedding.EmbeddingModel;
// Modèle intégré : mis en commentaire car la dépendance bge-small est
// en commentaire dans pom.xml (conflit avec easy-rag, Test 5)
// import dev.langchain4j.model.embedding.onnx.bgesmallenv15.BgeSmallEnV15EmbeddingModel;
import dev.langchain4j.model.google.genai.GoogleGenAiEmbeddingModel;
import dev.langchain4j.store.embedding.CosineSimilarity;

import java.time.Duration;

public class Test4Embeddings {

    static final String[][] COUPLES = {
            {"Le chat dort sur le canapé.", "Un chat fait la sieste sur le sofa."},
            {"Il fait très chaud aujourd'hui.", "Il fait très froid aujourd'hui."},
            {"J'adore le chocolat.", "Je déteste le chocolat."},
            {"La voiture roule vite sur l'autoroute.", "L'automobile circule rapidement sur la route."},
            {"Je vais au marché acheter des légumes.", "Les ordinateurs quantiques utilisent des qubits."},
            {"Le Maroc est un pays d'Afrique du Nord.", "Rabat est la capitale du Maroc."}
    };

    static double similarite(EmbeddingModel modele, String s1, String s2) {
        Embedding e1 = modele.embed(s1).content();
        Embedding e2 = modele.embed(s2).content();
        return CosineSimilarity.between(e1, e2);
    }

    static void tester(String nom, EmbeddingModel modele) {
        System.out.println("=== " + nom + " ===");
        for (String[] couple : COUPLES) {
            double sim = similarite(modele, couple[0], couple[1]);
            System.out.println(sim + "  |  " + couple[0] + "  /  " + couple[1]);
        }
    }

    public static void main(String[] args) {
        // Modèle intégré (gratuit en tokens, entraîné sur de l'anglais)
        // EmbeddingModel integre = new BgeSmallEnV15EmbeddingModel();
        // tester("BgeSmallEnV15 (intégré)", integre);

        // Modèle externe de Google
        String cle = System.getenv("GEMINI_KEY");
        EmbeddingModel google = GoogleGenAiEmbeddingModel.builder()
                .apiKey(cle)
                .modelName("gemini-embedding-001")
                .taskType(GoogleGenAiEmbeddingModel.TaskTypeEnum.SEMANTIC_SIMILARITY)
                .timeout(Duration.ofSeconds(10))
                .build();
        tester("gemini-embedding-001 (Google)", google);
    }
}