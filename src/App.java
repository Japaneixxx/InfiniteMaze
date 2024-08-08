import java.util.Scanner;

public class App {

    public static String playerInput;


    public static void main(String[] args) throws Exception {

        CaveGen.Generate();

        while (true) { 
            if (CaveGen.map[Player.pY-1][Player.pX-1] == 3) {
                CaveGen.Generate();
            }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        @SuppressWarnings("resource")
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        CaveGen.MapWritter();
        //System.out.println(CaveGen.map[Player.pY-1][Player.pX-1]);
        System.err.println("Qual ação voce deseja fazer?");

        playerInput = myObj.nextLine();
        Player.Action(playerInput);// Read user input

        //System.out.flush();
        }
        //System.out.println(playerInput);
        // System.out.println("Hello, World!");
    }
}
