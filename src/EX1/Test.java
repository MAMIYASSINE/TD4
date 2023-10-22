package EX1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Livre L=new Livre("hamadi",5 ,"adventure",500);
		System.out.println(L);
		System.out.println(L.calculePrix());*/
		/*Roman R=new Roman("hamadi",5 ,"adventure",500,"Ahmad","Mohsen");
		System.out.println(R);
		System.out.println(R.calculPrix());*/
		Librairie Li=new Librairie(4);
		Livre L =new Livre("aa",1,"zz",500);
		Roman R=new Roman("ee",2,"rr",750,"tt","yy");
		Magazine M=new Magazine("uu",3,"ii",400,"juin");
		Li.ajoutLiv(L);
		Li.ajoutLiv(R);
		Li.ajoutLiv(M);
		Li.inventaire();
		
		Roman R1=new Roman("qq",4,"ss",900,"dd","ff");
		Li.ajoutLiv(R1);
		//Li.inventaire();
		Li.afficheroman();
		Li.prixroamns();
		//System.out.println(Li.getNb());
		
		
		
		

	}

}
