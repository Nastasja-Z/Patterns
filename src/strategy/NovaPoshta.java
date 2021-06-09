package strategy;

import strategy.intrerface.DeliveryStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class NovaPoshta implements DeliveryStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private String address;
    private String city;

    @Override
    public void deliveryDetails() {
        try {
            System.out.println("Enter name of recipient: ");
            name = READER.readLine();
            System.out.println("Enter address of recipient: ");
            address = READER.readLine();
            System.out.println("Enter city to delivery: ");
            city = READER.readLine();
            System.out.println("Your order is confirmed and will be deliver in  " + city.toUpperCase(Locale.ROOT));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
