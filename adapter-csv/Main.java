import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositorioDePessoas repositorio = new PessoaCsvAdapter("pessoas.csv");
        List<Pessoa> pessoas = repositorio.listarPessoas();

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
