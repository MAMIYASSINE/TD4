package EX1;

public class Librairie {
	private Livre liste[];
	private int cap;
	private int nb;
	Librairie(int cap)
	{
		this.cap=cap;
		liste=new Livre[cap];
		
	}
	int getNb()
	{
		return this.nb;
	}
	void inventaire()
	{
		for(int i=0;i<liste.length;i++)
		{
			System.out.println(liste[i]+" Prix: "+ liste[i].calculePrix());
		}
	}
	void inventaire(String categ)
	{
		for(int i=0;i<liste.length;i++)
		{
			if(liste[i].dom ==categ)
			{
				System.out.println(liste[i]);
			}
		}
	}
	void ajoutLiv(Livre liv)
	{
		if(nb<cap)
		{
			liste[nb]=liv;
			nb++;
		}
		else
		{
			System.out.println("On ne peut pas ajouter un autre livre a la librairie");
		}
	}
	void suppLiv(int num)
	{
		int i=0;
		boolean trouve =false;
		while((i<liste.length)&&(trouve==false))
			{
					if(liste[i].id==num)
					{
						trouve=true;
					}
					else
					{
						i++;
					}
			}
		if(trouve==true)
		{
			for(int j=i;j<liste.length;j++)
			{
				liste[j]=liste[j+1];
				this.nb--;
			}
		}
		else
		{
			System.out.println("Livre n'est pas trouve");
		}
	}
	void afficheroman()
	{
		for(int i=0;i<liste.length;i++)
		{
			if(liste[i] instanceof Roman)
			{
				System.out.println(liste[i]);
			}
		}
	}
	void prixroamns()
	{
		double p=0;
		for(int i=0;i<liste.length;i++)
		{
			if(liste[i] instanceof Roman)
			{
				p=p+liste[i].calculePrix();
			}
		}
		System.out.println(p);
	}
	

}
