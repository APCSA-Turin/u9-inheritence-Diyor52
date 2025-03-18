
public class Laptop extends Computer {
    private boolean trackPadCalibrated;

    public Laptop(int memory, int screenSize) {
        super(screenSize,memory);
        this.trackPadCalibrated = false;
    }

    public boolean isTrackPadCalibrated() {
        return trackPadCalibrated;
    }



    public void calibrateTrackpad() {
        if (!trackPadCalibrated) {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        } else {
            System.out.println("No need to calibrate");
        }
    }
}
