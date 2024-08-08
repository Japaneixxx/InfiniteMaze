public class Player {
    public static int pX = 3;
    public static int pY = 3;

    public static void Action(String button) {
        switch (button.toUpperCase()) {
            case "W" -> {
                //if(pY-1 != 1){
                if(CaveGen.map[pY-2][pX-1] != 2){
                    pY--;}
            }
            case "A" -> {
                if(CaveGen.map[pY-1][pX-2] != 2){
                    pX--;}
            }
            case "S" -> {
                if(CaveGen.map[pY][pX-1] != 2){
                    pY++;}
            }
            case "D" -> {
                if(CaveGen.map[pY-1][pX] != 2){
                    pX++;}
            }
            default -> {
            }
        }
    }

}
