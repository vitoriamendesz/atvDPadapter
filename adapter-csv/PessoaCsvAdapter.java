import java.io.*;
import java.util.*;

public class PessoaCsvAdapter implements RepositorioDePessoas {
    private String caminhoArquivo;

    public PessoaCsvAdapter(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            boolean primeiraLinha = true;
            while ((linha = leitor.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String nome = partes[0].trim();
                    int idade = Integer.parseInt(partes[1].trim());
                    String email = partes[2].trim();
                    pessoas.add(new Pessoa(nome, idade, email));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return pessoas;
    }
}
