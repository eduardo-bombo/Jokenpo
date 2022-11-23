import java.util.Scanner;

public class Main {
    public static Jokenpo startGame() {
        System.out.println("******* Jo-Ken-Pô! *******");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String playerName = scan.next().toUpperCase();

        Player user = new Player(playerName);

        Player IA = new Player( name "IA");

        System.out.println(playerName + ", informe quantos rounds você deseja jogar: ");
        int rounds = scan.nextInt();

        return new Jokenpo(user, IA, rounds);
    }
    
    
    
    
    public static void main(String[] args) {}
        startGame();

}
