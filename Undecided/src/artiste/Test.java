package artiste;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Art p,q;
Type a,b;
a=new Type(Qualification.actor.toString());
p=new Art("rogen","Seth",47,Gender.male,a);
System.out.println(p.getname());
	}

}
