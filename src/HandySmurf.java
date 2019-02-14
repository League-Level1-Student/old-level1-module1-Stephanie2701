
public class HandySmurf {

	public static void main(String[] args) {
		
		Smurf A =new Smurf("Sam");
		System.out.println(A.getName());
		A.eat();
		
		
		
		Smurf B= new Smurf("Papa");
		System.out.println(B.getName());
		System.out.println(B.getHatColor());
		System.out.println(B.isGirlOrBoy());
		
		Smurf C=new Smurf("Smurfette");
		System.out.println(C.getName());
		System.out.println(C.getHatColor());
		System.out.println(C.isGirlOrBoy());
	}
	
	
}
