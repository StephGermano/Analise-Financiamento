import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		double renda, endividamento, parcelamento;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = input.nextLine();
		System.out.println("Qual é o seu sobrenome");
		sobrenome = input.nextLine();
		
		System.out.println("\nTudo bem " +nome +" "+ sobrenome + "? \nAgora precisamos sabe mais sobre você!");
		
		System.out.println("Qual o valor da sua renda mensal?");
		renda = input.nextDouble();
		
		System.out.println("Você sabia que pela lei podemos fazer financiamento somente até 40% de endividamento?");
		System.out.println("De quanto seria o seu endividamento mensal?");
		endividamento = input.nextDouble();
		
		double porcent_endividamento = (endividamento / renda) *100;
		double margem_fianciamento = (0.4 * renda) - endividamento;
		
		System.out.println("A porcentagem de seu endividamento é de "+ porcent_endividamento+"%");
		
		if( porcent_endividamento < 40.0) {
			System.out.println("Margem disponível para financiamento\n"
					+ "Financiamento será analisado!\n\n"
					+ "Sua margem disponível para financiamento é de "+margem_fianciamento);
			        System.out.println("Qual o valor de parcela?");
			        parcelamento = input.nextDouble();
			        
					double end_total = ((parcelamento+endividamento) / renda)*100;
					// Porcentagem Máxima de Endividamento 
					if (end_total <= 40) {
						System.out.println("Valor enquadrado dentro de sua margem!\n"
								+ "Vamos solicitar a documentação para prosseguir com a operação.");
						} else {
							System.out.println("Financiamento fora da margem disponível\n"
									+ "Por favor atualize sua renda.");
							}

			
			
		} else {
			System.out.println("Margem não disponível para financiamento");
		}

		input.close();

	}

}
