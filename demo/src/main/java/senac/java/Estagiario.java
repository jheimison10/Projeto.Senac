package senac.java;

public class Estagiario extends Pessoa {

    private String cargo;
    private String matricula;
    private double salario;
    private String setor;
    private int horasEstagio;
    private double bolsaAuxilio;
    private boolean ativo;

    public Estagiario(
        String nome,
        int idade,
        String cpf,
        int passos,
        String email,
        String telefone,
        String endereco,
        String datanascimento,
        double altura,
        String corDoOlho,
        String cargo,
        String matricula,
        double salario,
        String setor,
        int horasEstagio,
        double bolsaAuxilio,
        boolean ativo
    ) {
        super(nome, idade, cpf, passos, email, telefone, endereco, datanascimento, altura, corDoOlho);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;
        this.horasEstagio = horasEstagio;
        this.bolsaAuxilio = bolsaAuxilio;
        this.ativo = ativo;
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

    public int getHorasEstagio() { return horasEstagio; }
    public void setHorasEstagio(int horasEstagio) { this.horasEstagio = horasEstagio; }

    public double getBolsaAuxilio() { return bolsaAuxilio; }
    public void setBolsaAuxilio(double bolsaAuxilio) { this.bolsaAuxilio = bolsaAuxilio; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    // Salário final com desconto R$200 se ativo
    public double calcularSalarioFinal() {
        if (ativo) {
            return salario - 200.0;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Estagiário: " + getNome() +
               " | Cargo: " + cargo +
               " | Matrícula: " + matricula +
               " | Setor: " + setor +
               " | Salário base: R$" + salario +
               " | Bolsa: R$" + bolsaAuxilio +
               " | Horas: " + horasEstagio +
               " | Ativo: " + ativo +
               " | Salário final: R$" + calcularSalarioFinal();
    }
}
