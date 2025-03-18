public class Dog extends Animal {
    private boolean hasBeenWalked;
    private boolean active; 

    public Dog(String name, int age) {
        super(name, age);
        this.hasBeenWalked = false; 
        this.active = false;
    }

    public boolean hasBeenWalked() {
        return hasBeenWalked;
    }

    public void walk() {
        this.hasBeenWalked = true;
        System.out.println(getName() + " has been walked.");
    }

    public boolean isActive() {
        return active;
    }

    public void makeActive(){
        if(this.hasBeenWalked){
            active = true;
            System.out.println(getName() + " is Active.");
        }
    }
}