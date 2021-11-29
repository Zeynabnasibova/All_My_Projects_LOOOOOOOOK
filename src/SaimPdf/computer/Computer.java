package SaimPdf.computer;

public class Computer {

    int price;
    String brand;
    String color;

      static  boolean hasScreen;
        static boolean hasBattery = true;
        static boolean hasMemory = true;

        public Computer( int inputprice,String inputbrand,String inputcolor){
            this.price = inputprice;
            this.brand = inputbrand;
            this.color = inputcolor;

        }

    public static void main(String[] args) {

        Computer obj = new Computer(1000,"Mac","brown");
        obj.hasScreen = true;
        obj.hasBattery = true;
        obj.hasMemory = true;

        System.out.println(obj.hasScreen);

    }

}
/*
Computer - static

	class name: computer:
		instance variables:
			price, brand, color, ...

		static variables: hasScreen, hasBattery, hasMemory

 */