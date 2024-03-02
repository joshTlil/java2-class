//package lesson4;
//
//public class J204_3 {
//    public static void main(String[] args) {
//    Dog dog = new Dog();
//    Cat cat = new Cat();
//    Bird bird = new Bird();
//    bird.makeSound();
//    bird.fly();
//    dog.makeSound();
//    cat.makeSound();
//    }
//}
//
//abstract class Animal{
//    public abstract void makeSound();
//    public abstract void sleep();
//}
//
//interface canFly{
//    public void fly();
//}
//
//class Dog extends Animal{
//    @Override
//    public void makeSound() {
//        System.out.println("Woof!");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Meow!");
//    }
//
//
//}
//
//class Cat extends Animal{
//    @Override
//    public void makeSound() {
//        System.out.println("Meow!");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("ZZZZ");
//    }
//
//
//}
//
//class Bird extends Animal implements canFly{
//    @Override
//    public void makeSound() {
//        System.out.println("Chirp chirp!");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("ZZZZ");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Bird is flying");
//    }
//}