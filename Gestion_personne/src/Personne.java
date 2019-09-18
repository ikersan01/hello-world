
public abstract class  Personne {
	protected String nom;
// en protected, de la sorte heritage et donc utilisation
	//a un niveau mais pas deux ou plus
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nb_personnes=0;
	//on cree une variable globale que l'on initialise a la valeur 0
	public Personne() {
		nb_personnes=nb_personnes + 1;
		//Afin de pouvoir compter toute personne (objet) ajoutée
		prenom="Inconnu";
		//nom="Inconnu";
	}
	public Personne(String p,String n,String r,String ville) {
		nb_personnes=nb_personnes + 1;
		//Afin de pouvoir compter toute nouvelle personne (objet) ajoutée
		prenom=p;
		nom=n;
		rue=r;
		this.ville=ville;
	}
	//Maintenat on cree les accesseurs (acces en lecture) qui
	//commencent par le mot get suivi de ce que vous voulez
	public String getPrenom(){
		return prenom;
	}
	public String getNom(){
		return nom;
	}
	public String getrue(){
		return rue;
	}
	public String getville(){
		return ville;
	}
	public static int getNbp() {
		return nb_personnes;
	}
	//la méthode getNbP doit être statique car elle ne fait intervenir
	//qu'une variable statique
	//pas de set avec une variable globale
	
	public void setPrenom(String P) {
		this.prenom=P;
	}
	public void setNom(String N) {
		this.nom=N;
	}
	public void setRue(String R) {
		this.rue=R;
	}
	public void setVille(String V) {
		this.ville=V;
	}
	//pas de set avec une variable globale
	public String toString() {
		return("\nMon prenom est"+prenom+"et mon nom est"+
	getNom() + "\nMa rue est "+ rue +"et ma ville est "+ville+"\n");
	}
public abstract void definirPersonne();
//methode abstraite car comme avec specialisation a toutes
//les sous-classes
public static void comptepersonnes() {
	System.out.println("\nle nombre de personnes vaut \t"+ Personne.getNbp());
	System.out.println("\nle nombre de personnes vaut \t"+ Enseignants.getNbE());
	System.out.println("le nombre d'etudiants vaut \t"+ Eleves.getNbEl());
	//la méthode doit être statique car elle ne fait intervenir que
	//des fonctions statiques
}
public void modifiepersonne(String rue, String v) {
	this.rue=rue;
	ville =v;
	definirPersonne();
	// on notera que c'est definirPersonne() des sous classes qui sera executee
	//differement pour chaque sous-classe.D'ou le polymorphisme
	
 }
public void manger() {
	System.out.println("Je mange, entre autres,pour continuer de vivre");
}
public void dormir() {
	System.out.println("Il faut dormir; \t"+ "Le sommeil regenere"+"les cellules");
}
public String parler(String mot) {
	String blabla=mot +"\nBravo vous êtes parfait";
	return blabla;
}
}
