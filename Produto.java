public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double frete;
    CarrinhoDeCompras valorTotal;

    public Produto(String nome, double preco, int quantidade, double frete, CarrinhoDeCompras valorTotal) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.frete = frete;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public CarrinhoDeCompras getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(CarrinhoDeCompras valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public double getFrete() {
        return frete;
    }
    
    public void setFrete(double frete) {
        this.frete = frete;
    }
    
    public void CalcularTotal(double valorTotal, double preco, int quantidade) {
        valorTotal = (preco * quantidade);
    }
}