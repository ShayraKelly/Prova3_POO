public class CarrinhoDeCompras {
    private double valorTotal;
    Pessoa pessoa;
    Produto produto;
    
    public CarrinhoDeCompras(double valorTotal, Pessoa pessoa, Produto produto) {
        this.valorTotal = valorTotal;
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void AdicionarProduto() {
        getProduto();
    }

    public void RemoverProduto() {
        remove getProduto;
    }

    public void CalcularTotalCompra() {
        
    }
}