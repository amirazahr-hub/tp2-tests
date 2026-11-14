# IA.md - Utilisation de l'IA pour le TP 2 

Outil utilisé : Claude (Anthropic).
Transparence : j'ai utilisé l'IA dans trois cas : (1) quand j'avais un problème de création ou de configuration, (2) quand j'avais des erreurs dans le code, (3) pour gagner du temps : l'IA a complété les classes à partir du code et des consignes du professeur, et je lui ai donné les résultats de mes exécutions pour qu'elle rédige un brouillon d'email, que j'ai ensuite relu et validé. J'ai lancé et testé moi-même chaque programme. Les utilisations sont listées ci-dessous.

---

## 1. Type de projet pour les tests
**Problème rencontré :** Je ne savais pas quel projet IntelliJ créer (j'avais choisi Jakarta EE Web avec Payara).
**Raison de l'utilisation de l'IA :** Ne pas me tromper de configuration au départ.
**Prompt utilisé :** « je veux quand realise se tp commencant etape par etape » + capture de la fenêtre « New Project ».
**Réponse de l'IA :** Les tests demandent un projet Java ordinaire avec Maven ; le projet Web vient plus tard.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 2. Clé d'API
**Problème rencontré :** Je me demandais s'il fallait une nouvelle clé Gemini.
**Raison de l'utilisation de l'IA :** Éviter une configuration inutile.
**Prompt utilisé :** « la meme cle du tp1 ou cree une nouvelle car j avais deja fais sa pour tp1 »
**Réponse de l'IA :** La clé est liée au compte, pas au TP ; on la lit avec System.getenv (variable GEMINI_KEY).
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 3. Origine du code proposé
**Problème rencontré :** Je ne savais pas si le code de Test1 venait du TP ou de l'IA.
**Raison de l'utilisation de l'IA :** Respecter les consignes du professeur sans rien ajouter.
**Prompt utilisé :** « d ou tu vient du code du tp ou tu invente »
**Réponse de l'IA :** « Franchement, un mélange » : le code de Test1 était écrit par l'IA, puis vérifié dans la Javadoc officielle.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 4. Lignes rouges dans la console
**Problème rencontré :** Des avertissements s'affichaient en rouge alors que le programme se terminait bien.
**Raison de l'utilisation de l'IA :** Savoir si c'était une erreur.
**Prompt utilisé :** « mais pourquoi les truc en rouges »
**Réponse de l'IA :** Ce n'est pas une erreur : IntelliJ affiche en rouge tout ce qui sort sur stderr ; « exit code 0 » signifie que tout s'est bien passé.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 5. Erreur de compilation dans Test4Embeddings
**Problème rencontré :** Après avoir mis en commentaire la dépendance bge-small, le projet ne compilait plus.
**Raison de l'utilisation de l'IA :** Je ne comprenais pas pourquoi Test4 bloquait Test5.
**Prompt utilisé :** Capture de l'erreur « package ...bgesmallenv15 does not exist ».
**Réponse de l'IA :** IntelliJ compile tout le projet ; Test4Embeddings utilisait une classe de la dépendance mise en commentaire.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 6. Interface AssistantMeteo
**Problème rencontré :** Je ne savais pas si AssistantMeteo était une classe.
**Raison de l'utilisation de l'IA :** Comprendre ce que je devais créer.
**Prompt utilisé :** « ses quoi sa un class ou quoi AssistantMeteo.java »
**Réponse de l'IA :** C'est une interface ; LangChain4j en fournit l'implémentation avec AiServices.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 7. Package de MeteoTool
**Problème rencontré :** Je voulais vérifier que le package zahr.amira.outil.meteo était demandé.
**Raison de l'utilisation de l'IA :** Respecter exactement la consigne.
**Prompt utilisé :** « est ce que ses mentionner en cour de creer le package zahr.amira.outil.meteo »
**Réponse de l'IA :** Oui, le cours indique le package « outil.meteo » avec le préfixe de mon projet.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.

## 8. Lecture des logs avec les deux outils
**Problème rencontré :** Les logs étaient très longs et je devais expliquer les échanges avec Gemini.
**Raison de l'utilisation de l'IA :** Je ne savais pas repérer qui envoie quoi.
**Prompt utilisé :** Collage des consoles de Test7Outils (questions Paris et Zzyzx).
**Réponse de l'IA :** Un tableau des échanges requête/réponse et le nombre de tokens de chaque réponse.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS, après avoir relu les logs moi-même.

## 9. Email du TP
**Problème rencontré :** L'email demande beaucoup de résultats à rassembler.
**Raison de l'utilisation de l'IA :** Gagner du temps : je lui ai donné les résultats de mes exécutions et elle a généré un brouillon, que j'ai relu et validé.
**Prompt utilisé :** « si sa marche redige moi l email du tp test en respectant les instructions demandé par le prof »
**Réponse de l'IA :** Un brouillon d'email avec les résultats de mes consoles.
**Ce que j'ai appris :** À REFORMULER AVEC MES PROPRES MOTS.
