package distribuidoraPecas;

import java.util.Scanner;

public class fornecedores {
    public String nome;
    public String endereco;
    public String telefone;
    public String cnpj;
    public String email;


    public String getDados() {
        return "Nome: " + this.nome + "  Telefone: " + this.telefone +
                "  Endereço: " + this.endereco + "  E-mail: " + this.email;
    }

    public String getCNPJ() {
        return "Nome: " + this.nome + "  CNPJ: " + this.cnpj;
    }

    public void cadastrarFornecedores(fornecedores f) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cadastro de fornecedores! ");
        System.out.println("Nome da empresa: ");
        f.nome = s.nextLine();
        System.out.println("Endereço: ");
        f.endereco = s.nextLine();
        System.out.println("Telefone: ");
        f.telefone = s.nextLine();
        System.out.println("CNPJ: ");
        f.cnpj = s.nextLine();
        System.out.println("E-mail: ");
        f.email = s.nextLine();
    }
}