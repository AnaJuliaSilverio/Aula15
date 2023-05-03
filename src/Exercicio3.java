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
            letra =  senhaUsuario.charAt(i);
            //usando caracteres especiais de acordo com a tabela ascii
            if (!(Character.isDigit(letra) || Character.isLetter(letra))){
                return false;
            }
        }
            return true;



    }
}
