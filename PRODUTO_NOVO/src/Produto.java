import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Produto{
    //Definição dos atributos privados
    String nome;
    double preco_custo, preco_venda;
    String data_fab, data_val;

    //Método construtor com todos o itens
    public Produto(String nome, double preco_custo, double preco_venda, String data_fab, String data_val){
        this.nome=nome;
        this.preco_custo=preco_custo;
        this.data_fab=data_fab;
        this.data_val=data_val;
        this.preco_venda=preco_venda;
    }

    //Método construtor utilizando o conceito de Sobrecarga, com 4 itens
    public Produto(String nome, double preco_venda, String data_fab,double preco_custo){
        this.nome=nome;
        this.data_fab=data_fab;
        this.preco_custo=preco_custo;
        this.preco_venda=preco_venda;
    }

    //Método construtor utilizando o conceito de Sobrecarga, com 4 itens
    public Produto(String nome, double preco_custo){
        this.nome=nome;
        this.preco_custo=preco_custo;
    }

    //Método getter para o Nome
    public String getNome() {
        return nome;
    }

    //Método getter para o Preço do custo
    public double getPreco_custo() {
        return preco_custo;
    }

    //Método que calcula o preço da venda
    private double calculoVenda(){
        double aux = 0.1 * this.preco_custo;
        this.preco_venda= aux+this.preco_custo;
        return this.preco_venda;
    }

    //Método getter do preço da venda
    public double getPreco_venda() {
        return calculoVenda();
    }

    //Método que converte a string data de fabricação em uma data no formato dd/MM/yyyy
    private String converteData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(this.data_fab, formatter);
        return data.format(formatter);
    }

    //Método getter da data de fabricação
    public String getData_fab() {
        return converteData();
    }

    //Método que adiona um mês em relação a data de fabricação, dando "origem" a data de validade
    private String adicionaMes(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(this.data_fab, formatter);
        LocalDate data_val = data.plusMonths(1);
        return data_val.format(formatter);
    }

    //Método getter da data de validade
    public String getData_val() {
            return adicionaMes();
    }
    
}