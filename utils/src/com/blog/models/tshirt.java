package src.com.blog.models;

public class tshirt extends generalItem {

    private double price;
    private double tax;

    public tshirt(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public double getTax(double percet) {

        // assuming that percent will be passedin as whole number
        // ex: 14% so convert
        double calculate = percet / 100;
        calculate = calculate * this.price;
        return calculate;
    }

}
