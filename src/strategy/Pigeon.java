package strategy;

import strategy.intrerface.DeliveryStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Pigeon implements DeliveryStrategy {
    private final BufferedReader READER =new BufferedReader(new InputStreamReader(System.in));
    private Integer century;
    private String name;
    private String address;
    private String colorOfKurlik;


    @Override
    public void deliveryDetails() {
        try {
            System.out.println("Enter century for delivery: ");
            century= Integer.parseInt(READER.readLine());
            System.out.println("Enter name of recipient: ");
            name=READER.readLine();
            System.out.println("Enter address of recipient: ");
            address=READER.readLine();
            System.out.print("Please, select a color of Kurlik:" + "\n" +
                    "1 - White" + "\n" +
                    "2 - Black" + "\n" +
                    "3 - Grey" + "\n" +
                    "4 - Rose" + "\n");
            Integer choice = Integer.parseInt(READER.readLine());
            if(choice==1){
                colorOfKurlik="white";
            } else if(choice==2) {
                colorOfKurlik="black";
            } else if(choice==3) {
                colorOfKurlik="grey";
            } else {
                colorOfKurlik="rose";
            }
            System.out.println("Your order is confirmed and will be deliver in  "+century+" century");


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
