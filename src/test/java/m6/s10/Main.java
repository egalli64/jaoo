package m6.s10;

public class Main {
    public static void main(String[] args) {
        Warrior tom = new Warrior();
        
        System.out.println("A simple warrior. He could only fight.");
        System.out.println("Tom fight power is: " + tom.fight());
        
        System.out.println("Something happens here.");
        MagicWarrior magicTom = new MagicWarrior(tom);
        System.out.println("Now he could heal, too!");

        System.out.println("Tom fight power is still: " + magicTom.fight());
        System.out.println("Tom healing power is: " + magicTom.heal());
    }
}
