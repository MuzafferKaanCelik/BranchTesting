public abstract class Animal {

    private String name;

    public abstract void makeSound();

    public boolean eat() {
        return true;
    }

    abstract String showMood(boolean mood);
}
