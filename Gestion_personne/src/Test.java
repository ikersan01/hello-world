
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//personne P0=new Personne() est impossible car classe abstraite
Enseignants E1=new Enseignants("M.","MEA","une rue ","Paris","IA");
Enseignants E2=new Enseignants("E.","UN NOM","une rue ","Toulouse","Maths");
E1.definirPersonne();
E2.definirPersonne();
Eleves El1=new Eleves("Marie","DUPOND","Avenue des termes","Paris","MEA");
El1.definirPersonne();
Personne.comptepersonnes();
El1.modifiepersonne("Avenue Wagam","Paris","Doctorant");
E2.modifiepersonne("rue Copernic","Paris","Chimie");
Personne E3=new Enseignants("Fleur.","Mercier","rue du four","Paris","Anglais");
if(E3 instanceof Enseignants) {
	System.out.println("\nJe suis un Enseignant");
	System.out.println(E3.getPrenom());
	// on notera et constatera que l'on ne peut utiliser les methodes de la sous-classe
	//Enseignants car E est de type Personne
	//Par exemple, on ne peut utiliser la fonction getSpecialite
	System.out.println(((Enseignants)E3).getSpecialite());
	//pour acceder aux methodes de la sous-classe Enseignants, on utilise un cast
}
else
	System.out.println("\nJe ne suis pas un Enseignant");
Personne.comptepersonnes();
E1.enseignements();
El1.enseignements();}

}
