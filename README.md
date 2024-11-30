# Projet de Suite de Fibonacci

Ce projet démontre deux méthodes pour calculer la suite de Fibonacci en Java : une approche itérative et une approche récursive. Il inclut également une classe utilitaire pour mesurer le temps d'exécution de ces méthodes.

## Structure du projet

- `src/utils/FibonacciRecursive.java` : Contient la classe `FibonacciRecursive` qui calcule la suite de Fibonacci en utilisant une méthode récursive.
- `src/utils/FibonaciClassique.java` : Contient la classe `FibonaciClassique` qui calcule la suite de Fibonacci en utilisant une méthode itérative.
- `src/com.projet.fibonacci.FibonacciApp.java` : La classe principale qui exécute le programme, compare le temps d'exécution des deux méthodes et affiche les résultats.

## Utilisation

1. **Cloner le dépôt** :
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Compiler le projet** :
    ```sh
    javac -d bin src/utils/*.java src/com.projet.fibonacci.FibonacciAppnacciApp.java
    ```

3. **Exécuter le projet** :
    ```sh
    java -cp bin com.projet.fibonacci.FibonacciAppnacciApp
    ```

4. **Suivre les instructions** pour entrer le nombre de termes de la suite de Fibonacci que vous souhaitez calculer.

## Exemple de sortie

```
Entrez le nombre de termes de la suite de Fibonacci à afficher :
10
----------------------------------------
Suite de Fibonacci avec la méthode classique :
0 1 1 2 3 5 8 13 21 34
Durée de la méthode classique : 10 microsecondes
----------------------------------------
----------------------------------------
Suite de Fibonacci avec la méthode récursive :
0 1 1 2 3 5 8 13 21 34
Durée de la méthode récursive : 500 microsecondes
----------------------------------------
----------------------------------------
La méthode classique pour calculer 10 termes de la suite de Fibonacci est plus rapide que la méthode récursive.
----------------------------------------
```

## Licence

Ce projet est sous licence MIT.
