# 🚀 Projeto Senac

Projeto criado como parte das atividades do curso técnico em informatica no **Senac**. O objetivo é aplicar conceitos de programação em Java com estrutura Maven, Sistema de Cadastro de Funcionários, Estagiários, Pessoa.
Este projeto Java é um sistema simples de cadastro e exibição de **Funcionários** , **Estagiários** e **Pessoa** com base em uma hierarquia de classes que utiliza os princípios da **Programação Orientada a Objetos**, como **herança**, **composição** e **encapsulamento**.

## 📋 Descrição

O sistema permite:

- Criar objetos de funcionários e estagiários com dados fixos.
- Cadastrar novos funcionários e estagiários via entrada do usuário.
- Exibir os dados formatados no console.

O projeto conta com uma estrutura de classes onde `Funcionario` e `Estagiario` herdam atributos da classe `Pessoa`, promovendo reutilização de código e melhor organização.

---

## 🔍 Estrutura de Herança

```plaintext
Pessoa
├── Funcionario
└── Estagiario
```

## 🗂️ A classe Pessoa define atributos comuns como:

Nome
Idade
CPF
Email
Telefone
Endereço
Data de nascimento
Altura
Cor dos olhos
As subclasses adicionam suas próprias informações específicas:
Funcionario: matrícula, cargo, setor, salário
Estagiario: horas de estágio, valor da bolsa, status (ativo ou não)

    

## 📷 Capturas de Tela


## 🖥️ Execução no Console

Abaixo, um exemplo da execução do programa no terminal:

![Execução no terminal](imagens/execucao.png)

> A imagem pode mostrar o terminal após cadastrar um Funcionário e um Estagiário, com os dados sendo exibidos em formato legível.



## 📚 Descrição

Este projeto é uma aplicação simples feita em **Java + Maven**, com estrutura modularizada e orientada a objetos. Foi desenvolvido como exercício prático de organização de projetos e boas práticas em Java.


🚀 Funcionalidades

✅ Cadastro de Funcionário via terminal
✅ Cadastro de Estagiário via terminal
✅ Impressão formatada dos dados cadastrados
✅ Uso de herança para compartilhamento de atributos
✅ Aplicação prática de classes, objetos e construtores
✅ Exibe uma mensagem no console
✅ Estrutura de projeto organizada com Maven
✅ Pastas separadas para código e arquivos compilados
✅ Uso de `pom.xml` para gerenciar dependências


---

🛠️ Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-Automation-red)
![Git](https://img.shields.io/badge/Git-Versionamento-orange)

- Java 17
- Apache Maven
- Git e GitHub
- Java 17 ou superior
- Scanner (entrada de dados via terminal)
- Paradigmas: Programação Orientada a Objetos (POO)

---

🗂️ Estrutura do Projeto
senac/java/
│
├── Main.java         # Classe principal (execução do programa)
├── Pessoa.java       # Superclasse com atributos comuns
├── Funcionario.java  # Herda de Pessoa e adiciona dados de funcionário
└── Estagiario.java   # Herda de Pessoa e adiciona dados de estágio

---


## 👨‍💻 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/jheimison10/Projeto.Senac.git
cd Projeto.Senac/demo
Compile o projeto com Maven:

bash
2. Copiar código
mvn clean package
Execute a aplicação:

bash
3. Copiar código
java -cp target/classes senac.java.Main
```


## 🔄 Status do Projeto

🟢 Concluído
🛠️ Ou: Em desenvolvimento


## 💡 Melhorias Futuras (opcional)

✅Interface gráfica com JavaFX
✅Suporte a entrada de dados pelo usuário
✅Exportar resultado para arquivo .txt ou .json


👤 Autor


## Jheimison Gomes
📧 jheimison_gomes@hotmail.com

📍 Boa Vista - RR

🗂️GitHub 

📚Aluno do curso técnico do Senac




## 📎 Links úteis (opcional)

✅Documentação do Java

✅Guia Maven

✅Markdown Guide


## 📝 Observações

Este projeto é ideal para fins educacionais e acadêmicos.

Pode ser estendido com recursos como:

Armazenamento em arquivos (persistência)

Interface gráfica (Swing ou JavaFX)

Integração com banco de dados (JDBC)
