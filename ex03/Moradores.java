public class Morador{
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private int apartamento;
    private int codAcesso;
    private static int codSequencial = 1;
    private int codMorador;

    public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, int apartamento, int codAcesso){
       this.nome = nome;
       this.cpf = cpf;
       this.celular = celular;
       this.dataNascimento = dataNascimento;
       this.sexo = sexo;
       this.bloco = bloco;
       this.apartamento = apartamento;
       this.codAcesso = codAcesso;
       this.codMorador = codSequencial++;
    }

    

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getDataNasc() {
        return this.dataNascimento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getBloco() {
        return this.bloco;
    }

    public int getApartamento() {
        return this.apartamento;
    }

    public int getCodAcesso() {
        return this.codAcesso;
    }

    public int getCodMorador() {
        return this.codMorador;
    }

    public String toString() {
        return "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nCelular: " + getCelular() +
                "\nData de nascimento: " + getDataNasc() +
                "\nSexo: " + getSexo() +
                "\nBloco: " + getBloco() +
                "\nApartamento: " + getApartamento() +
                "\nCódigo de Acesso: " + getCodAcesso() +
                "\nCod Sequencial: 000" + getCodMorador() +
                "\n___________________\n";
    }
}
