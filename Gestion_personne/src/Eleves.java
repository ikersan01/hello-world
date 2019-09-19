
public class Eleves extends Personne implements Ienseignements 
{
	private String diplome;
	private static int nb_eleves=0;
	public Eleves(String p, String n,String r,String ville,String diplome) {
		super(p,n,r,ville);
		nb_eleves= nb_eleves + 1;
		//Afin de pouvoir compter tout nouveau ensignant (objet) ajouté
		this.diplome=diplome;
	}
	public Eleves() {
		super();
		//qu'on le mette ou pas, Java le fera par defaut automatiquement
		nb_eleves= nb_eleves + 1;
	}
	public String getDiplome()
	{
		return diplome;
	}
	public static int getNbEl()
	{
		return nb_eleves;
	}
	
	public void setDiplome(String S) {
		diplome=S;
	}
	//pas de set avec une variable globale
	public void definirPersonne()
	{
		System.out.println("\nJe suis un Eleve et mon diplome est"+getDiplome()+". "+toString());
		
	}
	
	public void modifiepersonne(String rue,String v,String diplome)
	{
		this.diplome=diplome;
		super.modifiepersonne(rue, v);//appel de la methode de la classe mere
	}
	public void enseignements () {
		System.out.println("\nJ'assiste a tous les enseignements qui me me permettrons d'obtenir le titre de "+getDiplome());
	}
}
