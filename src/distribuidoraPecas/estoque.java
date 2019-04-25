package distribuidoraPecas;
import java.util.Scanner;

public class estoque {
    public String nomeProduto;
    public float valorUnitario;
    public int identificacao;
    public int quantidadeProduto;
    public String descricao;


    public void novoEstoque(estoque o) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Produto: ");
        o.nomeProduto = s.nextLine();
        System.out.println("Quantidade: ");
        o.quantidadeProduto = n.nextInt();
        System.out.println("Valor: ");
        o.valorUnitario = s.nextFloat();
        System.out.println("Número de identificação: ");
        o.identificacao = n.nextInt();
        System.out.println("Produto: ");
        o.descricao = s.nextLine();
    }

    public String getEstoque() {
        return "Produto: " + this.nomeProduto + "\nQuantidade em estoque: " +
                this.quantidadeProduto + "\nValor Total: " + this.valorUnitario +
                "\nIdentificação: " + this.identificacao + "\nDescricao: " + this.descricao;
    }

    public void atualizarQuantidadeEstoque(int novoEstoque) {
        this.quantidadeProduto = novoEstoque;
    }


}
