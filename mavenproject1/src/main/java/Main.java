import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Main {
	public static void main(String[] argv) {
		int i, j;
		Scanner sc = new Scanner(System.in);		
		try {
			i = sc.nextInt();
			j = sc.nextInt();
                        System.out.println("Primo numero: " +i);
			System.out.println("Secondo numero: " +j);
                        {
                            if (j>=0)
                            System.out.println(i+" + "+j+" = "+(i + j));
                            else
                            System.out.println(i+" - "+(-j)+" = "+(i + j));
                        }
		} catch(InputMismatchException ex) {
			System.out.println("Errore, input non valido.");
		} finally {
			sc.close();
		}
	}
}