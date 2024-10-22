public class Serie extends Filme{
    private int temporadas;
    private int episodios;

    public Serie(String nome, String descricao, int duracao, int anoLancamento, double avaliacao, String diretor, int temporadas, int episodios) {
        super(nome, descricao, duracao, anoLancamento, avaliacao, diretor);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie{" +
                "Nome: '" + getNome() + '\'' +
                ", Descrição: '" + getDescricao() + '\'' +
                ", Duração: " + getDuracao() +
                ", Ano de Lançamento:" + getAnoLancamento() +
                ", Avaliação: " + getAvaliacao() +
                ", Diretor: '" + getDiretor() + '\'' +
                "temporadas:" + temporadas +
                ", episódios: " + episodios +
                '}';
    }
}
