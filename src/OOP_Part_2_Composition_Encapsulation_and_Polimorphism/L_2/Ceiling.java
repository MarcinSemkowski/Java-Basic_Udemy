package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_2;

public class Ceiling {
private  int height;
private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

}
