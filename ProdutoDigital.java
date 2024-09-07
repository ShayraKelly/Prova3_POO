public class ProdutoDigital extends Produto{
    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade, double frete, CarrinhoDeCompras valorTotal,
            int tamanhoArquivo) {
        super(nome, preco, quantidade, frete, valorTotal);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void setFrete(double frete){
        frete = 0;
    }
    
    public void CalcularTotal(double valorTotal, double frete) {
        valorTotal = valorTotal + frete;
    }
}