package jeuxdecarte;

public class card {
private int Rank;
private int Suits;

public card(int Rank, int Suits) {
	this.Rank=Rank;
	this.Suits=Suits;
}
public boolean samesuits(card c) {
	
	return (this.Suits == c.Suits);
	
}
public boolean sameranks(card c) {
	return (this.Rank == c.Rank);
	
}
public boolean samecard(card c) {
	return this.samesuits(c)&& this.sameranks(c);
	
	

}
/**
 * create a number within you can get the Rank and the Suits.
 * @param cardno by doing cardno % 13 for rank and cardno /13 %4 for suit. 
 * @return rank and suits
 */ 
public  card (int cardno) {
	this.Rank= (cardno % 13);
	this.Suits =(cardno / 13) % 4;
	
}
@Override
public String toString() {
String Rank ="23456789TJQKA";
String Suits= "\u2663\u2666\u2665\u2660";
return Rank.charAt(this.Rank) + "" +Suits.charAt(this.Suits);
}
}