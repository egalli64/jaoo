package m10.s11;

public class MainDecorator {

    public static void main(String[] args) {
        Game game = new Game();
        Warrior tom = new Warrior("Tom");

        game.beginning(tom);
        game.meetZoe(tom);
        game.magicRoom(tom);
    }
}
