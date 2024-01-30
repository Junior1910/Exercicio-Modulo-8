package Pacotei1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class NotasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoBrasileiro = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        DecimalFormat formatopreco = new DecimalFormat("#,##0.00");
        formatopreco.applyPattern("###,###,###,###,##0.00");

        int nota1, nota2, nota3, nota4;
        String nome = "João Félix";
        System.out.print("Digite a primeira nota do aluno João Félix: ");
        nota1 = scanner.nextInt();
        System.out.print("Digite a segunda nota do aluno João Félix: ");
        nota2 = scanner.nextInt();
        System.out.print("Digite a terceira nota do aluno João Félix: ");
        nota3 = scanner.nextInt();
        System.out.print("Digite a quarta nota do aluno João Félix: ");
        nota4 = scanner.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nA Média final do aluno " +nome+ " é: " +media);
    }
}
