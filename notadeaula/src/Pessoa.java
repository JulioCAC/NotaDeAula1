public class Pessoa {
    double salarioLiquido, deducaoInss;
    public double calcInss(double x){
        deducaoInss = x * 0.15;
        return deducaoInss;
    }
    public double exibeSL(double x){
        salarioLiquido = x - deducaoInss;
        return salarioLiquido;
    }

}