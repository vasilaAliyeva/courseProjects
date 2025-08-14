package entity;

public class ProductEntity {
    private int id;
    private String name;
    private String model;
    private String colour;
    private Double price;
    private boolean delivery;

    public ProductEntity() {
    }

    public ProductEntity(int id, String name, String model, String colour, Double price, boolean delivery) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.colour = colour;
        if (price < 0) {
            System.out.println("Price cannot be negative");
        } else {
            this.price = price;
        }
        this.delivery = delivery;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", delivery=" + delivery +
                '}';
    }
}
