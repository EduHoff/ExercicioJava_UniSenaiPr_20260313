package entities;

public class Lamp {

    private boolean isLampOn = false;

    public Lamp(){

    }

    public Lamp(boolean isLampOn) {
        this.isLampOn = isLampOn;
    }

    @Override
    public String toString() {
        return isLampOn ? "Lâmpada ligada" : "Lâmpada desligada";
    }

    public boolean isLampOn() {
        return isLampOn;
    }

    public void switchLamp() {
        isLampOn = !isLampOn;
    }
}

    