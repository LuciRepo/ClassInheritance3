package ClassInheritance3;

import sun.util.calendar.BaseCalendar;

public class Food extends Product {
    private BaseCalendar.Date expirationDate;
    private String groupOfProduct;

    public BaseCalendar.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(BaseCalendar.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getGroupOfProduct() {
        return groupOfProduct;
    }

    public void setGroupOfProduct(String groupOfProduct) {
        this.groupOfProduct = groupOfProduct;
    }

    protected Food() {

    }

    protected Food(String name, double price, BaseCalendar.Date expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    protected Food(String name, double price, String groupOfProduct) {
        super(name, price);
        this.groupOfProduct = groupOfProduct;
    }
}
