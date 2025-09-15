package senac.java;

// Funcionario estende Pessoa
public class Funcionario extends Pessoa {

    private String cargo;
    private String matricula;
    private double salario;
    private String setor;

    // Construtor
    public Funcionario(String nome, int idade, String cpf, int passos, String email,
                       String telefone, String endereco, String datanascimento,
                       double altura, String corDoOlho, String cargo,
                       String matricula, double salario, String setor) {
        super(nome, idade, cpf, passos, email, telefone, endereco, datanascimento, altura, corDoOlho);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;
    }

    // Getters e Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    // Calcula salário final com desconto de 500 reais
    public double calcularSalarioFinal() {
        return salario - 500.0;
    }

    // toString unificado para Funcionario
    @Override
    public String toString() {
        return super.toString() + 
               " | Cargo: " + cargo +
               " | Matrícula: " + matricula +
               " | Setor: " + setor +
               " | Salário base: R$" + salario +
               " | Salário final: R$" + calcularSalarioFinal();
    }
}
