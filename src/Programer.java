
public class Programer extends Zaposleni {

	private double bonus;	
	private double prekovremeniRad;

	
	public Programer() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Programer(double bonus, double prekovremeniRad, String ime, int brojRadnihSati, double cenaRadnogSata) {
		super(ime, brojRadnihSati, cenaRadnogSata);
		this.bonus = bonus;
		this.prekovremeniRad = prekovremeniRad;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getPrekovremeniRad() {
		return prekovremeniRad;
	}
	public void setPrekovremeniRad(double prekovremeniRad) {
		this.prekovremeniRad = prekovremeniRad;
	}

	@Override
	public double izracunajPlatu() {
		// plate = broj_radnih_sati * cena_radnog_sata + bonus + prekovremeni_rad
		return getBrojRadnihSati() * getCenaRadnogSata() + bonus + prekovremeniRad ;
	}
}
