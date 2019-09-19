package artiste;

public class Type extends Art {
private String artist;
private String generau;

public Type (String artist)
{super( );
	this.artist=artist;
}
public Type (String artist, String generau)
{
	super();
	this.artist=artist;
	this.generau=generau;
}
public  String getartist()
{
	return this.artist;
}
}
