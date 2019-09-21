package ClassInheritance3;

public class HomeAppliances extends Product {
    private String type;
    private double lenght;
    private double width;
    private double height;
    private double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected HomeAppliances() {

    }
    protected HomeAppliances(String name, double price, double weight){
        super(name,price);
        this.weight=weight;
    }
}
