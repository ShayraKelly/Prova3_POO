public class ProdutoFisico extends Produto{
    private double peso;
    private double frete;
    
    public ProdutoFisico(String nome, double preco, int quantidade, double frete, double peso) {
        super(nome, preco, quantidade, 0);
        this.peso = peso;
        this.frete = frete;
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
            setFrete(5.00);
        }if(peso >= 2.00) {
            if (peso <= 5.00) {
                setFrete(10.00);
            }
        }if (peso > 5.00) {
            setFrete(peso * 2.50);
        }
    }

    public double calcularTotal() {
        double somaValor = super.getPreco() * super.getQuantidade();
        double valorTotal = somaValor + frete;
        super.setValorTotal(valorTotal);
        return valorTotal + frete;
    }
}