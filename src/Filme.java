public class Filme{
    private String nome;
    private String descricao;
    private int duracao;
    private int anoLancamento;
    private double avaliacao;
    private String diretor;

    public Filme(String nome, String descricao, int duracao, int anoLancamento, double avaliacao, String diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "Nome: '" + nome + '\'' +
                ", Descrição:'" + descricao + '\'' +
                ", Duracao por episódio: " + duracao +
                ", Ano de Lançamento: " + anoLancamento +
                ", Avaliação: " + avaliacao +
                ", Diretor:'" + diretor + '\'' +
                '}';
    }
}
