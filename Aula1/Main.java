package Aula1;

import java.util.ArrayList;

public class Main 
{
	public static void main(String [] args)
	{
		Conta conta1 = new Conta(); //criamos objeto
		//classe variavel = new repete nome da classe fecha () e ; - instanciar
		conta1.saldo = 500; //atribuimos dados
		conta1.nomeCorrentista = "Charles";
		
		Conta conta2 = new Conta();
		conta2.saldo = 1000;
		conta2.nomeCorrentista = "Maiquel";
		
		System.out.println("nome correntista da conta 1: " + conta1.nomeCorrentista);
		//concatenar - juntar o texto string com o valor atribuido - retornar o valor do nomeCorretista
		System.out.println("nome correntista da conta 2: " + conta2.nomeCorrentista);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		//     Classe    variavel-objeto
		lista.add(conta1);//metodo/função add para adicionar as contas na lista 
		lista.add(conta2);
		
		lista.get(0); //ele vai retornar qualquer conta 
	}
}
