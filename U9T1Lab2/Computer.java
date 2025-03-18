public class Computer {
    private int memory;
    private int screenSize;

    public Computer(int screenSize, int memory){
        this.memory= memory;
        this.screenSize= screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }


}
