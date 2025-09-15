package senac.java;

// Classe base Pessoa
public class Pessoa {

    // Atributos da pessoa
    private String nome;
    private int idade;
    private String cpf;
    private int passos;
    private String email;
    private String telefone;
    private String endereco;
    private String datanascimento;
    private double altura;
    private String corDoOlho;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, String cpf, int passos, String email,
                  String telefone, String endereco, String datanascimento,
                  double altura, String corDoOlho) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.passos = passos;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.datanascimento = datanascimento;
        this.altura = altura;
        this.corDoOlho = corDoOlho;
    }

    // Métodos Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getPassosDados() { return passos; }
    public void setPassosDados(int passos) { this.passos = passos; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getDatanascimento() { return datanascimento; }
    public void setDatanascimento(String datanascimento) { this.datanascimento = datanascimento; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getCorDoOlho() { return corDoOlho; }
    public void setCorDoOlho(String corDoOlho) { this.corDoOlho = corDoOlho; }

    // Método falar - retorna frase com nome e idade
    public String falar() {
        return "Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.";
    }

    // Método andar - incrementa passos
    public String andar(int passos) {
        this.passos += passos;
        return nome + " andou " + passos + " passos.";
    }

    // toString unificado - mostra todos os atributos básicos da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome +
               " | Idade: " + idade +
               " | CPF: " + cpf +
               " | Email: " + email +
               " | Telefone: " + telefone +
               " | Endereço: " + endereco +
               " | Nascimento: " + datanascimento +
               " | Altura: " + altura +
               " | Cor dos olhos: " + corDoOlho;
    }
}
