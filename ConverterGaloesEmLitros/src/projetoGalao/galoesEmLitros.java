package projetoGalao;
import java.util.Scanner;

public class galoesEmLitros {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int numGalao;
		System.out.println("Digite a quantidade de galões: ");
		numGalao = scan.nextInt();
		
		Double galaoParaLitros;
		galaoParaLitros = numGalao*3.785;
		
		System.out.println("O valor de galões inserido foi: " + numGalao + ". Este valor convertido para litros"
				+ " é: " + galaoParaLitros + "l.");
		scan.close();
	}

}
