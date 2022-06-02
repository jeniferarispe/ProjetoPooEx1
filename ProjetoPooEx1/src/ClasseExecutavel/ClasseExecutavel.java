package ClasseExecutavel;

import modelo.Conta;
import modelo.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();

		p1.nome = "Jeni";
		p1.idade = 12;
		p1.celular = 123456;
		p1.nomeMae = "Ana Paula";

		Pessoa p2 = new Pessoa();

		p2.nome = "Maria";
		p2.idade = 16;
		p2.celular = 12789;
		p2.nomeMae = "Silvia";
		Pessoa p3 = new Pessoa();

		p3.nome = "Joao";
		p3.idade = 66;
		p3.celular = 2784559;
		p3.nomeMae = "Maiara";

		Conta c1 = new Conta();
		c1.codigo = 1;
		c1.correntista = "Abc";
		c1.saldo = (float) 120.45;

		Conta c2 = new Conta();
		c2.codigo = 2;
		c2.correntista = "Ana";
		c2.saldo = (float) 54.50;

		Conta c3 = new Conta();
		c3.codigo = 3;
		c3.correntista = "Ricardo";
		c3.saldo = (float) 788.10;

		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Celular: " + p1.celular);
		System.out.println("Nome da Mae: " + p1.nomeMae);

		System.out.println("----------------------");

		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
		System.out.println("Celular: " + p2.celular);
		System.out.println("Nome da Mae: " + p2.nomeMae);

		System.out.println("----------------------");
		System.out.println("Nome: " + p3.nome);
		System.out.println("Idade: " + p3.idade);
		System.out.println("Celular: " + p3.celular);
		System.out.println("Nome da Mae: " + p3.nomeMae);
		System.out.println("----------------------");
		System.out.println("Contas:");

		System.out.println("Codigo: " + c1.codigo);
		System.out.println("Correntista: " + c1.correntista);
		System.out.println("Saldo: " + c1.saldo);

		System.out.println("----------------------");
		System.out.println("Codigo: " + c2.codigo);
		System.out.println("Correntista: " + c2.correntista);
		System.out.println("Saldo: " + c2.saldo);

		System.out.println("----------------------");
		System.out.println("Codigo: " + c3.codigo);
		System.out.println("Correntista: " + c3.correntista);
		System.out.println("Saldo: " + c3.saldo);

	}

}
