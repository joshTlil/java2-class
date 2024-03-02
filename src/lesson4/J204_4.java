package lesson4;

public class J204_4 {
    public static void main(String[] args) {
    Soldier woman = new Soldier();
    Turtle turtle = new Turtle();
    Pigeon pigeon = new Pigeon();
    pigeon.fly();
    pigeon.nest();
    pigeon.sound();
    woman.attack();
    woman.eat();
    woman.shoot();
    turtle.hide();
    turtle.sound();
    turtle.swim();

    }
}

abstract class Creature{
    public abstract void attack();
    public abstract void eat();
    public String name;
    public int age;
    public String species;

}

interface toShoot{
    public void shoot();
}

interface toHide{
    public void hide();
}

interface toNest{
    public void nest();
}

interface toFly{
    public void fly();
}

interface toSwim{
    public void swim();
}

interface makeSound{
    public void sound();
}

interface toTalk{
    public void talk();
}

class Human extends Creature{
    @Override
    public void attack() {

    }

    @Override
    public void eat() {
        System.out.println("Everything");
    }


}

class Animal extends Creature{
    public String habitat;
    public void attack(){

    }

    @Override
    public void eat() {

    }

}

class Soldier extends Human implements toShoot, toTalk{
    @Override
    public void attack() {
        System.out.println("Like a bee");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void shoot() {
        System.out.println("shooting");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    public String name = "G.I.Jane";
}

class Pigeon extends Animal implements toFly,toNest,makeSound{
    public String name = "Kiwi";
    public int age = 2;
    public String habitat = "Land";
    public String species = "Pigeon";
    @Override
    public void attack() {
        System.out.println("Pecking");
    }

    @Override
    public void eat() {
        System.out.println("Worms...Yum!");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void nest() {
        System.out.println("Nesting");
    }

    @Override
    public void sound() {
        System.out.println("Goo goo");
    }
}

class Turtle extends Animal implements toSwim, makeSound, toHide{
    @Override
    public void attack() {
        System.out.println("Biting");
    }

    @Override
    public void eat() {
        System.out.println("Shrimp");
    }

    @Override
    public void hide() {
        System.out.println("Hiding");
    }

    @Override
    public void sound() {
        System.out.println("Ninja Ninja");
    }

    @Override
    public void swim() {
        System.out.println("Over 100,000km");
    }
}
