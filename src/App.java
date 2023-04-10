import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Início do Programa
      // Declaração de Variaveis
      double latas;
      double area;
      double custo;
      double galao;
      double custo_galao;
      double latas_galao;
      double custo_latas_galao;

     // Solicitação de Dados
     System.out.println("Informe a área em metros quadrados a ser pintada: " );
     Scanner teclado = new Scanner (System.in);
     area = teclado.nextDouble();
     teclado.close();

     // Calcular Latas Galões e Custo
     latas = Math.ceil (area / 108);
     custo = latas * 80;
     galao = Math.ceil (area / 21.6);
     custo_galao = galao * 25;
     latas_galao = Math.ceil (area / 129.6);
     custo_latas_galao = latas_galao * 105;
        
     // Calcular quantidade total de tinta necessária com 10% de folga
     double litrosTotal = area / 6.0 * 1.1;

     // Calcular a quantidade de latas e galões necessários para minimizar o desperdício
     double latasMistura = Math.floor(litrosTotal / 18.0);
     double galoesMistura = Math.ceil((litrosTotal - latasMistura * 18.0) / 3.6);

     // Calcular custo total da mistura
     double custoMistura = latasMistura * 80.0 + galoesMistura * 25.0;

     // Informar quantas latas de 18 litros e galões de 3.6 litros vai precisar e valor total
     System.out.println("Opção 1 - Comprar apenas latas de 18 litros:");
     System.out.println("Você precisará de " + latas + " latas de 18 litros");
     System.out.println("O Valor total é R$" + custo);

     System.out.println("Opção 2 - Comprar apenas galões de 3.6 litros:");
     System.out.println("Você precisará de " + galao + " galões de 3.6 litros");
     System.out.println("O valor total é R$" + custo_galao);

     System.out.println("Opção 3 - Misturar latas e galões:");
     System.out.println("Você precisará de " + latasMistura + " latas de 18 litros e " + galoesMistura + " galões de 3.6 litros");
     System.out.println("O valor total é R$" + custoMistura);
    }
}
