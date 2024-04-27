public class Administrador extends Empregado {

    private double ajudaDeCusto; // Ajudas referentes a Viagens, estadias...
    private double novoSalario;

    public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double ajudaDeCusto) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double calcularNovosSalario(){
        novoSalario = salarioBase + ajudaDeCusto;
        return novoSalario;
    }

    public double defineINSS(){
        return super.defineINSS();
    }

    public double calcularSalario(double novoSalario){
        return super.calcularSalario(salarioBase + ajudaDeCusto);
    }

    public void exibe(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Porcentagem do INSS: " + defineINSS());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Salario + Custo: " + calcularNovosSalario());
        System.out.println("Salario Final: R$" + calcularSalario(novoSalario));
    }
}
