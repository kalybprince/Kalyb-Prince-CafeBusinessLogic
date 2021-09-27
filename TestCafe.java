import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    
	public static void main(String[] args) {

        CafeUtil cU = new CafeUtil();

        System.out.println("----- Streak Goal Test -----");
        int weeks = 20;
        System.out.printf("Purchases needed by week 10: %s \n", cU.getStreakGoal());
        System.out.printf("Purchases needed by week %s: %s \n", cU.getStreakGoal(weeks)[0], cU.getStreakGoal(weeks)[1]);

        System.out.println("----- Price Chart Test-----");
        cU.printPriceChart("Chai Latte Mix", 4.5, 3);
        cU.printPriceChart("Specialty Coaster", 2.0, 5);

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n", cU.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        cU.displayMenu(menu, prices);

        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // Test 4 times
        for (int i = 0; i < 4; i++) { 
            cU.addCustomer(customers); 
            System.out.println(customers);
}

	}
}
