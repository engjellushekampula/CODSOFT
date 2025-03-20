/*This class Helper will help us to make some methods and to call them whenever we need to take something
from the user!
 */

package Helper;
import java.util.Scanner;

public class Helper {
    public static int getNumberFromUser (){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public static double getAmountFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
