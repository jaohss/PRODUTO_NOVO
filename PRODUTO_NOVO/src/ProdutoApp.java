import java.util.Scanner;
public class ProdutoApp {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        //Instanciando objetos cada um com um construtor diferente, com seus dados
        Produto p1 = new Produto("Farofa", 12.50);
        Produto p2 = new Produto("Farofa", 0, "26/06/2024", 12.50);
        Produto p3 = new Produto("Farofa", 12.50, 0, "26/06/2024", null);

        //Saída de dados
        System.out.println("Nome do produto: "+p1.nome);
        System.out.println("Preço do custo: R$"+p1.preco_custo);
        System.out.println("Preço de venda: R$"+p2.getPreco_venda());
        System.out.println("Data de fabricação: "+p3.getData_fab());
        System.out.println("Data de validade: "+p3.getData_val());

        scn.close();
    }
}
