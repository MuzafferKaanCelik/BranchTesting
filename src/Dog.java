public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The dog goes: Woof!");
    }

    @Override
    public boolean eat() {
        return true;
    }

}
