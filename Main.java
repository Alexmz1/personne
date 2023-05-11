public class Main {
    public static void main(String[] args) {
        /*
         * Lorsque l'on déclare une variable de type objet, on dit que l'on fait une INSTANCIATION
         * Un objet est une INSTANCE d'une classe
         */
        Personne p = new Personne("Anne", "Onyme", 50);  // Premier constructeur
        // p.prenom = "Anne";
        // p.nom = "Onyme";
        // p.age = 50;
        
        System.out.println("Nom : " + p.nom);
        System.out.println("Prénom : " + p.prenom);
        System.out.println("Age : " + p.gatAge());


        System.out.println(p.identite());

        Personne p1 = new Personne("Jean", "Cérien");  // Deuxième constructeur 
        // p1.prenom = "Jean";
        // p1.nom = "Cérien";
        p1.setAge(25);
        System.out.println("Identité de p1 : " + p1.identite());

        /* 
         * EXERCICES : 
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées dans exempleArray.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         *		et comment le déclarer)

         String[][] personnes = new String[10][3];
                    personnes[0] = new String[] { "Menfin", "Gérad", "35" };
                    personnes[1] = new String[] { "Ateur", "Nordine", "20" };
                    personnes[2] = new String[] { "Onyme", "Anne", "50" };
                    personnes[3] = new String[] { "Mentor", "Gérard", "61" };
                    personnes[4] = new String[] { "Neymar", "Jean", "15" };
                    personnes[5] = new String[] { "Cérien", "Jean", "42" };
                    personnes[6] = new String[] { "Mal", "Roger", "70" };
                    personnes[7] = new String[] { "Kiafessa", "Estelle", "22" };
                    personnes[8] = new String[] { "Salah", "Mo", "30" };
                    personnes[9] = new String[] { "Bar", "Laurent", "47" };
         */

        Personne[] tableauPersonnes = new Personne[10]; // Déclaration du tableau avec sa taille

        for (int i = 0; i < tableauPersonnes.length; i++) {
            tableauPersonnes[i] = new Personne();
        }
        
        tableauPersonnes[0] = new Personne();
        tableauPersonnes[0].prenom = "Gérard";
        tableauPersonnes[0].nom = "Menfin";
        tableauPersonnes[0].setAge(35);

        tableauPersonnes[1] = new Personne();
        tableauPersonnes[1].prenom = "Ateur";
        tableauPersonnes[1].nom = "Nordine";
        tableauPersonnes[1].setAge(20);

        System.out.println("--------------------EXERCICE--------------------");
        for (Personne personne : tableauPersonnes) {
            System.out.println(personne.identite() + " " + personne.gatAge());
        }
        /* NULL est un type de données particulier (qu'on peut considérer comme une valeur particulière).
         * Une variable de type objet qui n'a pas été initialisée est considérée comme étant NULL.
         */
    }
}
