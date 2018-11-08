/**
 * StartUp zur Lösung der Türme von Hanoi
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version November 2018
 */


import java.util.Scanner;

public class StartUpTuerme
{

	public static void main(String[] args)
	{
		String status;

		do
		{
			int input;

			System.out.println("Willkommen zum Puzzel die Türme von Hanoi.");
			System.out.print("Für wie viele Scheiben möchtets du das Puzzel gelöst haben?  ");

			Scanner keyboard1 = new Scanner(System.in);
			input = keyboard1.nextInt();

			System.out.println("\nHier siehst du die Schritte die nötig waren, um das Puzzel zu lösen:");
			System.out.println("_______________________________________________");

			Tuerme puzzle = new Tuerme();
			puzzle.set(input);
			puzzle.initiieren();
			System.out.println("\nEs hat " + puzzle.gibSchritte() + " Schritte gebraucht, " + "um das Puzzel zu lösen.");
			System.out.println("Und es hat " + puzzle.gibRekursiveSchritte() + " rekursive Schritte gebraucht, um das Puzzel zu lösen");
			System.out.print("\nMöchtest du noch ein weiteres Puzzel lösen? (J/N): ");

			Scanner keyboard2 = new Scanner(System.in);
			status = keyboard2.nextLine();

			System.out.println("");

		}
		while (status.equalsIgnoreCase("J") || status.equalsIgnoreCase("Ja"));
	}

}
