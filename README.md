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
_____________

## Structure du dépôt (raccourci) 📂
- **`src/main/java`**: code source Java principal, packages `fr.diginamic` et `fr.diginamic.entites`.
- **`src/main/resources/META-INF/persistence.xml`**: configuration JPA.
- **`target/`**: sortie de compilation (classes, resources packaging).
- **pom.xml**: configuration Maven du projet. (pas de raccourcis pour celui-ci)

## Fichiers importants 🧾
- **`src/main/java/fr/diginamic/TestBaseDeDonnees.java`**: classe pour tester la base de données et la persistance.
- **`src/main/java/fr/diginamic/entites/*`**: les entités JPA (voir la liste plus haut).
- **`src/main/resources/META-INF/persistence.xml`**: unité de persistence utilisée par le projet.



---------------------
Remarques:
- Si les tests utilisent une base embarquée (H2, Derby) la configuration doit être présente dans `persistence.xml`.
- Si vous utilisez une base externe, vérifiez les paramètres de connexion et le driver dans le classpath.

**Contact / Notes** ✉️:
- Pour modifications supplémentaires (nouvelles entités, relations, ou migration), créez une nouvelle branche et ouvrez une PR.

# Auteur ✍️
AzraKayn/Axel