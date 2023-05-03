import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario;
        System.out.println("Digite um numero: ");
        numeroUsuario = sc.nextInt();
        diaDaSemana(numeroUsuario);
    }
    public static void diaDaSemana(int valor){
        int resto;
        resto = valor%7;
        switch (resto){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;

        }

    }
}
