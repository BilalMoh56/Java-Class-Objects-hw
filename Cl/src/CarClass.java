
public class CarClass {
    
    private String make;
    private String model;
    private int year;


    public CarClass() {
      
    }

    public CarClass(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public CarClass(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

  
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean isLuxuryCar() {
       
        return make.equals("Mercedes") || make.equals("BMW") || make.equals("Lexus");
    }

 
    public String displayCarInfo() {
        return year + " " + make + " " + model;
    }
}

