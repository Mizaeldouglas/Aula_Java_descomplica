import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Mizael";
		int idade = 28;
		double renda = 4000.0;
				
		
		System.out.printf("%.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);

		System.out.println(y);
		System.out.println("Ola Mundo!");
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
