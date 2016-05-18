package bancoEcon;

public class Aplicacao {

	public static void main(String[] args) {
		
		/* Cria��o de objetos, chamadas de m�todos e tratamento de exce��es. */
		ContaCorrente cc2 = new ContaCorrente("Jo�o");
		ContaCorrente cc1 = new ContaCorrente("Alberto");
		
		try {
			cc1.depositar(100);
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "O Dep�sito de " 
								+ cc1.padraoMoeda(cc1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido " + e.getValorInvalido());
		}
		
		try {
			cc1.depositar(-10);
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "O Dep�sito de " 
								+ cc1.padraoMoeda(cc1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido: " + e.getValorInvalido());
		}
		
		try {
			cc1.sacar(30);
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.sacar(90);
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.sacar(-5);
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transfer�ncia de " + cc1.padraoMoeda(cc1.valorTransferido) + " da Conta de " 
								+ cc1.getUsuarioConta() + " para a Conta de " + cc2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro na transfer�ncia: " + e.getMessage() 
								+ ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro na transfer�ncia: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transfer�ncia de " + cc1.padraoMoeda(cc1.valorTransferido) + " da Conta de " 
								+ cc1.getUsuarioConta() + " para a Conta de " + cc2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro na transfer�ncia: " + e.getMessage() 
								+ ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + cc1.getUsuarioConta() + ", " + "Erro na transfer�ncia: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		System.out.println("\n");
		
		ContaInvestimento ci1 = new ContaInvestimento("Marcos");
		ContaInvestimento ci2 = new ContaInvestimento("Naldo");
		
		try {
			ci1.depositar(200.00);
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "O Dep�sito de " 
								+ ci1.padraoMoeda(ci1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido " + e.getValorInvalido());
		}
		
		try {
			ci1.sacar(100.00);
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "O Saque de " 
								+ ci1.padraoMoeda(ci1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inv�lido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + ci1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			ci1.transferir(150.00, ci2);
			System.out.println("Transfer�ncia de " + ci1.padraoMoeda(ci1.valorTransferido) + " da Conta de " 
								+ ci1.getUsuarioConta() + " para a Conta de " + ci2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ol�! " + ci1.getUsuarioConta() + ", " + "Erro na transfer�ncia: " + e.getMessage() 
								+ ". Saldo Atual da Conta �: " + ci1.padraoMoeda(e.getSaldoDisponivel()));;
		}
		
		try {
			ci1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + ci1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			ci2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + ci2.padraoMoeda(e.getSaldoDisponivel()));
		}	
	}
}

