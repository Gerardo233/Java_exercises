package Poligonos;

public abstract class Poligono {
    protected int numSides;

    public Poligono(int numSides){
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }



    public abstract double CalcArea();

}
