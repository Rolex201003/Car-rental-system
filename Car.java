
class Car{

    private String carId;
    private String brand;
    private String model;
    private double pricePerDay;
    private  boolean isAvailable;

    public Car(String carId,String brand,String model,double pricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true; 
    }

    public String getCarId(){
        return carId;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double calculatePrice(int rentalDays){
        return pricePerDay * rentalDays;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
 
    public void rent(){
        isAvailable = false;
    }

    public void returnCar(){
        isAvailable = true;
    }
    
}