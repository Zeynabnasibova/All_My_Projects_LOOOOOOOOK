package SaimPdf.pizza;

public class Pizza {
/*
	size (either small, medium, large)
					number of cheese topping
					number of veggie topping
					tip
 */
    String size;
    int numOfCheeseTopping;
    int numOfVeggieTopping;
    int numOfPepperoniTopping;
    double totalCostOfPizza;

    public Pizza (String size,int numOfCheeseTopping,int numOfVeggieTopping, int numOfPepperoniTopping){
        this.size=size;
        this.numOfCheeseTopping= numOfCheeseTopping;
        this.numOfVeggieTopping= numOfVeggieTopping;
        this.numOfPepperoniTopping= numOfPepperoniTopping;
        customizedOrder();
    }

    public void customizedOrder(){
        if (size.equalsIgnoreCase("small")){
            totalCostOfPizza = 10 + (numOfCheeseTopping* 1 + numOfPepperoniTopping*1.5);
        }else if (size.equalsIgnoreCase("medium")){
            totalCostOfPizza = 12 + (numOfCheeseTopping *1 + numOfPepperoniTopping*1.5);
        }else if(size.equalsIgnoreCase("large")){
            totalCostOfPizza = 14 + (numOfCheeseTopping *1 + numOfPepperoniTopping*1.5);

        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + "\'" +
        ", numOfCheeseTopping=" + numOfCheeseTopping +
                ", numOfVeggieTopping=" + numOfVeggieTopping +
                ", numOfPepperoniTopping=" + numOfPepperoniTopping +
                ", totalCostOfPizza=" + totalCostOfPizza +
                '}';
    }
}
/*
Pizza - custom classes

	create a custom class for Pizza that should contain the following:
			variables:
					size (either small, medium, large)
					number of cheese topping
					number of veggie topping
					tip

			constructor

			methods:
					customizeOrder(): allows user to set the size and toppings of Pizza
					calcCost(): returns the total cost  as double
					toString(): get the full information and total cost of Pizza


			Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping

 */