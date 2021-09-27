import java.text.MessageFormat;
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            total += i;
        }
        return total;
    }
    
    public int[] getStreakGoal(int numWeeks) {
        int total = 0;
        for (int i = 1; i < numWeeks; i++) {
            total += i;
        }
        int[] val = new int[2];
        val[0] = numWeeks;
        val[1] = total;
        return val;
    }
    
    public void printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);
        double total = 0.0;
        for (int i = 0; i < maxNumber; i++) {
            total += price;
            String message = MessageFormat.format("{0} - {1}", i, total);
            System.out.println(message);
        }

    }

    public double getOrderTotal(double[] lineItems) {
        double total = 0.0;
        for (int i = 0; i < lineItems.length; i++) {
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for (int i = 0; i<menu.size(); i++) {
            String message = MessageFormat.format("{0} {1} -- ${2}", i, menu.get(i), prices.get(i));
            System.out.println(message);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.printf("There are %s people ahead of you.\n", customers.size());
        customers.add(userName);
    }
}