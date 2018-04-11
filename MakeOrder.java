import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MakeOrder {

    private static Burgers Burger = new Burgers();
    private static Drinks drink = new Drinks();

    void welcomeMessage() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameInserted = br.readLine();
        System.out.println("Hi " + nameInserted + ", and welcome to FJavaBurger!");
    }



    //choose a burger from the menu

   void orderBurger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nFrom which menu would you like to order? Press 1 for meat burgers or 2 for veggy burgers");

        String order = br.readLine();
        switch (order) {
            case "1":

                System.out.println("Choose from our fucking meat burgers menu");

                for (int i = 0; i < Burgers.meatBurgersNames.length; i++) {
                    String burger = Burgers.meatBurgersNames[i] + "\n " + Burgers.meatBurgersIngredients[i];
                    System.out.println(burger);
                }

                order = br.readLine().toLowerCase();
                String burgerChosen = Burger.choseMeatBurger(order);
                System.out.println(burgerChosen);
                break;

            case "2":

                System.out.println("Princess, choose from our fucking veggy burgers menu");

                for (int i = 0; i < Burgers.veggyBurgersNames.length; i++) {
                    String burger = Burgers.veggyBurgersNames[i] + "\n " + Burgers.veggyBurgersIngredients[i];
                    System.out.println(burger);
                }

                order = br.readLine().toLowerCase();
                burgerChosen = Burger.choseVeggyBurger(order);
                System.out.println(burgerChosen);
                break;

            default:
                System.out.println("You fucker you typed incorrectly! Try again!");
        }

        finishBurgerOrder();
    }


   private void finishBurgerOrder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you like another fucking burger?");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
                orderBurger();
                break;

            case "no":
                String orderSummaryVeg = Burger.orderSummaryVeg();
                String orderSummaryNormal = Burger.orderSummaryNormal();
                String summary = "Your order is:" + "\n" + orderSummaryVeg + "\n" + orderSummaryNormal;
                System.out.println(summary);
                int total = Burger.totalVegAmount + Burger.totalNormalAmount;
                System.out.println("The total amount of your order is: " + total + "$");
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishBurgerOrder();
                break;
        }
    }

    void orderDrink() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] newDrink = drink.drinks;
        System.out.println("Would you like a fucking drink?");
        String order = br.readLine().toLowerCase();
        switch (order){
            case "yes":
                System.out.println("Select a drink");
                for(String drink: newDrink ){
                    System.out.println(drink);
                }
                order = br.readLine().toLowerCase();
                String drinkChosen = drink.choseDrink(order);
                System.out.println(drinkChosen);
                finishDrinkOrder();
                break;

            case "no":
                finishOrder();
                break;

            default:
                System.out.println("Can you tell me when are you gonna talk in fucking english?! I can't understand you!");

        }
        drink.drinkOrderSummary();
        //finishDrinkOrder();
    }

    private void finishDrinkOrder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you wanna another fucking drink?");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
                orderDrink();
                break;

            case "no":
                int total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.totalDrinkAmount;
                System.out.println("The total amount of your order is: " + total + "$");
                finishOrder();
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishDrinkOrder();
                break;
        }
    }

   private void finishOrder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you like something else? Actually we have nothing more at the moment");
        String order = br.readLine().toLowerCase();
        switch (order) {
            case "yes":
                orderBurger();
                break;

            case "no":
                int total = Burger.totalVegAmount + Burger.totalNormalAmount + drink.totalDrinkAmount;
                System.out.println("The total amount of your order is: " + total + "$");
                break;

            default: System.out.println("If you don't speak english go to Australia and jump with the fucking kangaroos!");
                finishBurgerOrder();
                break;
        }
    }

}//class
