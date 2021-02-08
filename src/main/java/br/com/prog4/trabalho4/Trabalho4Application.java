package br.com.prog4.trabalho4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trabalho4Application {

	public static void main(String[] args) {
		SpringApplication.run(Trabalho4Application.class, args);
		
		Empregado empregado = new Empregado("456.556.479-75", "Kácio Felipe", 19, 54645);
		EmpregadoController empregadoController = new EmpregadoController();

		empregadoController.incluir(empregado);

		empregado = new Empregado("456.987.123-85", "Heloise Katharine", 21, 456.00);
		empregadoController.alterar(empregado);

		empregadoController.excluir(empregado);

		List<Empregado> empregados = empregadoController.listarTodos();

		empregados.forEach(emp -> System.out
				.println("*************\nNome: " + emp.getNome() + "\nCPF: " + emp.getCpf() + "*************"));

		empregado = empregadoController.buscarPeloCpf("054.578.458-77");

		DependenteController dependenteController = new DependenteController();
		Dependente dependente = new Dependente(empregado.getCpf(), "Maria", 1, new Date(2000, 5, 4));

		dependenteController.incluir(dependente);

		dependente = new Dependente(empregado.getCpf(), "José", 1, new Date(2001, 8, 4));
		dependenteController.alterar(dependente);

		dependenteController.excluir(dependente);

		List<Dependente> dependentes = dependenteController.listarTodos();

		dependentes.forEach(emp -> System.out.println(
				"*************\nNome: " + emp.getNome() + "\nCPF: " + emp.getCpfEmpregado() + "*************"));
	}

}
