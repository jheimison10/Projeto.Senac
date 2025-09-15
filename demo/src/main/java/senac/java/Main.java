package senac.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um funcionário fixo
        Funcionario funcionario1 = new Funcionario(
            "Jheimison", 35, "005.508.962-36", 0,
            "jheimison_gomes@hotmail.com", "(95)99146-5819",
            "Bairro: Silvio Leite, 166", "25/11/1989",
            1.75, "Castanho", "Gerente", "12345", 5500.0, "TI"
        );

        // Criando um estagiário fixo
        Estagiario estagiario1 = new Estagiario(
            "Maria Eduarda", 22, "456.789.123-45", 0,
            "maria.eduarda@email.com", "(11)98765-4321",
            "Rua das Flores, 789", "10/05/2003",
            1.68, "Verde", "Estagiária de Marketing", "67890", 1800.0,
            "Marketing", 30, 800.0, true
        );

        System.out.println("--- Funcionário ---");
        System.out.println(funcionario1);

        System.out.println("\n--- Estagiário ---");
        System.out.println(estagiario1);

        // Cadastro de novo funcionário via Scanner
        System.out.println("\n--- Cadastro de novo Funcionário ---");
        Funcionario funcionarioNovo = cadastrarFuncionario(scanner);
        System.out.println(funcionarioNovo);

        // Cadastro de novo estagiário via Scanner
        System.out.println("\n--- Cadastro de novo Estagiário ---");
        Estagiario estagiarioNovo = cadastrarEstagiario(scanner);
        System.out.println(estagiarioNovo);

        scanner.close();
    }

    // Métodos para cadastro simplificado
    public static Funcionario cadastrarFuncionario(Scanner sc) {
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Idade: "); int idade = sc.nextInt(); sc.nextLine();
        System.out.print("CPF: "); String cpf = sc.nextLine();
        System.out.print("Passos iniciais: "); int passos = sc.nextInt(); sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Telefone: "); String telefone = sc.nextLine();
        System.out.print("Endereço: "); String endereco = sc.nextLine();
        System.out.print("Nascimento: "); String data = sc.nextLine();
        System.out.print("Altura: "); double altura = sc.nextDouble(); sc.nextLine();
        System.out.print("Cor dos olhos: "); String corOlho = sc.nextLine();
        System.out.print("Cargo: "); String cargo = sc.nextLine();
        System.out.print("Matrícula: "); String matricula = sc.nextLine();
        System.out.print("Salário: "); double salario = sc.nextDouble(); sc.nextLine();
        System.out.print("Setor: "); String setor = sc.nextLine();

        return new Funcionario(nome, idade, cpf, passos, email, telefone, endereco, data, altura, corOlho, cargo, matricula, salario, setor);
    }

    public static Estagiario cadastrarEstagiario(Scanner sc) {
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Idade: "); int idade = sc.nextInt(); sc.nextLine();
        System.out.print("CPF: "); String cpf = sc.nextLine();
        System.out.print("Passos iniciais: "); int passos = sc.nextInt(); sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Telefone: "); String telefone = sc.nextLine();
        System.out.print("Endereço: "); String endereco = sc.nextLine();
        System.out.print("Nascimento: "); String data = sc.nextLine();
        System.out.print("Altura: "); double altura = sc.nextDouble(); sc.nextLine();
        System.out.print("Cor dos olhos: "); String corOlho = sc.nextLine();
        System.out.print("Cargo: "); String cargo = sc.nextLine();
        System.out.print("Matrícula: "); String matricula = sc.nextLine();
        System.out.print("Salário: "); double salario = sc.nextDouble(); sc.nextLine();
        System.out.print("Setor: "); String setor = sc.nextLine();
        System.out.print("Horas estágio: "); int horas = sc.nextInt(); sc.nextLine();
        System.out.print("Bolsa: "); double bolsa = sc.nextDouble(); sc.nextLine();
        System.out.print("Ativo (true/false): "); boolean ativo = sc.nextBoolean(); sc.nextLine();

        return new Estagiario(nome, idade, cpf, passos, email, telefone, endereco, data, altura, corOlho, cargo, matricula, salario, setor, horas, bolsa, ativo);
    }
}
