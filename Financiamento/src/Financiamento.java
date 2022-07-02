
import javax.swing.JOptionPane;

import Financiamento.Class.Cliente;

public class Financiamento {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
		cliente1.setNome(nome);

		JOptionPane.showMessageDialog(null, "Bem vindo ao nosso simulador " + nome);
		JOptionPane.showMessageDialog(null, "Vamos precisar de algumas informa��es suas para continuar");

		String idade = JOptionPane.showInputDialog("Qual a sua idade ?");
		String renda = JOptionPane.showInputDialog("Qual o valor da sua renda?");
		String endividamento = JOptionPane.showInputDialog("Qual o valor do seu endividamento mensal?");

		cliente1.setIdade(Integer.valueOf(idade));
		cliente1.setRenda(Double.parseDouble(renda));
		cliente1.setEndividamento(Double.valueOf(endividamento));

		JOptionPane.showMessageDialog(null,
				"Voc� sabia que pela lei podemos fazer financiamento at� 40% de endividamento?");
		JOptionPane.showMessageDialog(null, "O seu endividamento � de " + cliente1.getPorcent_Endividamento() + " %");

		if (cliente1.getPorcent_Endividamento() < 40.0) {
			JOptionPane.showMessageDialog(null, "Margem dispon�vel para financiamento.\nFinanciamento ser� analisado.\n"
					+ "Sua margem dispon�vel para financiamento � de R$" + cliente1.getMargem_Financiamento());
			String parcelamento = JOptionPane.showInputDialog("Qual o valor da parcela?");
			cliente1.setParcelamento(Double.parseDouble(parcelamento));
			if (cliente1.getEnd_Total() <= 40) {
				JOptionPane.showMessageDialog(null, "Valor enquadrado dentro de margem\n"
						+ "Vamos solicitar a documenta��o para prosseguir com a opera��o");
			} else {
				JOptionPane.showMessageDialog(null,
						"Financiamento fora da margem dispon�vel\n" + "Por favor atualize sua renda.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Margem n�o dispon�vel para financiamento");
		}


	}

}
