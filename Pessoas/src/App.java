import java.util.List;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Yuri";
        int idade = 18;
        double altura = 178;
        double peso = 94;
        int numeroSecao = 169;
        double salarioBase = 4000;
        double ajudaDeCusto = 600;
        double valorProducao = 1200;
        double percentComissao = 5;
        double valorVenda = 1200;

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
        Empregado empregado = new Empregado(nome, idade, altura, peso, numeroSecao, salarioBase);
        Cliente cliente = new Cliente(nome, idade, altura, peso, 1200, 800);
        Administrador adm = new Administrador(nome, idade, altura, peso, numeroSecao, salarioBase, ajudaDeCusto);
        Operario operario = new Operario(nome, idade, altura, peso, numeroSecao, salarioBase, valorProducao, percentComissao);
        Vendendor vendendor = new Vendendor(nome, idade, altura, peso, numeroSecao, salarioBase, valorVenda, percentComissao);

        List<Pessoa> pessoas = Arrays.asList(pessoa, empregado, cliente, adm, operario, vendendor);
        for (Pessoa p : pessoas){
            p.exibe();
            System.out.println();
        }
    }
}
