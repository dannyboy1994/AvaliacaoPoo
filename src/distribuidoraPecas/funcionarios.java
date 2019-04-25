package distribuidoraPecas;

public class funcionarios {
    public String nome;
    public String funcao;
    public float salario;
    public String setor;
    public String email;
    public String cpf;


    public String getFuncionarios() {
        return "\n\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nE-mail: " + this.email + "\nFunção: " + this.funcao + "\nSetor: " + this.setor;
    }

    public String mostrarSalario() {
        return "Nome: " + this.nome + "Salário: " + this.salario;
    }

}
