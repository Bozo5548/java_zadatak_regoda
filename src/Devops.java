
public class Devops extends Zaposleni {

	
	private double bonus;
	
	public Devops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Devops(double bonus, String ime, int brojRadnihSati, double cenaRadnogSata) {
		super(ime, brojRadnihSati, cenaRadnogSata);
		this.bonus = bonus;
	}


	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double izracunajPlatu() {
		// plata = broj_radnih_sati * cena_radnog_sata + bonus
		return getBrojRadnihSati() * getCenaRadnogSata() + bonus ;
	}

}
