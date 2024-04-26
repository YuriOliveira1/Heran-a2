public class Pessoa {

    // Atributos

    private String nome;

    private int idade;

    private double altura;

    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void exibe(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + altura);
        System.out.println("Altura: " + peso);
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}
