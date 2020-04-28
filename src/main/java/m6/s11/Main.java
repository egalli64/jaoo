package m6.s11;

public class Main {
    public static void main(String[] args) {
        Warrior tom = new Warrior();
        
        System.out.println("A simple warrior. He could only fight.");
        System.out.println("Tom fighting power is: " + tom.fight());
        
        System.out.println("Something happens here.");
        MysticWarrior magicTom = new MysticWarrior(tom);
        System.out.println("Now he could heal, too!");

        System.out.println("His fighting power is still: " + magicTom.fight());
        System.out.println("His healing power is: " + magicTom.heal());
    }
}
