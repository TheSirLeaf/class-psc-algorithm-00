import java.util.Scanner;
public class Sala {
    public static void main(String[] Args) {
        String salaDesejada = "A219";
        String salaInformada = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sala:");
        salaInformada = scan.next();

        if(salaDesejada.equals(salaInformada)) {
            System.out.println("Você está no caminho certo.");
        } else {
            System.out.println("Você está perdido(a), se encontre.");
        }
        scan.close();
    }
}