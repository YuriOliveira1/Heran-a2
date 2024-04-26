public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Yuri";
        int idade = 18;
        double altura = 178;
        double peso = 94;

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
        Empregado empregado = new Empregado(nome, idade, altura, peso, 169, 5405.55);
        Cliente cliente = new Cliente(nome, idade, altura, peso, 1200, 800);

        pessoa.exibe();
        System.out.println();
        empregado.exibe();
        System.out.println();
        cliente.exibe();
    }
}
