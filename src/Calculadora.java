import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Main Calculo = new Main();
        int calculo;
        do {
            System.out.println(
                            "------------------\n" +
                            "| 1º Somar       |\n" +
                            "| 2º Subtrair    |\n" +
                            "| 3º Multiplicar |\n" +
                            "| 4º Dividir     |\n" +
                            "------------------"
            );
            System.out.print("Escolha uma operação: ");
            calculo = scan.nextInt();

            if (calculo == 1) {
                Calculo.Soma();
            }
            if (calculo == 2) {
                Calculo.Subtração();
            }
            if (calculo == 3) {
                Calculo.Multiplicar();
            }
            if (calculo == 4) {
                Calculo.Divisão();
            } else {
                System.out.println("Digite um valor valido");
            }
        }while(calculo != 1 && calculo != 2 && calculo != 3 && calculo != 4);

    }
}
