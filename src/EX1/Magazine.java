package EX1;

public class Magazine extends Livre {
	private String mois;
	Magazine(String t, int id, String d, int nb ,String  mois) {
		super(t, id, d, nb);
		// TODO Auto-generated constructor stub
		this.mois=mois;
	}
	@Override
	public String toString()
	{
		return super.toString()+" Mois de parution: "+this.mois;
	}
	double calculePrix(int bonus)
	{
		double p=0;
		p=(0.35*(super.nb))*(1+(super.TVA))+bonus;
		return p;
	}

	

}
