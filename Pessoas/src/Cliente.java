public class Cliente extends Pessoa {

    private double credMax;
    private double valorEmDivida;
    private double saldo;

    public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida){
        super(nome, idade, altura, peso);
        this.credMax = credMax;
        this.valorEmDivida = valorEmDivida;
    }

    public double obterSaldo(){
        saldo = credMax - valorEmDivida;
        return saldo;
    }

    public void exibe(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Credito Maximo: " + credMax);
        System.out.println("Valor em Divida: " + valorEmDivida);
        System.out.println("Saldo: " + obterSaldo());
    }
}
