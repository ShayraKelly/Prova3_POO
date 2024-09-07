public class ProdutoFisico extends Produto{
    private double peso;
    private double frete;
    
    public ProdutoFisico(String nome, double preco, int quantidade, double frete, CarrinhoDeCompras valorTotal,
            double peso, double frete2) {
        super(nome, preco, quantidade, frete, valorTotal);
        this.peso = peso;
        frete = frete2;
    }
    
    public double getPeso() {
        return peso;
    }    
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    
    public void CalcularFrete(double setFrete){
        if (peso < 2.00) {
            setFrete = 5.00;
        }if(peso > 2.00) {
            if (peso < 5.00) {
                setFrete = 10.00;
            }
        }if (peso > 5.00) {
            setFrete = (peso * 2.50);
        }
    }

    public void CalcularTotal(double valorTotal) {
        valorTotal = valorTotal + frete;
    }
}