public class Empregado extends Pessoa{

   
    private int numeroSecao;
    protected double salarioBase; // Vencimento Base

    private double INSS; // Percentagem a ser retida do salario

    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase) {
        super(nome, idade, altura, peso);
        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
    }

    public double defineINSS(){
        if (salarioBase <= 1100) {
            INSS = 7.5;
        } else if (salarioBase > 1100 && salarioBase <= 2203.48) {
            INSS = 9;
        } else if (salarioBase > 2203.48 && salarioBase <= 3305.22) {
            INSS = 12;
        } else if (salarioBase > 3305.22) {
            INSS = 14;  
        }
        return INSS;
    }

    public double calcularSalario(double salarioBase) {
        double INSS = defineINSS(); 
        double deducaoINSS = (salarioBase * INSS) / 100; 
        // salarioBase -= deducaoINSS; 
        double salarioFodase = salarioBase - deducaoINSS;
        return salarioFodase;
    }

    public void exibe(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Numero da Seção: " + numeroSecao);
        System.out.println("Salario Base: R$" + salarioBase);
        System.out.println("Porcentagem do INSS: " + defineINSS());
        System.out.println("Salario Final: R$" + calcularSalario(salarioBase));
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double getINSS() {
        return INSS;
    }
}
