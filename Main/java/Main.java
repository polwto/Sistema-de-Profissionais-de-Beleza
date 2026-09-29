
package Main.java;

import java.util.Scanner;




public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        boolean continuar = true;


        while (continuar) {


            String cidade = solicitarCidade(scanner);


            if (cidade.equals("Porto Alegre")) {


                mostrarProfissionaisPortoAlegre(scanner);


            } else if (cidade.equals("Canoas")) {


                mostrarProfissionaisCanoas(scanner);


            } else if (cidade.equals("Pelotas")) {


                mostrarProfissionaisPelotas(scanner);


            } else if (cidade.equals("Sair")) {


                continuar = false;


            } else {


                System.out.println("\nCidade não disponível no sistema.");
            }
        }


        System.out.println("\nSistema encerrado.");


        scanner.close();
    }




    public static String solicitarCidade(Scanner scanner) {


        System.out.print("\nDigite sua cidade (ou 'Sair' para encerrar): ");


        return scanner.nextLine();
    }




    public static void mostrarProfissionaisPortoAlegre(Scanner scanner) {


        System.out.println("\n=== PROFISSIONAIS DE PORTO ALEGRE ===");


        System.out.println("\n1 - Lucas Almeida");
        System.out.println("2 - Marina Costa");
        System.out.println("3 - Rafael Martins");


        System.out.print("\nEscolha um profissional: ");


        int escolha = scanner.nextInt();


        if (escolha == 1) {


            mostrarProfissional(
                    "Lucas Almeida",
                    "8 anos",
                    "Cortes masculinos",
                    "Degradê, low fade, mid fade, corte social e tesoura"
            );


            opcoesContato(
                    scanner,
                    "lucas.almeida@exemplo.com",
                    "(51) 90000-1001"
            );


        } else if (escolha == 2) {


            mostrarProfissional(
                    "Marina Costa",
                    "6 anos",
                    "Cortes femininos",
                    "Corte em camadas, long bob, corte reto e franja"
            );


            opcoesContato(
                    scanner,
                    "marina.costa@exemplo.com",
                    "(51) 90000-1002"
            );


        } else if (escolha == 3) {


            mostrarProfissional(
                    "Rafael Martins",
                    "10 anos",
                    "Barbearia clássica",
                    "Corte social, degradê, barba, pezinho e acabamento"
            );


            opcoesContato(
                    scanner,
                    "rafael.martins@exemplo.com",
                    "(51) 90000-1003"
            );


        } else {


            System.out.println("Profissional inválido.");
        }
    }




    public static void mostrarProfissionaisCanoas(Scanner scanner) {


        System.out.println("\n=== PROFISSIONAIS DE CANOAS ===");


        System.out.println("\n1 - Gabriel Souza");
        System.out.println("2 - Ana Luiza");
        System.out.println("3 - Matheus Oliveira");


        System.out.print("\nEscolha um profissional: ");


        int escolha = scanner.nextInt();


        if (escolha == 1) {


            mostrarProfissional(
                    "Gabriel Souza",
                    "5 anos",
                    "Cortes masculinos modernos",
                    "Taper fade, mid fade, low fade e desenhos"
            );


            opcoesContato(
                    scanner,
                    "gabriel.souza@exemplo.com",
                    "(51) 90000-2001"
            );


        } else if (escolha == 2) {


            mostrarProfissional(
                    "Ana Luiza",
                    "7 anos",
                    "Cortes femininos",
                    "Bob, long bob, camadas, franja e cabelos cacheados"
            );


            opcoesContato(
                    scanner,
                    "ana.luiza@exemplo.com",
                    "(51) 90000-2002"
            );


        } else if (escolha == 3) {


            mostrarProfissional(
                    "Matheus Oliveira",
                    "9 anos",
                    "Cabelo e barba",
                    "Degradê, tesoura, barba desenhada e acabamento"
            );


            opcoesContato(
                    scanner,
                    "matheus.oliveira@exemplo.com",
                    "(51) 90000-2003"
            );


        } else {


            System.out.println("Profissional inválido.");
        }
    }




    public static void mostrarProfissionaisPelotas(Scanner scanner) {


        System.out.println("\n=== PROFISSIONAIS DE PELOTAS ===");


        System.out.println("\n1 - João Pedro");
        System.out.println("2 - Carolina Mendes");
        System.out.println("3 - Diego Ferreira");


        System.out.print("\nEscolha um profissional: ");


        int escolha = scanner.nextInt();


        if (escolha == 1) {


            mostrarProfissional(
                    "João Pedro",
                    "11 anos",
                    "Barbearia masculina",
                    "Corte clássico, degradê, barba e acabamento"
            );


            opcoesContato(
                    scanner,
                    "joao.pedro@exemplo.com",
                    "(53) 90000-3001"
            );


        } else if (escolha == 2) {


            mostrarProfissional(
                    "Carolina Mendes",
                    "8 anos",
                    "Cortes femininos",
                    "Camadas, corte reto, franja e cabelos cacheados"
            );


            opcoesContato(
                    scanner,
                    "carolina.mendes@exemplo.com",
                    "(53) 90000-3002"
            );


        } else if (escolha == 3) {


            mostrarProfissional(
                    "Diego Ferreira",
                    "4 anos",
                    "Cortes modernos",
                    "Fade, taper, máquina, desenhos e acabamento"
            );


            opcoesContato(
                    scanner,
                    "diego.ferreira@exemplo.com",
                    "(53) 90000-3003"
            );


        } else {


            System.out.println("Profissional inválido.");
        }
    }




    public static void mostrarProfissional(
            String nome,
            String experiencia,
            String especializacao,
            String servicos) {


        System.out.println("\n=== PROFISSIONAL SELECIONADO ===");


        System.out.println("\nNome: " + nome);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Especialização: " + especializacao);
        System.out.println("Serviços: " + servicos);
    }




    public static void opcoesContato(
            Scanner scanner,
            String email,
            String whatsapp) {


        boolean continuar = true;


        while (continuar) {


            System.out.println("\n=== OPÇÕES ===");
            System.out.println("1 - Agendar horário");
            System.out.println("2 - Sair");
            System.out.println("3 - Voltar");


            System.out.print("\nEscolha uma opção: ");


            int opcao = scanner.nextInt();


            if (opcao == 1) {


                System.out.println("\n=== CONTATO PARA AGENDAMENTO ===");
                System.out.println("E-mail: " + email);
                System.out.println("WhatsApp: " + whatsapp);


            } else if (opcao == 2) {


                continuar = false;


                System.out.println("\nSaindo do sistema...");


                System.exit(0);


            } else if (opcao == 3) {


                continuar = false;


                System.out.println("\nVoltando...");


            } else {


                System.out.println("\nOpção inválida.");
            }
        }
    }
}
