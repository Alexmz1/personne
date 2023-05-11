public class Personne{
    /*
     * Les propriétés (ou attributs) définies dans une classe correspondent aux caractéristiques des objets qui vont être créés à partir 
     * de cette classe.
     */

    public String prenom = "défaut"; // = "défaut" remplace la null dans l'affichage 
    public String nom;
    private int age;

    /*
     * CONSTRUCTEUR
     * Un constructeur est une méthode qui est exécutée quand un objet est instancié.
     * Toutes les classes ont un constructeur par défaut dans JAVA. 
     * CE CONSTRUCTEUR A LE MÊME NOM QUE LA CLASSE. Par exemple : 
     * Personne p = new Personne();
     * 
     * On peut définir un nouveau constructeur.
     * ⚠️ Un constructeur ne DOIT PAS retourner une valeur. Donc il n'y a pas de type avant le nom de la méthode lors de la déclaration.
     *   En général, les constructeurs sont utilisés pour initialiser la valeur des propriétés de l'objet.
     */
    public Personne(String name, String fistname, int old){
        nom = name;
        prenom = fistname;
        age = old;
    }

    /*
     * Quand on définit un constructeur, le constructeur par défaut n'est plus accessible.
     * Si on veut l'utiliser à nouveau, il faut déclarer un constructeur sans arguments.
     * NB : on peut laisser les {} vides si aucune instructions ne doit être exécutée.
     * PS : on peut déclarer autant de constructeurs que l'on veut 
     */
    public Personne() {} // Constructeur par défaut

    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }


    /*
     * Une fonction dans une classe est appelée une MÉTHODE
     * @return String concaténation du prénom et du nom
     */
    public String identite(){
        return this.prenom + " " + this.nom;
    }

    public String identite(boolean vrai){
        return this.prenom + " " + this.nom + ", agé de " + this.age + " ans";
    }


    public int gatAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}