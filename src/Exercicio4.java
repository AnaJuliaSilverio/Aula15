import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorUSuario;
        System.out.println("Digite o valor em polegadas: ");
        valorUSuario = sc.nextDouble();
        System.out.println("O valor "+valorUSuario+" em metros eh "+convertePolegadasMetros(valorUSuario)+ " metros");
    }
    public static double convertePolegadasMetros(double polegadas){
        double metros = polegadas * (0.0254);
        return metros;
    }
}
