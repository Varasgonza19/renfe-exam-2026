package iesam.features.domain;

public class Train {
    private String id;
    private String type;
    private String price;
    private String destination;

    public Train(String id, String type, String price, String destination) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
