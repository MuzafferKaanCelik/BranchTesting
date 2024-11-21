public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The cat goes: Meow");
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    String showMood(boolean mood) {
        if (mood){
            return "Meow";
        }else{
            return "Hiss";
        }

    }
}
