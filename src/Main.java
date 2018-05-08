
import java.io.*;

class Main {

    private static MakeOrder makeOrder = new MakeOrder();
    //private static Burgers burgers = new Burgers();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String args[]) throws IOException {

        System.out.println("Insert your fucking name");
        String nameInserted = br.readLine();
        System.out.println("Hi " + nameInserted + ", and welcome to FJavaBurger!");

        chooseMenu();

        System.out.println("Would you like another burger?");
        String order = br.readLine().toLowerCase();
        while (!(order.equals("1") || order.equals("2"))) {

            System.out.println("\nYou fucker you typed incorrectly! Try again!");
            order = br.readLine();
        }

        if (order.equals("1")){
            chooseMenu();
        } else if (order.equals("2")){
            //choose do add a drink or not
        }


        System.out.println("Thank you, see ya!");

    }


    private static void chooseMenu() throws IOException {
        System.out.println("\nFrom which menu would you like to order? Press 1 for meat burgers or 2 for veggy burgers");
        String menu = br.readLine();

        while (!(menu.equals("1") || menu.equals("2"))) {

            System.out.println("\nYou fucker you typed incorrectly! Try again!");
            menu = br.readLine();
        }

        if (menu.equals("1")) {
            makeOrder.showMeatBurgers();
            chooseBurger(menu);
            System.out.println(makeOrder.total);

        } else if (menu.equals("2")) {
            makeOrder.showVeggyBurgers();
            chooseBurger(menu);
            System.out.println(makeOrder.total);
        }
    }


    private static void chooseBurger(String order) throws IOException{


        if (order.equals("1")) {
            System.out.println("Choose a burger from the menu");
            order = br.readLine();

            switch (order) {
                case "1":
                    makeOrder.simpleBurgerChosen("meatBurger");
                    break;

                case "2":
                    makeOrder.mediumBurgerChosen("meatBurger");
                    break;

                case "3":
                    makeOrder.workerBurgerChosen("meatBurger");
                    break;
            }

        } else if (order.equals("2")){
            System.out.println("Choose a burger from the menu");
            order = br.readLine();

            switch (order) {
                case "1":
                    makeOrder.simpleBurgerChosen("vegBurger");
                    break;

                case "2":
                    makeOrder.mediumBurgerChosen("vegBurger");
                    break;

                case "3":
                    makeOrder.workerBurgerChosen("vegBurger");
                    break;
            }
        }
    }
}//class