package exercicios;

public class main {
	
		public static void main(String[] args) {
	
	        // Calculadora
	        System.out.println("Exerc�cio calculadora");
	        calculadora_professor.soma(3, 6);
	        calculadora_professor.subtracao(9, 1.8);
	        calculadora_professor.multipicacao(7, 8);
	        calculadora_professor.divisao(5, 2.5);
	
	        // Mensagem
	        System.out.println("Exerc�cio mensagem");
	        mensagem.obterMensagem(9);
	        mensagem.obterMensagem(14);
	        mensagem.obterMensagem(1);
	
	        // Empr�stimo
	        System.out.println("Exerc�cio empr�stimo");
	        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
	        emprestimo.calcular(1000, emprestimo.getTresParcelas());
	        emprestimo.calcular(1000, 5);
	}
}
