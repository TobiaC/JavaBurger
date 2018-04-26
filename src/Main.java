
import java.io.*;

class Main {

    private static MakeOrder makeOrder = new MakeOrder();
    private static Burgers burgers = new Burgers();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String args[]) throws IOException {

        makeOrder.welcomeMessage();
        System.out.println("\nFrom which menu would you like to order? Press 1 for meat burgers or 2 for veggy burgers");
        String order = br.readLine();

        while(!(order.equals("1") || order.equals("2"))){

            System.out.println("\nYou fucker you typed incorrectly! Try again!");
            order = br.readLine();
        }

        if (order.equals("1")) {
            burgers.chooseMeatBurger();
        }
        else if (order.equals("2")){
            burgers.chooseVeggyBurger();
        }


        System.out.println("Thank you, see ya!");

        }
    }//class
