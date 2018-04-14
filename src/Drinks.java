class Drinks {

    String drinks[] = {"1 NATURAL WATER", "2 SPARKLING WATER", "3 COKE", "4 DIET COKE", "5 LEMON PEPSI", "6 ICED LEMON TEA", "7 ORANGE JUICE"};

    private int naturalWaterQuantity;
    private int sparklingWaterQuantity;
    private int cokeQuantity;
    private int dietCokeQuantity;
    private int lemonPepsiQuantity;
    private int icedLemonTeaQuantity;
    private int orangeJuiceQuantity;
    private int naturalWaterTotal;
    private int sparklingWaterTotal;
    private int cokeTotal;
    private int dietCokeTotal;
    private int lemonPepsiTotal;
    private int icedLemonTeaTotal;
    private int orangeJuiceTotal;
    private int totalDrinkAmount;

    /**
     *
     * @param drink chosen by the customer
     * @return drink chosen and info
     */
    String choseDrink(String drink) {
        int price;
        String drinkInfo;
        switch (drink){
            case "1":
                price = 3;
                naturalWaterQuantity += 1;
                naturalWaterTotal = naturalWaterQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            case "2":
                price = 8;
                sparklingWaterQuantity += 1;
                sparklingWaterTotal = sparklingWaterQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            case "3":
                //burgerIngredientsInfo = "This burger is made with: " + makeWorkerBurger();
                price = 10;
                cokeQuantity += 1;
                cokeTotal = cokeQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;
            case "4":
                price = 3;
                dietCokeQuantity += 1;
                dietCokeTotal = dietCokeQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            case "5":
                price = 8;
                lemonPepsiQuantity += 1;
                lemonPepsiTotal = lemonPepsiQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            case "6":
                //burgerIngredientsInfo = "This burger is made with: " + makeWorkerBurger();
                price = 10;
                icedLemonTeaQuantity += 1;
                icedLemonTeaTotal = icedLemonTeaQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            case "7":
                //burgerIngredientsInfo = "This burger is made with: " + makeWorkerBurger();
                price = 10;
                orangeJuiceQuantity += 1;
                orangeJuiceTotal = orangeJuiceQuantity*price;
                drinkInfo = "\nThe price is: " + price + "$";
                return drinkInfo;

            default:
                return "Wrong order: choose a burger from the menu";
        }
    }

    int drinkOrderSummary () {
        //String summary = "DRINKS";
        totalDrinkAmount = naturalWaterTotal + sparklingWaterTotal + cokeTotal + dietCokeTotal + lemonPepsiTotal + icedLemonTeaTotal + orangeJuiceTotal;
        return totalDrinkAmount;
    }

    }//class
