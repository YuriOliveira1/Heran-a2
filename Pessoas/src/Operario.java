public class Operario extends Empregado{

    private double valorProducao;
    private double percentComissao;
    private double comissao;
    
    public Operario(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double valorProducao, double percentComissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase);
        this.valorProducao = valorProducao;
        this.percentComissao = percentComissao;
    }

    public double defineINSS(){
        return super.defineINSS();
    }

    public double calculaSalarioComComissao(){
        comissao = (valorProducao * percentComissao) / 100;
        return comissao;
    }

    public double calcularSalario(double comissao){
        return super.calcularSalario(salarioBase + comissao);
    }

    public void exibe(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Porcentagem do INSS: " + defineINSS());
        System.out.println("Porcentagem Comissão: " + percentComissao);
        System.out.println("Comissão: " + calculaSalarioComComissao());
        System.out.println("Salario Base: " + getSalarioBase());   
        System.out.println("Salario Final: R$" + calcularSalario(comissao));
    }
}


