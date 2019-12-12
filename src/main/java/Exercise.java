import org.apache.commons.lang3.StringUtils;
import util.Input;

public class Exercise {
    public static void main(String[] args) {
        Input input = new Input();
        // Tells whether or not what the user entered is a number
        System.out.println("Enter a number: ");
        System.out.println("StringUtils.isNumeric(input.getString()) = " + StringUtils.isNumeric(input.getString()));
        // Flips the case of the string
        System.out.println("Enter your name: ");
        System.out.println("StringUtils.swapCase(input.getString()) = " + StringUtils.swapCase(input.getString()));
        // Reverses the string
        System.out.println("Enter your city: ");
        System.out.println("StringUtils.reverse(input.getString()) = " + StringUtils.reverse(input.getString()));
    }
}
