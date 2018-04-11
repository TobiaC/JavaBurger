
class Burgers {

    static String meatBurgersNames[] = {" 1 SIMPLE BURGER", " 2 MEDIUM BURGER", " 3 WORKER BURGER"};
    static private String ingredients[] = {" hamburger", " cheese", " salad", " egg", " bacon", " tomato"};
    static String meatBurgersIngredients[] = {makeSimpleBurger(), makeMediumBurger(), makeWorkerBurger()};

    static String veggyBurgersNames[] = {" 1 SIMPLE VEG BURGER", " 2 MEDIUM VEG BURGER", " 3 WORKER VEG BURGER"};
    static private String vegingredients[] = {" cheese", " salad", " egg", " tomato", " aubergine", " zucchini"};
    static String veggyBurgersIngredients[] = {makeSimpleVegBurger(), makeMediumVegBurger(), makeWorkerVegBurger()};

    private int simpleBurgerQuantity;
    private int mediumBurgerQuantity;
    private int workerBurgerQuantity;
    private int simpleBurgerTotal;
    private int mediumBurgerTotal;
    private int workerBurgerTotal;
    int totalNormalAmount;

    private int simpleVegBurgerQuantity;
    private int mediumVegBurgerQuantity;
    private int workerVegBurgerQuantity;
    private int simpleVegBurgerTotal;
    private int mediumVegBurgerTotal;
    private int workerVegBurgerTotal;
    int totalVegAmount;


    static private String makeSimpleBurger (){
        return ingredients[0] + ingredients[1];
    }

    static private String makeMediumBurger() {
        return ingredients[0] + ingredients[1] + ingredients[2];
    }

    static private String makeWorkerBurger() {
        return ingredients[0] + ingredients[1] + ingredients[2] + ingredients[3] + ingredients[5];
    }

    static private String makeSimpleVegBurger (){
        return vegingredients[0] + vegingredients[1];
    }

    static private String makeMediumVegBurger() {
        return vegingredients[0] + vegingredients[1] + vegingredients[2];
    }

    static private String makeWorkerVegBurger() {
        return vegingredients[0] + vegingredients[1] + vegingredients[2] + vegingredients[3] + vegingredients[5];
    }


    /**
     *
     * @param burger the burger that is chosen by the customer
     * @return the order summary
     */

    String choseMeatBurger(String burger) {
        int price;
        String burgerIngredientsInfo;
        switch (burger){
            case "1":
                price = 5;
                simpleBurgerQuantity += 1;
                simpleBurgerTotal = simpleBurgerQuantity*price;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                return burgerIngredientsInfo;

            case "2":
                //burgerIngredientsInfo = "This burger is made with: " + makeMediumBurger();
                price = 8;
                mediumBurgerQuantity += 1;
                mediumBurgerTotal = mediumBurgerQuantity*price;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                return burgerIngredientsInfo;

            case "3":
                //burgerIngredientsInfo = "This burger is made with: " + makeWorkerBurger();
                price = 10;
                workerBurgerQuantity += 1;
                workerBurgerTotal = workerBurgerQuantity*price;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                return burgerIngredientsInfo;

            default:
                return "Wrong order: choose a burger from the menu";
        }
    }


    String orderSummaryNormal (){
        String summary = "MEAT BURGERS";
        if (simpleBurgerQuantity > 0){
            summary += "\n" + simpleBurgerQuantity + " simple burgers";
        }
        if (mediumBurgerQuantity > 0) {
            summary += "\n" + mediumBurgerQuantity + " medium burgers";
        }
        if (workerBurgerQuantity > 0) {
            summary += "\n" + workerBurgerQuantity + " worker burgers";
        }
        if (simpleBurgerQuantity == 0 && mediumBurgerQuantity == 0 && workerBurgerQuantity == 0){
            summary += "\nNo meat burgers";
        }
        totalNormalAmount = simpleBurgerTotal+mediumBurgerTotal+workerBurgerTotal;
        return summary;
    }

    /**
     *
     * @param burger the burger that is chosen by the customer
     * @return the burger info
     */

    String choseVeggyBurger(String burger) {
        int price;
        String burgerIngredientsInfo;
        switch (burger){
            case "1":
                //burgerIngredientsInfo = "This burger is made with: " + makeSimpleVegBurger();
                price = 3;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                simpleVegBurgerQuantity += 1;
                simpleVegBurgerTotal = simpleVegBurgerQuantity*price;
                return burgerIngredientsInfo;


            case "2":
                //burgerIngredientsInfo = "This burger is made with: " + makeMediumVegBurger();
                price = 6;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                mediumVegBurgerQuantity += 1;
                mediumVegBurgerTotal = mediumVegBurgerQuantity*price;
                return burgerIngredientsInfo;


            case "3":
                //burgerIngredientsInfo = "This burger is made with: " + makeWorkerVegBurger();
                price = 8;
                burgerIngredientsInfo = "\nThe price is: " + price + "$";
                workerVegBurgerQuantity += 1;
                workerVegBurgerTotal = workerVegBurgerQuantity*price;
                return burgerIngredientsInfo;

            default:
                return "Wrong order: choose a burger from the menu";
        }
    }

    String orderSummaryVeg (){
        String summary = "VEGGY BURGERS";
        if (simpleVegBurgerQuantity  > 0) {
            summary += "\n" + simpleVegBurgerQuantity + " simple veg burgers";
        }
        if (mediumVegBurgerQuantity > 0) {
            summary += "\n" + mediumVegBurgerQuantity + " medium veg burgers";
        }
        if (workerVegBurgerQuantity > 0) {
            summary += "\n" + workerVegBurgerQuantity + " worker veg burgers";
        }
        if (simpleVegBurgerQuantity == 0 && mediumVegBurgerQuantity == 0 && workerVegBurgerQuantity == 0){
            summary += "\nNo veg burgers";
        }
        totalVegAmount = simpleVegBurgerTotal + mediumVegBurgerTotal + workerVegBurgerTotal;
        return summary;

    }



}//class
