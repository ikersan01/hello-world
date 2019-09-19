package artiste;

public class Art {
private String nom;
private String prenom;
private int age;
private Gender gender;
private Type artist; 
public Art()
{
	
}
public Art (String nom, String prenom, int age, Gender gender,Type artist)
{
	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
	this.artist= artist;}

protected void setnom(String nom)
{
	this.nom=nom;
}
protected void setprenom (String prenom)
{
	this.prenom=prenom;
}
protected void  setage(int age) {
	this.age=age;
}
public String getnom()
{
	return(this.nom);
}
public String getprenom()
{
	return(this.prenom);
}
public Gender getname()
{
	return(this.gender);
}
public Type getartiste()
{
	return (this.artist);
}
}
