public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("The dog goes: Woof!");
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    String showMood(boolean mood) {
        if (mood){
            return "The dog is whacking its tail";
        }else{
            return "Growl";
        }
    }

}
