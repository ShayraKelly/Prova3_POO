public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int limite; 

    public Pessoa(String nome, String telefone, String endereco, int limite) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limite = limite;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public boolean compra(int qtd){
        if (qtd > getLimite()) {
            return true;
        }
        else{
            return false;
        }
    }

}