public class GameTester {

    public static void main(String[] args){
        NumberGames game = new NumberGames(3);

        game.squareNumber();
        System.out.println(game);

        game.doubleNumber();
        System.out.println(game);

        game.squareNumber();
        System.out.println(game);

        System.out.println(game.getNumber());
        System.out.println(game.getNumber());


    }
}
