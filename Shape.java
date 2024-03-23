public class Shape {
    private double height;
    private double base;

    public double CalcArea(){
        return 0;
    }

    public Shape(double height, double base){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
