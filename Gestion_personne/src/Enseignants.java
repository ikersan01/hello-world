
public class Enseignants extends Personne implements Ienseignements{
private String specialite;
private static int nb_enseignants=0;
//on cree une variable globale que l'on initialise  à la valeur 0
public Enseignants(String p,String n,String r,String ville,String specialite) {
	super(p,n,r,ville);
	nb_enseignants=nb_enseignants +1;
	this.specialite=specialite;
}
public Enseignants()
{
	nb_enseignants=	nb_enseignants +1;
}
public String getSpecialite() {
	return specialite;
}
public static int getNbE() {
	return nb_enseignants;
}
public void setSpecialite(String S) {
	specialite=S;
}
public void definirPersonne()
{
	System.out.println("\nJe suis un Eleve et mon diplome est"+getSpecialite()+". "+toString());
	
}
public void modifiepersonne(String rue,String v,String specialite)
{
	this.specialite=getSpecialite()+"-"+specialite;
	super.modifiepersonne(rue, v);
}
public void enseignements() {
	System.out.println("\nJ'assiste a tous les enseignements qui me me permettrons d'obtenir le titre de "+getSpecialite());
}
}