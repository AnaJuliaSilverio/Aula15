import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaUsuario;

        while (true){
            System.out.println("Digite sua senha");
            senhaUsuario = sc.next();
            if (verificaSenha(senhaUsuario)){
                break;
            }
        }
    }
    public static boolean verificaSenha(String senhaUsuario){
        char letra;
        if (!(senhaUsuario.length()<10 && senhaUsuario.length()>2)){
            return false;
        }
        for (int i = 0; i <senhaUsuario.length() ; i++) {
            //convertendo pra inteiro
            int letraASCII = (int) senhaUsuario.charAt(i);
            //usando caracteres especiais de acordo com a tabela ascii
            if (((32<=letraASCII && letraASCII<=47)||(58<=letraASCII && letraASCII<=64)||(91<=letraASCII && letraASCII<=96)||(123<=letraASCII && letraASCII<=126))){
                return false;
            }
        }
            return true;



    }
}
