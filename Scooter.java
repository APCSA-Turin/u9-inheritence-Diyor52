public class Scooter extends Vehicle{
    private int lights;
    public Scooter(String name, int wheels, int lights ){
        super(name,wheels);
        this.lights = lights;
    }

    public void turnlightsOn(){
        System.out.println("Lights ON");
    }

    public void turnlightsOff(){
        System.out.println("Lights Off");
    }

    public int getLights(){
        return lights; 
    }
}
