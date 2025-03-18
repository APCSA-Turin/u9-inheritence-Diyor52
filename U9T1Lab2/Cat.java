public class Cat extends Animal {
    private boolean hasPlayedWith;
    private int numberOfCats;

    public Cat(String name, int age, int numberOfCats) {
        super(name, age);
        this.hasPlayedWith = false; 
        this.numberOfCats = numberOfCats;
    }

    public boolean hasPlayedWith() {
        return hasPlayedWith;
    }

    public void play() {
        this.hasPlayedWith = true;
        System.out.println(getName() + " has been played with.");
    }

    public int getnumberOfcats(){
        return numberOfCats;
    }
}
