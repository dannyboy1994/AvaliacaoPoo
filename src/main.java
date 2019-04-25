import java.util.ArrayList;
import java.util.Scanner;

import distribuidoraPecas.*;


public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner novoInt = new Scanner(System.in);
        Scanner novoFloat = new Scanner(System.in);
        ArrayList<cliente> listaClientes = new ArrayList();
        ArrayList<entregas> listaEntrega = new ArrayList();
        ArrayList<estoque> listaEstoque = new ArrayList();
        ArrayList<fornecedores> listaFornecedores = new ArrayList<>();
        ArrayList<funcionarios> listaFuncionarios = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Acesse o sistema! Digite um número");
            System.out.println("1 - Fornecedores");
            System.out.println("2 - Entregas");
            System.out.println("3 - Estoque");
            System.out.println("4 - Funcionários");
            System.out.println("5 - Cliente");
            System.out.println("0 - Sair do programa");
            System.out.println("Opção desejada: ");
            opcao = novoInt.nextInt();

            if (opcao == 1) {
                String fazer = "z";
                fornecedores classeFornecedores = new fornecedores();

                while (!fazer.equals("s")) {

                    System.out.println("c - Cadastre um fornecedor");
                    System.out.println("d - Apresentar dados dos fornecedores");
                    System.out.println("n - Apresentar CNPJ dos fornecedores");
                    System.out.println("s - Voltar para início");
                    System.out.println("Digite a letra da opção: ");
                    fazer = s.nextLine();

                    if (fazer.equals("c")) {
                        fornecedores f = new fornecedores();
                        listaFornecedores.add(f);
                        classeFornecedores.cadastrarFornecedores(f);
                    }

                    if (fazer.equals("d")) {
                        for (int i = 0; i < listaFornecedores.size(); i++) {
                            System.out.println(listaFornecedores.get(i).getDados());
                        }
                    }

                    if (fazer.equals("n")) {
                        for (int i = 0; i < listaFornecedores.size(); i++) {
                            System.out.println(listaFornecedores.get(i).getCNPJ());
                        }
                    }
                }

            }

            if (opcao == 2) {
                String fazer = "z";
                entregas classeEntregas = new entregas();

                while (!fazer.equals("s")) {

                    System.out.println("r - Registrar entrega");
                    System.out.println("a - Atualizar Status da entrega");
                    System.out.println("n - Apresentar entegas");
                    System.out.println("s - Voltar para início");
                    System.out.println("Digite a letra da opção: ");
                    fazer = s.nextLine();

                    if (fazer.equals("r")) {
                        entregas e = new entregas();
                        listaEntrega.add(e);
                        classeEntregas.registrarEntrega(e);
                    }

                    if (fazer.equals("a")) {
                        for (int i = 0; i < listaEntrega.size(); i++) {
                            System.out.println("Índice - " + i);
                            System.out.println(listaEntrega.get(i).getEntregas());
                        }
                        int ind;
                        System.out.println("Índice da entrega: ");
                        ind = novoInt.nextInt();
                        System.out.println("Novo status: ");
                        listaEntrega.get(ind).atualizarEstadoEntrega(s.nextLine());
                    }

                    if (fazer.equals("n")) {
                        for (int i = 0; i < listaEntrega.size(); i++) {
                            System.out.println(listaEntrega.get(i).getEntregas());
                        }
                    }
                }
            }

            if (opcao == 3) {
                String fazer = "z";
                estoque classeEstoque = new estoque();

                while (!fazer.equals("s")) {

                    System.out.println("r - Registrar novo estoque");
                    System.out.println("a - Atualizar estoque");
                    System.out.println("n - Apresentar Estoque");
                    System.out.println("s - Voltar para início");
                    System.out.println("Digite a letra da opção: ");
                    fazer = s.nextLine();

                    if (fazer.equals("r")) {
                        estoque es = new estoque();
                        listaEstoque.add(es);
                        classeEstoque.novoEstoque(es);
                    }

                    if (fazer.equals("a")) {
                        for (int i = 0; i < listaEstoque.size(); i++) {
                            System.out.println("Índice - " + i);
                            System.out.println(listaEstoque.get(i).getEstoque());
                        }
                        int ind;
                        System.out.println("Índice do produto: ");
                        ind = s.nextInt();
                        System.out.println("Novo estoque: ");
                        listaEstoque.get(ind).atualizarQuantidadeEstoque(s.nextInt());
                    }

                    if (fazer.equals("n")) {
                        for (int i = 0; i < listaEstoque.size(); i++) {
                            System.out.println(listaEstoque.get(i).getEstoque());
                        }
                    }
                }
            }

            if (opcao == 4) {
                String fazer = "z";
                funcionarios classeFuncionarios = new funcionarios();

                while (!fazer.equals("s")) {

                    System.out.println("r - Cadastrar Funcionário");
                    System.out.println("f - Mostrar funcionários");
                    System.out.println("m - Apresentar salários");
                    System.out.println("s - Voltar para início");
                    System.out.println("Digite a letra da opção: ");
                    fazer = s.nextLine();

                    if (fazer.equals("r")) {
                        System.out.println("Quantos funcionários para cadastro: ");
                        int quant = novoInt.nextInt();
                        for (int i = 0; i < quant; i++) {
                            funcionarios novoFuncionario = new funcionarios();
                            System.out.println("Nome: ");
                            novoFuncionario.nome = s.nextLine();
                            System.out.println("E-mail: ");
                            novoFuncionario.email = s.nextLine();
                            System.out.println("CPF: ");
                            novoFuncionario.cpf = s.nextLine();
                            System.out.println("Salário: ");
                            novoFuncionario.salario = novoFloat.nextFloat();
                            System.out.println("Função: ");
                            novoFuncionario.funcao = s.nextLine();
                            System.out.println("Setor: ");
                            novoFuncionario.setor = s.nextLine();

                            listaFuncionarios.add(novoFuncionario);
                        }
                    }

                    if (fazer.equals("f")) {
                        for (int i = 0; i < listaFuncionarios.size(); i++) {
                            System.out.println(listaFuncionarios.get(i).getFuncionarios());
                        }
                    }
                    if (fazer.equals("m")) {
                        for (int i = 0; i < listaFuncionarios.size(); i++) {
                            System.out.println(listaFuncionarios.get(i).mostrarSalario());
                        }
                    }
                }
            }

            if (opcao == 5) {
                String fazer = "z";
                cliente classeClientes = new cliente();

                while (!fazer.equals("s")) {

                    System.out.println("c - Cadastre um cliente");
                    System.out.println("d - Apresentar dados dos clientes");
                    System.out.println("a - Cadastrar novo endereco");
                    System.out.println("n - Apresentar CPF dos clintes");
                    System.out.println("s - Voltar para início");
                    System.out.println("Digite a letra da opção: ");
                    fazer = s.nextLine();

                    if (fazer.equals("c")) {
                        cliente c = new cliente();
                        listaClientes.add(c);
                        classeClientes.novoCliente(c);
                    }
                    if (fazer.equals("d")){
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println("Índice - " + i);
                            System.out.println(listaClientes.get(i).getClientes());
                        } }

                    if (fazer.equals("a")) {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println("Índice - " + i);
                            System.out.println(listaClientes.get(i).getClientes());
                        }
                        int ind;
                        System.out.println("Índice do cliente: ");
                        ind = novoInt.nextInt();
                        System.out.println("Novo endereco: ");
                        listaClientes.get(ind).atualizarEnderecoCliente(s.nextLine());
                    }

                    if (fazer.equals("n")) {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println(listaClientes.get(i).getCPF());
                        }
                    }
                }
            }

        } while (opcao != 0);

    }
}