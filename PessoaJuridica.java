public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String representante;
    
    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String representante) {
        super(nome, telefone, endereco, 10);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRepresentante() {
        return representante;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

}
