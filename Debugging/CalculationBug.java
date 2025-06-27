package Debugging;

public class CalculationBug {
public static void main(String[] args) {
int result = calculateDiscount(1000, 20); // Expecting 800
System.out.println("Discounted price: " + result);
}
public static int calculateDiscount(int price, int
discountPercent) {
return price - discountPercent / 100 * price; // 💥 Wrongprecedence
}
}