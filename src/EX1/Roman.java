package EX1;

public class Roman extends Livre {
	private String nomA,nomE;
	Roman(String t, int id, String d, int nb,String nomA,String nomE) {
		super(t, id, d, nb);
		// TODO Auto-generated constructor stub
		this.nomA=nomA;
		this.nomE=nomE;
	}
	public String getNomA() {
		return nomA;
	}
	public void setNomA(String nomA) {
		this.nomA = nomA;
	}
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	@Override
	public String toString()
	{
		
		return super.toString()+" Nom d'auteur: "+this.nomA+" Nom d'editeur: "+this.nomE;
	}
	double calculPrix()
	{
		double p=0;
		p=(0.05*(super.nb))*(1+(super.TVA));
		return p;
	}
}

