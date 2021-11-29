package SaimPdf.customClassPractice.car;

public class Car {

    String brand;
    String model;
    int year;
    int price;
    String color;

    public Car(String inputBrand){
        this.brand = inputBrand;
    }
    public Car(String inputBrand,String inputModel){
        this.brand = inputBrand;
        this.model = inputModel;
    }
    public Car(String inputBrand,String inputModel,int inputYear){
        this.brand = inputBrand;
        this.model = inputModel;
        this.year = inputYear;
    }
    public Car(String inputBrand,String inputModel,int inputYear,int inputPrice){
        this.brand = inputBrand;
        this.model = inputModel;
        this.year = inputYear;
        this.price = inputPrice;
    }
    public Car(String inputBrand,String inputModel,int inputYear,int inputPrice,String inputColor){
//        this.brand = inputBrand;
//        this.model = inputModel;
//        this.year = inputYear;
//        this.price = inputPrice;
        this(inputBrand,inputModel,inputYear,inputPrice);
        this.color = inputColor;

    }

    public String toString(){

        return "I use this " + brand;

    }

}
/*
Car - constructor chaining

	class name: Car
		instance variables:
			brand, model, year, price, color

		constructors:

			1st constructor: initialize the brand of the car

			2nd constructor: initialize the brand and model of the car

			3rd constructor: initialize the brand, model, year of the car

			4th constructor: initialize the brand, model, year, price of the car

			5th Constructor: initialize all instances of the car

		Instance methods:
			toString()

 */