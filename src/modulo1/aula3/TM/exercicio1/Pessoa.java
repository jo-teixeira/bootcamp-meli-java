package bootcamp.exercicio1;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf.replaceAll("[^\\d]", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("[^\\d]", "");
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return pessoa.getCpf().compareTo(this.cpf);
    }
}
