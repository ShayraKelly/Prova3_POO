public class ClienteEspecial extends Pessoa{
    private String identificacao;

    public ClienteEspecial(String nome, String telefone, String endereco, String identificacao) {
        super(nome, telefone, endereco);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
}