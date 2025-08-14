package dto;

//data transfer - ancaq bize lazim olanlar
public class ProductDto {
    private String name;
    private String colour;
    private boolean delivery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", delivery=" + delivery +
                '}';
    }
}
