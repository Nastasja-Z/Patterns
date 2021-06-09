import strategy.DHL;
import strategy.NovaPoshta;
import strategy.Pigeon;
import strategy.intrerface.DeliveryStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static DeliveryStrategy deliveryStrategy;
    private static Scanner READER = new Scanner( System.in );

    public static void main(String[] args) {
        if(deliveryStrategy==null) {
            System.out.println("Please, select a type of delivery, you wish: "+"\n"+
                    "1 - In another city of Ukraine (NovaPoshta)"+"\n"+
                    "2 - In another country (DHL)"+"\n"+
                    "3 - In another century (KurlikPost)");
            Integer deliveryMethod= READER.nextInt();
            if(deliveryMethod.equals(1)){
                deliveryStrategy=new NovaPoshta();

            } else if(deliveryMethod.equals(2)) {
                deliveryStrategy=new DHL();
            } else {
                deliveryStrategy=new Pigeon();
            }
            deliveryStrategy.deliveryDetails();
        }
    }
}
