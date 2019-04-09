package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_2;

public class Lamp {

private String style;
private boolean battery;
private int globRating;


    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> TurningOn");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
