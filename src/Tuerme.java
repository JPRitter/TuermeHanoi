/**
 * Ein rekursiver Algorithmus zur Lösung der Türme von Hanoi
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version November 2018
 */

public class Tuerme
{
	private int startScheiben;
	int schrittZaehler = 0;
	int rekursivZaehler = 0;
	String startBolzen = "Bolzen0";
	String zielBolzen = "Bolzen2";
	String hilfsBolzen = "Bolzen1";

	public Tuerme()
	{
		startScheiben = 0;
	}

	// Setzt die Anzahl der Scheiben
	public void set(int scheiben)
	{
		startScheiben = scheiben;
	}

	// Gibt die Anzahl der Schritte die gebraucht wurden um das Puzzel zu lösen
	// wieder
	public int gibSchritte()
	{
		return schrittZaehler;
	}

	// Gibt die Anzahl der rekursiven Schritte die gebraucht wurden um das Puzzel zu lösen
	// wieder
	public int gibRekursiveSchritte()
	{
		return rekursivZaehler;
	}

	// Initalisert den rekursiven Ablauf
	public void initiieren()
	{
		bewegeTurm(startScheiben, startBolzen, zielBolzen, hilfsBolzen);
	}

	// Bewegt die definierte Anzahl der Scheiben von einem Turm zum anderen
	// Bewegt eine Teilmenge der Scheiben (n-1). Eine Scheibe wird bewegt und dann
	// wird die Teilmenge wieder zurück bewegt.
	private void bewegeTurm(int anzahlScheiben, String startBolzen, String zielBolzen, String hilfsBolzen)
	{
		
		if (anzahlScheiben == 1)
		{
			bewegeEineScheibe(startBolzen, zielBolzen, anzahlScheiben);
		}
		else
		{
			bewegeTurm(anzahlScheiben - 1, startBolzen, hilfsBolzen, zielBolzen);
			bewegeEineScheibe(startBolzen, zielBolzen, anzahlScheiben);
			bewegeTurm(anzahlScheiben - 1, hilfsBolzen, zielBolzen, startBolzen);
			rekursivZaehler++;
		}
		
	}

	// Gibt die Scheibe und ihre Bewegung von einem Bolzen zum anderen auf der
	// Konsole aus
	private void bewegeEineScheibe(String start, String ziel, int n)
	{
		schrittZaehler++;
		System.out.println("Bewege Scheibe " + n + " von dem " + start + " zum " + ziel);
	}
}
