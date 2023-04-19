package models;
public class CarDTO implements ICarDTO{
    Integer id;
    String make;
    String model;
    String Color;
    Integer year;
    String vin;
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getVin() {
        return vin;
    }
    @Override
    public String toString() {
        return "CarDTO [id=" + id + ", make=" + make + ", model=" + model + ", Color=" + Color + ", year=" + year
                + ", vin=" + vin + "]";
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public CarDTO(Integer id, String make, String model, String color, Integer year, String vin) {
        this.id = id;
        this.make = make;
        this.model = model;
        Color = color;
        this.year = year;
        this.vin = vin;
    }
    public CarDTO(){
        
    }
    
    
    
}
