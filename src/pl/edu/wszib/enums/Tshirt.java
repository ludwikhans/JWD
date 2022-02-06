package pl.edu.wszib.enums;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;


    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public TshirtSize getSize() {
        return size;
    }

    public void setSize(TshirtSize size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
