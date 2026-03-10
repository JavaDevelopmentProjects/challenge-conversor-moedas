package br.com.alura.coinconverter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura  = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        int opcao = 0;

        String menu = """
                ***************************************************
                Seja bem vindo/a ao Conversor de moedas
                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileiro
                4) Real brasileiro => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Sair
                
                Escolha uma opção válida:
                ***************************************************
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 7) break;

            String de = "", para = "";

            switch (opcao) {
                case 1 -> { de = "USD"; para = "ARS"; }
                case 2 -> { de = "ARS"; para = "USD"; }
                case 3 -> { de = "USD"; para = "BRL"; }
                case 4 -> { de = "BRL"; para = "USD"; }
                case 5 -> { de = "USD"; para = "COP"; }
                case 6 -> { de = "COP"; para = "USD"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();

            try {
                Moedas taxas = consulta.buscaTaxas(de);
                double taxaDeConversao = taxas.conversion_rates().get(para);
                double valorConvertido = valor * taxaDeConversao;

                System.out.printf("Valor %.2f [%s] corresponde ao valor final de ==> %.2f [%s]%n",
                        valor, de, valorConvertido, para);
            } catch (Exception e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }
        }
        System.out.println("Programa finalizado.");

    }
}
