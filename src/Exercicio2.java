import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valorUsuario;
        System.out.println("Digite uma palavra: ");
        valorUsuario = sc.next();
        valorUsuario= valorUsuario.toLowerCase();
        System.out.println(ehVogal(valorUsuario));
    }
    public static boolean ehVogal(String valorUsuario){
        int contNaoVogal=0;
        for (int i = 0; i < valorUsuario.length(); i++) {
            if (!(valorUsuario.charAt(i)=='a'||valorUsuario.charAt(i)=='e'||valorUsuario.charAt(i)=='i'||valorUsuario.charAt(i)=='o'||valorUsuario.charAt(i)=='u')){
                return false;
            }
        }
         return true;
    }
}