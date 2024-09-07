public class ProdutoDigital extends Produto{
    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade, int tamanhoArquivo) {
        super(nome, preco, quantidade, 0);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    public double calcularTotal() {
        double valorTotal = super.getPreco() * super.getQuantidade();
        super.setValorTotal(valorTotal);
        return valorTotal;
    }
}