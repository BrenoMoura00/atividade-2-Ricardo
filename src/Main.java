public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Filme 1", "Descrição 1", 120, 2021, 5.0, "Diretor 1");
        Serie serie = new Serie("Série 1", "Descrição 2", 45, 2021, 4.5, "Diretor 2", 1, 10);

        System.out.println(filme);
        System.out.println(serie);
    }
}