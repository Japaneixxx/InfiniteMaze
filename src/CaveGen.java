
import java.util.Random;

public class CaveGen {
    static Random rand = new Random(); 
    static int min = 8; // Minimum value of range
    static int max = 12; // Maximum value of range
    static int min2 = 6; // Minimum value of range
    static int max2 = 8; // Maximum value of range

    public static int maxTileX = (int)Math.floor(Math.random() * (max - min + 1) + min);
    public static int maxTileY = (int)Math.floor(Math.random() * (max2 - min2 + 1) + min);

    public static int stairX = (int)Math.floor(Math.random() * ((maxTileX -1) - 2 + 1) + 2);
    public static int stairY = (int)Math.floor(Math.random() * ((maxTileY -1) - 2 + 1) + 2);
    
    public static int coinX = (int)Math.floor(Math.random() * ((maxTileX -1) - 2 + 1) + 2);
    public static int coinY = (int)Math.floor(Math.random() * ((maxTileY -1) - 2 + 1) + 2);


    
    public static void Generate(){
        stairX = (int)Math.floor(Math.random() * ((maxTileX -1) - 2 + 1) + 2);
        stairY = (int)Math.floor(Math.random() * ((maxTileY -1) - 2 + 1) + 2);
        coinX = (int)Math.floor(Math.random() * ((maxTileX -1) - 2 + 1) + 2);
        coinY = (int)Math.floor(Math.random() * ((maxTileY -1) - 2 + 1) + 2);
    }

    public static int map[][] = new int[maxTileY][maxTileX];

    public static int TileIdentifier(int tileX, int tileY) {
        if(tileX == stairX && tileY == stairY){
        return 3;
        }else if(tileX == coinX && tileY == coinY){
            return 4;
        }else if (Player.pX == tileX && Player.pY == tileY) {
            return 1;
        }else if (tileX == 1 || tileY == 1 || tileX == maxTileX || tileY == maxTileY) {
            return 2;
        }
        return 0;
    }
    
    public static void MapWritter(){
        for (int coluna = 0; coluna < map.length; coluna++) {
            // System.err.println("coluna" + j);
            for (int linha = 0; linha < map[coluna].length; linha++) {

                map[coluna][linha] = TileIdentifier(linha + 1, coluna + 1);
                System.err.print(TileChanger(map[coluna][linha]));

                // System.err.println("linha" + i);
            }
            System.err.print("\n");
        }

    }


    public static String TileChanger(int index) {

        switch (index) {
            case 1:
                return "O ";
            case 2:
                return "■ ";
            case 3:
            return "@ ";
            case 4:
            return "$ ";
            default:
                return "  ";
        }

    }

}
