import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {

		String l=JOptionPane.showInputDialog("what flavor do you want your popcorn?");
		Popcorn o= new Popcorn(l);
		String y=JOptionPane.showInputDialog("how many minutes do you want to cook your popcorn?");
		int h= Integer.parseInt(y);
		Microwave k=new Microwave();
		k.putInMicrowave(o);
		k.setTime(h);
		k.startMicrowave();
		
		
		
	}

}
