
public abstract class Zaposleni {

		
		private String ime;
		private int brojRadnihSati;
		private double cenaRadnogSata;	
		
		public Zaposleni() {
		
		}

		public Zaposleni(String ime, int brojRadnihSati, double cenaRadnogSata) {
			
			this.ime = ime;
			this.brojRadnihSati = brojRadnihSati;
			this.cenaRadnogSata = cenaRadnogSata;
		}

		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime = ime;
		}
		public int getBrojRadnihSati() {
			return brojRadnihSati;
		}
		public void setBrojRadnihSati(int brojRadnihSati) {
			this.brojRadnihSati = brojRadnihSati;
		}
		public double getCenaRadnogSata() {
			return cenaRadnogSata;
		}
		public void setCenaRadnogSata(double cenaRadnogSata) {

			this.cenaRadnogSata = cenaRadnogSata;
		}
		
				@Override
		public String toString() {
			return "Zaposleni [ime=" + ime + ", brojRadnihSati=" + brojRadnihSati + ", cenaRadnogSata=" + cenaRadnogSata
					+ "]";
		}
	
		public abstract double izracunajPlatu();
		

	
}
