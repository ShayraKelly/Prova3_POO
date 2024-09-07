import java.util.ArrayList;

public class CarrinhoDeCompras {
    private double valorTotal;
    private Pessoa pessoa;
    private ArrayList<Produto> produto;
    
    public CarrinhoDeCompras(double valorTotal, Pessoa pessoa, Produto produto) {
        this.valorTotal = valorTotal;
        this.pessoa = pessoa;
        this.produto = new ArrayList<>();
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

    public void AdicionarProduto(Produto produto) {
        boolean verifica = getPessoa().compra(produto.getQuantidade());
        if(verifica){
            this.produto.add(produto);
        }
        else{
            System.out.println("Produto excedendo limite");;
        }
    }

    public void RemoverProduto(Produto produto) {
        this.produto.remove(produto);
    }

    public double CalcularTotalCompra(){
        int totalProdutos = produto.size();
        double soma = 0;
        for(int x = 0; x < totalProdutos; x++){
            soma = soma + produto.get(x).calcularTotal();
        }
        return soma;
    }
}