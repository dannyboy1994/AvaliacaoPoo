package distribuidoraPecas;
import java.util.Scanner;

public class entregas {
    public String produtosEntregar;
    public String nomeCliente;
    public String endereco;
    public float valorEntrega;
    public String estadoEntrega;


    public String getEntregas() {
        return "Produto: " + this.produtosEntregar + "  Cliente: " + this.nomeCliente +
                "  Endereço: " + this.endereco + "  Estado da Entrega: " + this.estadoEntrega + "  Valor: " + this.valorEntrega;
    }

    public void atualizarEstadoEntrega(String novoEstado) {
        this.estadoEntrega = novoEstado;
    }

    public void registrarEntrega(entregas e) {
        Scanner s = new Scanner(System.in);
        System.out.println("Registrar Entrega! ");
        System.out.println("Produtos: ");
        e.produtosEntregar = s.nextLine();
        System.out.println("Cliente: ");
        e.nomeCliente = s.nextLine();
        System.out.println("Endereço: ");
        e.endereco = s.nextLine();
        System.out.println("Estado da entrega: ");
        e.estadoEntrega = s.nextLine();
        System.out.println("Valor: ");
        e.valorEntrega = s.nextFloat();

    }

}
