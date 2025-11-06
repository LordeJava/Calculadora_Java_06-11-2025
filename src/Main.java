import java.util.Scanner;

public class Main {
    Scanner scan1 = new Scanner(System.in);
    public void Soma(){
        System.out.print("Digite o primeiro numero: ");
        int soma1 = scan1.nextInt();
        System.out.print("Digite o segundo numero: ");
        int soma2 = scan1.nextInt();
        int soma3 = soma1 + soma2;
        System.out.println("Resultado: "+ soma3);
    }

    public void Subtração(){
        System.out.print("Digite o primeiro numero: ");
        int soma1 = scan1.nextInt();
        System.out.print("Digite o segundo numero: ");
        int soma2 = scan1.nextInt();
        int soma3 = soma1 - soma2;
        System.out.println("Resultado: "+ soma3);
    }

    public void Multiplicar(){
        System.out.print("Digite o primeiro numero: ");
        int soma1 = scan1.nextInt();
        System.out.print("Digite o segundo numero: ");
        int soma2 = scan1.nextInt();
        int soma3 = soma1 * soma2;
        System.out.println("Resultado: "+ soma3);
    }

    public void Divisão(){

        System.out.print("Digite o primeiro numero: ");
        int soma1 = scan1.nextInt();
        System.out.print("Digite o segundo numero: ");
        int soma2 = scan1.nextInt();
        if(soma2 == 0){
           System.out.println("Impossivel realizar divisão por zero");
        }else {
            int soma3 = soma1 / soma2;
            System.out.println("Resultado: " + soma3);
        }
    }

    }
