import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

class MakeOrder {

    private static Burgers Burger = new Burgers();
    private static Drinks drink = new Drinks();
    private int discount=0;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int total;

    void welcomeMessage() throws IOException {
        System.out.println("Insert your fucking name");
        String nameInserted = br.readLine();
        System.out.println("Hi " + nameInserted + ", and welcome to FJavaBurger!");
    }



    /**
     *
     * @throws IOException allows String input
     */
   private void finishBurgerOrder() throws IOException {
        System.out.println("Would you like another fucking burger?");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
               // orderBurger();
                break;

            case "no":
                String orderSummaryVeg = Burger.orderSummaryVeg();
                String orderSummaryNormal = Burger.orderSummaryNormal();
                String summary = "Your order is:\n" + "\n" + orderSummaryVeg + "\n" + orderSummaryNormal;
                System.out.println(summary);
                int total = Burger.totalVegAmount + Burger.totalNormalAmount;
                System.out.println("The current total amount of your order is: " + total + "$");
                orderDrink();
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishBurgerOrder();
                break;
        }
    }

    /**
     *
     * @throws IOException allows String input
     */
    private void orderDrink() throws IOException {
        System.out.println("Would you like a fucking drink?");
        String order = br.readLine().toLowerCase();
        switch (order){
            case "yes":
                choseDrink();
                break;

            case "no":
                total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.drinkOrderSummary();
                System.out.println("The current amount of your order is: " + total + "$");
                finishOrder();
                break;

            default:
                System.out.println("Can you tell me when are you gonna talk in fucking english?! I can't understand you!");
                orderDrink();
        }
        drink.drinkOrderSummary();
    }

    /**
     *
     * @throws IOException allows String input
     */
    private void choseDrink() throws IOException{
        System.out.println("Select a drink");
        for(String drink: drink.drinks){
            System.out.println(drink);
        }
        String order = br.readLine().toLowerCase();
        String drinkChosen = drink.choseDrink(order);
        System.out.println(drinkChosen);

        total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.drinkOrderSummary();
        System.out.println("The current amount of your order is: " + total + "$");
        finishDrinkOrder();
    }

    /**
     *
     * @throws IOException allows String input
     */
    private void finishDrinkOrder() throws IOException {
        System.out.println("Do you wanna another fucking drink?");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
                choseDrink();
                break;

            case "no":
//                int total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.totalDrinkAmount;
//                System.out.println("The total amount of your order is: " + total + "$");
                finishOrder();
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishDrinkOrder();
                break;
        }
    }

    /**
     *
     * @throws IOException allows String input
     */
   private void finishOrder() throws IOException {
        System.out.println("Would you like something else? Actually we have nothing more at the moment");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
                //orderBurger();
                break;

            case "no":

                Calendar calendar = Calendar.getInstance();
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayOfWeek==5) {
                     discount = Burger.burgerQuantityOfSimpleBurgers() * 2;
                     System.out.println("Today there's a discount of 2$ on every Simple Meat/Veggy Burger!");
                     System.out.println("Your total discount is: " + discount +"$");
                }

                total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.drinkOrderSummary() - discount;

                System.out.println("The final amount of your order is: " + total + "$");
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishBurgerOrder();
                break;
        }
    }

}//class
