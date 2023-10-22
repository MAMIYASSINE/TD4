package EX1;

public class Livre {
	protected String titre;
	protected int id;
	protected final double TVA=0.1;
	protected String dom;
	protected int nb;
	@Override
	public String toString()
	{
		return "Titre: "+titre+" Identifiant: "+id+" Domaine: "+dom+" NombrePages: "+nb;
	}
	Livre(String t,int id ,String d,int nb)
	{
		this.titre=t;
		this.id=id;
		this.dom=d;
		this.nb=nb;
	}
	double calculePrix()
	{
		double p=0;
		p=(0.075*(this.nb))*(1+(this.TVA));
		return p;
	}
	
}
