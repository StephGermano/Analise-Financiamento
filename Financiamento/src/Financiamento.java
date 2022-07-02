
import javax.swing.JOptionPane;

import Financiamento.Class.Cliente;

public class Financiamento {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
		cliente1.setNome(nome);

		JOptionPane.showMessageDialog(null, "Bem vindo ao nosso simulador " + nome);
		JOptionPane.showMessageDialog(null, "Vamos precisar de algumas informações suas para continuar");

		String idade = JOptionPane.showInputDialog("Qual a sua idade ?");
		String renda = JOptionPane.showInputDialog("Qual o valor da sua renda?");
		String endividamento = JOptionPane.showInputDialog("Qual o valor do seu endividamento mensal?");

		cliente1.setIdade(Integer.valueOf(idade));
		cliente1.setRenda(Double.parseDouble(renda));
		cliente1.setEndividamento(Double.valueOf(endividamento));

		JOptionPane.showMessageDialog(null,
				"Você sabia que pela lei podemos fazer financiamento até 40% de endividamento?");
		JOptionPane.showMessageDialog(null, "O seu endividamento é de " + cliente1.getPorcent_Endividamento() + " %");

		if (cliente1.getPorcent_Endividamento() < 40.0) {
			JOptionPane.showMessageDialog(null, "Margem disponível para financiamento.\nFinanciamento será analisado.\n"
					+ "Sua margem disponível para financiamento é de R$" + cliente1.getMargem_Financiamento());
			String parcelamento = JOptionPane.showInputDialog("Qual o valor da parcela?");
			cliente1.setParcelamento(Double.parseDouble(parcelamento));
			if (cliente1.getEnd_Total() <= 40) {
				JOptionPane.showMessageDialog(null, "Valor enquadrado dentro de margem\n"
						+ "Vamos solicitar a documentação para prosseguir com a operação");
			} else {
				JOptionPane.showMessageDialog(null,
						"Financiamento fora da margem disponível\n" + "Por favor atualize sua renda.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Margem não disponível para financiamento");
		}


	}

}
