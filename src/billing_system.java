import java.util.Scanner;

public class billing_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int items = sc.nextInt();

        float final_price = 0;

        for(int i = 1; i<=items; i++){
            System.out.println("Enter the price for first item " + i);
            float perItemPrice = sc.nextInt();;

            final_price = final_price + perItemPrice;
        }

        float discount = final_price - ( ((float) 10 /100) * final_price );

        float vat = discount - ( ((float) 13/100) * discount );

        System.out.println("Your final Price is: " + vat);
    }
}
