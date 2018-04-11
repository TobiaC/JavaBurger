
import java.io.*;

class Main {

    private static MakeOrder makeOrder = new MakeOrder();


    public static void main(String args[]) throws IOException {
        System.out.println("Insert your fucking name");
        makeOrder.welcomeMessage();
        makeOrder.orderBurger();
        makeOrder.orderDrink();
        System.out.println("Thank you, see ya!");
        }
    }//class
