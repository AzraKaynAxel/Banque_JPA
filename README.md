# BANQUE_JPA — Projet JPA (Exercices) 🌱

## Description 📋

**Résumé** 📝: Ce dépôt contient un petit projet Maven d'exercices JPA visant à créer des entités et tester la persistance. Le contenu ci‑dessous détaille les étapes déjà réalisées et comment lancer les vérifications locales.

**Prérequis** ✅:
- **Code**: structure de projet Java/Maven prête.
- **Configuration du pom.xml**: en fonction de vos besoin
- **Configuration JPA**: `persistence.xml` présent dans `src/main/resources/META-INF` (et copié dans `target/classes/META-INF` après compilation) ⚙️.


## Détails des étapes à réalisées 🚧

### Réalisation sur la branche *`class/CreationEntites`*
- **1) Implémentation des classes entités** 🧩:
  - définition des classes abstraites
  - classes concrètes
  - Chaque entité utilise des annotations JPA pour la persistance (`@Entity`, `@Inheritance`, `@Id`, etc.),

*voir `src/main/java/fr/diginamic/entites`* 🏦.

- **2) Test de démarrage** ▶️: ajout d'une classe de test/runner `TestBaseDeDonnees.java` qui charge l'EntityManagerFactory et effectue des opérations CRUD simples pour valider le mapping et la connexion à la base.

*voir `src/main/java/fr/diginamic`* 🏦.

### Réalisation sur la branche *`feature/instantiationEntites`*
- **1) Joindre les tables** 🧩:
  - Utilisation des annotations JoinTable

*voir `src/main/java/fr/diginamic/entites`* 🏦.

- **1) Insertion en BDD** 🧩:
  - Faire Exemple ex = new Exemple sur tout les entites
  - Ensuite faire les perisiste en base de donnée

*voir `src/main/java/fr/diginamic`* 🏦.

______

### Réalisation sur la branche *`feature/LogBack`*
- **1) Configuration de la journalisation (Logback)** 📊:
  - Mise en place du fichier `logback.xml` pour configurer les appenders (console et fichier).
  - Configuration des niveaux de log par package :
    - `fr.diginamic` : niveau INFO avec sortie console
    - `org.hibernate` : niveau ERROR pour réduire le bruit
    - `fr.diginamic.service` : niveau DEBUG avec sortie fichier `app.log`
  - Pattern de log standardisé : 
    - `%d{HH:mm:ss.SSS}` Pour l'heure 
    - `[%thread]` sur quelle sujet(runtime)
    - `%-5level` le type de log sur 5c
    - `%logger{36}` le log sur 36c
    - `- %msg%n` le message du log

*voir `src/main/resources/logback.xml`* 📝.

- **2) Classe AppService pour les logs DEBUG** 🔧:
  - Créée la classe `AppService` dans le package `fr.diginamic.service`
  - Utilise SLF4J pour la journalisation
  - Contient la méthode `executer(String param)` qui génère des logs de débogage
  - Les logs DEBUG sont enregistrés dans le fichier `app.log`

*voir `src/main/java/fr/diginamic/service/AppService.java`* 🏦.

____

## Structure du dépôt (raccourci) 📂
- [src/main/java](src/main/java/): code source Java principal, packages [TestBDD](src/main/java/fr/diginamic) et [Entities](src/main/java/fr/diginamic/entities/).
- [persistence.xml](src/main/resources/META-INF/persistence.xml): configuration JPA.
- [logback.xml](src/main/resources/logback.xml) : configuration des LOG.
- **`target/`**: sortie de compilation (classes, resources packaging).
- **pom.xml**: configuration Maven du projet. (pas de raccourcis pour celui-ci)

## Fichiers importants 🧾
- **`src/main/java/fr/diginamic/TestBaseDeDonnees.java`**: classe pour tester la base de données et la persistance.
- **`src/main/java/fr/diginamic/entites/*`**: les entités JPA (voir la liste plus haut).
- **`src/main/java/fr/diginamic/service/AppService.java`**: classe service utilisant SLF4J pour traiter les logs DEBUG.
- **`src/main/resources/META-INF/persistence.xml`**: unité de persistence utilisée par le projet.
- **`src/main/resources/logback.xml`**: configuration Logback pour la journalisation (console et fichier `app.log`).



---------------------
Remarques:
- Si les tests utilisent une base embarquée (H2, Derby) la configuration doit être présente dans `persistence.xml`.
- Si vous utilisez une base externe, vérifiez les paramètres de connexion et le driver dans le classpath.

**Contact / Notes** ✉️:
- Pour modifications supplémentaires (nouvelles entités, relations, ou migration), créez une nouvelle branche et ouvrez une PR.

# Auteur ✍️
AzraKayn/Axel