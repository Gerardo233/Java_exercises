package Poligonos;

public class Tria extends Poligono{
    private double height;
    private double base;
    public Tria(int numSides){
        super(numSides);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double CalcArea(){
        return (this.height * this.base)/2;
    }
}
