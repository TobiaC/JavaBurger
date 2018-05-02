
import java.io.*;

class Main {

    private static MakeOrder makeOrder = new MakeOrder();
    private static Burgers burgers = new Burgers();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String args[]) throws IOException {

        System.out.println("Insert your fucking name");
        String nameInserted = br.readLine();
        System.out.println("Hi " + nameInserted + ", and welcome to FJavaBurger!");
        System.out.println("\nFrom which menu would you like to order? Press 1 for meat burgers or 2 for veggy burgers");
        String order = br.readLine();

        while (!(order.equals("1") || order.equals("2"))) {

            System.out.println("\nYou fucker you typed incorrectly! Try again!");
            order = br.readLine();
        }

        if (order.equals("1")) {


            System.out.println("Choose a burger from the menu");
            order = br.readLine();

            while (!(order.equals("1") || order.equals("2") || order.equals("3"))) {

                System.out.println("\nYou fucker you typed incorrectly! Try again!");
                order = br.readLine();
            }

            switch (order){
                case "1":
                    makeOrder.simpleBurgerChoosen();
                    break;

                case "2":
                    makeOrder.mediumBurgerChoosen();
                    break;

                case "3":
                    makeOrder.workerBurgerChoosen();
                    break;

            }


        } else if (order.equals("2")) {

            burgers.chooseVeggyBurger();
        }


        System.out.println("Thank you, see ya!");

    }
    //class
}