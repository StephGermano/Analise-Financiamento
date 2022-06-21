import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		double renda, endividamento, parcelamento;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual � o seu nome?");
		nome = input.nextLine();
		System.out.println("Qual � o seu sobrenome");
		sobrenome = input.nextLine();
		
		System.out.println("\nTudo bem " +nome +" "+ sobrenome + "? \nAgora precisamos sabe mais sobre voc�!");
		
		System.out.println("Qual o valor da sua renda mensal?");
		renda = input.nextDouble();
		
		System.out.println("Voc� sabia que pela lei podemos fazer financiamento somente at� 40% de endividamento?");
		System.out.println("De quanto seria o seu endividamento mensal?");
		endividamento = input.nextDouble();
		
		double porcent_endividamento = (endividamento / renda) *100;
		double margem_fianciamento = (0.4 * renda) - endividamento;
		
		System.out.println("A porcentagem de seu endividamento � de "+ porcent_endividamento+"%");
		
		if( porcent_endividamento < 40.0) {
			System.out.println("Margem dispon�vel para financiamento\n"
					+ "Financiamento ser� analisado!\n\n"
					+ "Sua margem dispon�vel para financiamento � de "+margem_fianciamento);
			        System.out.println("Qual o valor de parcela?");
			        parcelamento = input.nextDouble();
			        
					double end_total = ((parcelamento+endividamento) / renda)*100;
					// Porcentagem M�xima de Endividamento 
					if (end_total <= 40) {
						System.out.println("Valor enquadrado dentro de sua margem!\n"
								+ "Vamos solicitar a documenta��o para prosseguir com a opera��o.");
						} else {
							System.out.println("Financiamento fora da margem dispon�vel\n"
									+ "Por favor atualize sua renda.");
							}

			
			
		} else {
			System.out.println("Margem n�o dispon�vel para financiamento");
		}

		input.close();

	}

}
