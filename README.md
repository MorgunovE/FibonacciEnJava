# Projet de Suite de Fibonacci

Ce projet démontre deux méthodes pour calculer la suite de Fibonacci en Java : une approche itérative et une approche récursive. Il inclut également une classe utilitaire pour mesurer le temps d'exécution de ces méthodes.

## Structure du projet

- `src/main/java/com/projet/fibonacci/app/FibonacciApp.java` : La classe principale qui exécute le programme, compare le temps d'exécution des deux méthodes et affiche les résultats.
- `src/main/java/com/projet/fibonacci/controleur/ControleurFibonacci.java` : Contrôleur pour la gestion des calculs de la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/erreur/FibonacciException.java` : Exception personnalisée pour les erreurs liées à la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/erreur/InputException.java` : Exception personnalisée pour les erreurs d'entrée utilisateur.
- `src/main/java/com/projet/fibonacci/modele/CalculateurFibonacci.java` : Interface pour le calcul de la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/modele/FibonacciIteratif.java` : Classe pour le calcul itératif de la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/modele/FibonacciRecursif.java` : Classe pour le calcul récursif de la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/service/FibonacciService.java` : Service pour la gestion des calculs de la suite de Fibonacci.
- `src/main/java/com/projet/fibonacci/service/LecteurEntree.java` : Interface pour la lecture des entrées utilisateur.
- `src/main/java/com/projet/fibonacci/service/LecteurScanner.java` : Implémentation de LecteurEntree utilisant un Scanner pour lire les entrées.
- `src/main/java/com/projet/fibonacci/util/Chronometre.java` : Classe pour mesurer la durée d'exécution en microsecondes.
- `src/main/java/com/projet/fibonacci/validation/ValidateurEntree.java` : Classe pour valider les entrées utilisateur.
- `src/main/java/com/projet/fibonacci/vue/FormatteurSortie.java` : Classe pour formater et afficher la suite de Fibonacci.

## Tests

- `src/test/java/com/projet/fibonacci/integration/ControleurFibonacciTest.java` : Classe de test pour ControleurFibonacci.
- `src/test/java/com/projet/fibonacci/integration/FibonacciAppTest.java` : Classe de test pour FibonacciApp.
- `src/test/java/com/projet/fibonacci/performance/ChronometreTest.java` : Classe de test pour Chronometre.
- `src/test/java/com/projet/fibonacci/unit/FibonacciIteratifTest.java` : Classe de test pour FibonacciIteratif.
- `src/test/java/com/projet/fibonacci/unit/FibonacciRecursifTest.java` : Classe de test pour FibonacciRecursif.
- `src/test/java/com/projet/fibonacci/unit/FibonacciServiceTest.java` : Classe de test pour FibonacciService.
- `src/test/java/com/projet/fibonacci/unit/ValidateurEntreeTest.java` : Classe de test pour ValidateurEntree.

## Utilisation

1. **Cloner le dépôt** :
    ```sh
    git clone https://github.com/MorgunovE/FibonacciEnJava
    cd FibonacciEnJava
    ```

2. **Compiler le projet** :
    ```sh
    mvn compile
    ```

3. **Exécuter le projet** :
    ```sh
    mvn "-Dexec.mainClass=com.projet.fibonacci.app.FibonacciApp" exec:java
    ```

4. **Tester le projet** :
    ```sh
    mvn test
    ```

5. **Vérifier le style de code avec Checkstyle** :
    ```sh
    mvn checkstyle:check
    ```

## Exemple de sortie

```
Entrez le nombre de termes de la suite de Fibonacci à afficher :
10
----------------------------------------
Suite de Fibonacci avec la méthode itérative :
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
Durée de la méthode itérative : 10 microsecondes
----------------------------------------
----------------------------------------
Suite de Fibonacci avec la méthode récursive :
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
Durée de la méthode récursive : 500 microsecondes
----------------------------------------
----------------------------------------
La méthode itérative pour calculer 10 termes de la suite de Fibonacci est plus rapide que la méthode récursive.
----------------------------------------
```

## Licence

Ce projet est sous licence MIT.