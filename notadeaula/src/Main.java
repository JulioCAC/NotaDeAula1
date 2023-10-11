import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Informe seu salário bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Dedução Inss: " + p.calcInss(salarioBruto));
        System.out.println("Salário liquido: " + p.exibeSL(salarioBruto));

    }
}
