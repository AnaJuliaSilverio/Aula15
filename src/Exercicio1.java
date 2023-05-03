import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUsuario;
        System.out.println("Digite um inteiro: ");
        valorUsuario = sc.nextInt();

        System.out.println(ehpar(valorUsuario));
    }

    public static boolean ehpar(int valorUsuario) {
        int restoDivisao, cont = 1, contNaoPar = 0;

        while (true) {
            restoDivisao = valorUsuario % cont;
            if (restoDivisao == 0) {
                if ((valorUsuario / cont) % 2 != 0) {
                    contNaoPar++;
                }
                break;
            } else {
                if (restoDivisao % 2 != 0) {
                    contNaoPar++;
                }
            }
            cont*=10;
        }
        if (contNaoPar==0) return true;
        else return false;
    }
}
