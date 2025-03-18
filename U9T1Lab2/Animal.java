public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean hasFriend;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.vaccinated = false; 
        this.hasFriend = false; 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }

    public void feed() {
        System.out.println(name + " has been fed.");
    }

    public boolean hasFriend(){
        return hasFriend;
    }
    public void setHasFriend(boolean hasFriend) {
        this.hasFriend = hasFriend;
    }
    
}
