package projetoGalao;
import java.util.Scanner;

public class galoesEmLitros {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int numGalao;
		System.out.println("Digite a quantidade de gal�es: ");
		numGalao = scan.nextInt();
		
		Double galaoParaLitros;
		galaoParaLitros = numGalao*3.785;
		
		System.out.println("O valor de gal�es inserido foi: " + numGalao + ". Este valor convertido para litros"
				+ " �: " + galaoParaLitros + "l.");
		scan.close();
	}

}
