package distribuidoraPecas;

import java.util.Scanner;

public class cliente {
    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;
    public int idade;

    public void novoCliente(cliente c) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cadastro de clientes! ");
        System.out.println("Nome do cliente: ");
        c.nome = s.nextLine();
        System.out.println("Endereço: ");
        c.endereco = s.nextLine();
        System.out.println("Telefone: ");
        c.telefone = s.nextLine();
        System.out.println("CPF: ");
        c.cpf = s.nextLine();
        System.out.println("Idade: ");
        c.idade = s.nextInt();
    }

    public String getClientes() {
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: " + this.telefone + "\nCPF: " + this.cpf + "\nIdade: " + this.idade;
    }
    public void atualizarEnderecoCliente(String novoEndereco) {
        this.endereco = novoEndereco;
    }
    public String getCPF() {
        return "Nome: " + this.nome + "  CPF: " + this.cpf;
    }
}
