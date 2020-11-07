import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Main {

    public static void main(String[] args) throws BiffException, IOException {


    	// file mora imati relativnu putanju pa vidi kako to da namestis u netbeans-u inace ljudi nece moci da ti poreknu projekat da vide sta si uradio
		// ovo je meni radiolo u ideji ali sam napravio folder resources u nivou sa src folderom
        FileInputStream f = new FileInputStream("resoruces/podaci.xls");
        Workbook w = Workbook.getWorkbook(f);
        Sheet s = w.getSheet(0);
        System.out.println("----------------------------------------------------");
        //	Devops d = new Devops(Integer.parseInt(s.getCell(6, 1).getContents()), s.getCell(1, 1).getContents(), Integer.parseInt(s.getCell(4, 1).getContents()),Integer.parseInt(s.getCell(3, 1).getContents()));
        //   System.out.println(d.getIme() + " " + s.getCell(2, 1).getContents() + " : " + "Plata = " + d.izracunajPlatu() + " RSD");

        //    Programer p = new Programer(Integer.parseInt(s.getCell(6, 2).getContents()),Integer.parseInt(s.getCell(5, 2).getContents()), s.getCell(1, 2).getContents(), Integer.parseInt(s.getCell(4, 2).getContents()),Integer.parseInt(s.getCell(3, 2).getContents()));
        //     System.out.println(p.getIme() + " " + s.getCell(2, 2).getContents() + " : " + "Plata = " + p.izracunajPlatu() + " RSD");
        System.out.println("----------------------------------------------------");


        for (int i = 1; i < s.getRows(); i++) {


        	// probaj ovako da radis sa drugom petljom za ucitavanje
			Cell[] row = s.getRow(i);
			for (int j = 0; j < row.length; j++) {
				// ovde sada odraditi ucitavanje kolona i pravljanje objekata u zavisnosti od sadrzaja kolona
				// znaci prakticno sve ovo odozdo mozes da stavis ovde i ponasas se dinamicki u osnosu na to koja je vrednost pozicije
				System.out.println(row[j].getContents());
			}

			// ovo se tesko cita, ucitaj sve u lokalne varijable prvo pa onda napravi Devopsa i programera
			// int celija6 = Integer.parseInt(s.getCell(6,i)
            Devops d = new Devops(Integer.parseInt(s.getCell(6, i).getContents()), s.getCell(1, i).getContents(),
                    Integer.parseInt(s.getCell(4, i).getContents()), Integer.parseInt(s.getCell(3, i).getContents()));

			// a za ovu praznu kolonu moras staviti proveru jer je prazna kolona u stvari prazan string i ne moze se prazan string pretvoriti u broj
            Programer p = new Programer(Integer.parseInt(s.getCell(6, i).getContents()), Integer.parseInt(s.getCell(5, i).getContents()),
                    s.getCell(1, i).getContents(), Integer.parseInt(s.getCell(4, i).getContents()), Integer.parseInt(s.getCell(3, i).getContents()));

            String Pozicija = s.getCell(2, i).getContents();
            if (Pozicija.contentEquals("Devops")) {
            	// ovde vidim da nema potrebe da pravis dva objekta odmah gore d i p nego prvo treba u zavisnosti od pozicije da vidis koji objekat da napravis
                System.out.println(d.getIme() + " " + " : Plata = " + d.izracunajPlatu() + " RSD");
            } else if (Pozicija.contentEquals("Programer")) {
                System.out.println(p.getIme() + " " + " : Plata = " + p.izracunajPlatu() + " RSD");
            } else {
                System.out.println(Pozicija + " nije tacno uneta.");
            }

        }

        System.out.println("Kraj.");
    }

}
