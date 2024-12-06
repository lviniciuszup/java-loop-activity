import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner namescr = new Scanner(System.in);
        Scanner birthdayscr = new Scanner(System.in);
        Scanner yearscr = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = namescr.next();

        System.out.print("Digite seu ano de nascimento: ");
        int birthday = birthdayscr.nextInt();

        System.out.print("Me informa o ano atual: ");
        int currentyear = yearscr.nextInt();

        resolution(name, birthday, currentyear);
    }
    public static void resolution(String name, int birthday, int currentyear){
        System.out.println("Seu nome é "+name+" e você tem " +(currentyear - birthday) +" anos de idade");
    }
}
/*
TODO: Melhorar código: Você não precisa criar um Scanner para cada entrada.
Um único Scanner pode capturar todas as informações que você precisa.
Usar nomes de variáveis mais descritivos ajuda a entender o que está acontecendo.
Sempre feche o Scanner ao final para evitar vazamentos de recursos.
O código não valida as entradas do usuário. Por exemplo,
se ele digitar texto onde deveria ser um número, o programa quebrará.
*/