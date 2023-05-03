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
        int restoDivisao, cont = 0, contNaoPar = 0,tamanhoValorUsuario;

        String valorEmString = String.valueOf(valorUsuario);
        tamanhoValorUsuario= valorEmString.length();


        while (cont<tamanhoValorUsuario) {
            restoDivisao = valorUsuario %10;
            //System.out.println("RESTO "+restoDivisao);
            if (restoDivisao%2!=0){
                contNaoPar++;
            }
            valorUsuario /= 10;
            cont ++;
        }
        if (contNaoPar==0) return true;
        else return false;
    }
}
