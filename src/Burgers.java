import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Burgers {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String meatBurgersNames[] = {" 1 SIMPLE BURGER", " 2 MEDIUM BURGER", " 3 WORKER BURGER"};
    static private String ingredients[] = {" hamburger", " cheese", " salad", " egg", " bacon", " tomato"};
    static String meatBurgersIngredients[] = {makeSimpleBurger(), makeMediumBurger(), makeWorkerBurger()};

    static String veggyBurgersNames[] = {" 1 SIMPLE VEG BURGER", " 2 MEDIUM VEG BURGER", " 3 WORKER VEG BURGER"};
    static private String vegingredients[] = {" cheese", " salad", " egg", " tomato", " aubergine", " zucchini"};
    static String veggyBurgersIngredients[] = {makeSimpleVegBurger(), makeMediumVegBurger(), makeWorkerVegBurger()};

    /**
     *
     * @return String: ingredients of the burger
     */
    static private String makeSimpleBurger (){
        return ingredients[0] + ingredients[1];
    }

    /**
     *
     * @return String: ingredients of the burger
     */
    static private String makeMediumBurger() {
        return ingredients[0] + ingredients[1] + ingredients[2];
    }

    static private String makeWorkerBurger() {
        return ingredients[0] + ingredients[1] + ingredients[2] + ingredients[3] + ingredients[5];
    }

    /**
     *
     * @return String: ingredients of the burger
     */
    static private String makeSimpleVegBurger (){
        return vegingredients[0] + vegingredients[1];
    }

    /**
     *
     * @return String: ingredients of the burger
     */
    static private String makeMediumVegBurger() {
        return vegingredients[0] + vegingredients[1] + vegingredients[2];
    }

    /**
     *
     * @return String: ingredients of the burger
     */
    static private String makeWorkerVegBurger() {
        return vegingredients[0] + vegingredients[1] + vegingredients[2] + vegingredients[3] + vegingredients[5];
    }


//    /**
//     *
//     *
//     *
//     * MODIFY totalNormalAmount: update the current total price
//     * MODIFY simpleBurgerQuantity
//     *        mediumBurgerQuantity
//     *        workerBurgerQuantity: update the quantity of each burger
//     */
//
//
//



//    /**
//     *
//     * @return String: order summary of the normal order
//     * MODIFY totalNormalAmount: update the current total amount
//     */
//    String orderSummaryNormal (){
//        String summary = "MEAT BURGERS";
//        if (simpleBurgerQuantity > 0){
//            summary += "\n" + simpleBurgerQuantity + " simple burgers";
//        }
//        if (mediumBurgerQuantity > 0) {
//            summary += "\n" + mediumBurgerQuantity + " medium burgers";
//        }
//        if (workerBurgerQuantity > 0) {
//            summary += "\n" + workerBurgerQuantity + " worker burgers";
//        }
//        if (simpleBurgerQuantity == 0 && mediumBurgerQuantity == 0 && workerBurgerQuantity == 0){
//            summary += "\nNo meat burgers";
//        }
//        totalNormalAmount = simpleBurgerTotal+mediumBurgerTotal+workerBurgerTotal;
//        return summary + "\n";
//    }
//
//    /**
//     *
//     * MODIFY totalVegAmount: update the current total price
//     * MODIFY simpleVegBurgerQuantity
//     *        mediumVegBurgerQuantity
//     *        workerVegBurgerQuantity: update the quantity of each burger
//     */
//

//    /**
//     *
//     * @return String: order summary of the veg order
//     * MODIFY totalVegAmount: update the current total amount
//     */
//    String orderSummaryVeg (){
//        String summary = "VEGGY BURGERS";
//        if (simpleVegBurgerQuantity  > 0) {
//            summary += "\n" + simpleVegBurgerQuantity + " simple veg burgers";
//        }
//        if (mediumVegBurgerQuantity > 0) {
//            summary += "\n" + mediumVegBurgerQuantity + " medium veg burgers";
//        }
//        if (workerVegBurgerQuantity > 0) {
//            summary += "\n" + workerVegBurgerQuantity + " worker veg burgers";
//        }
//        if (simpleVegBurgerQuantity == 0 && mediumVegBurgerQuantity == 0 && workerVegBurgerQuantity == 0){
//            summary += "\nNo veg burgers";
//        }
//        totalVegAmount = simpleVegBurgerTotal + mediumVegBurgerTotal + workerVegBurgerTotal;
//        return summary+ "\n";
//
//    }
//
//    /**
//     *
//     * @return int: total burger quantity
//     */
//
//    int burgerQuantityOfSimpleBurgers(){            //we need this method to apply the discount
//        return simpleBurgerQuantity + simpleVegBurgerQuantity;
//}

}//class
