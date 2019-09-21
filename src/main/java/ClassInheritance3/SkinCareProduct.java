package ClassInheritance3;

public class SkinCareProduct extends Product {
    private String color;
    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    protected SkinCareProduct(){

    }
    protected SkinCareProduct(String name, double price, String color){
        super(name,price);
        this.color=color;
    }
}
