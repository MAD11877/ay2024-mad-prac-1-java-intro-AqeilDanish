import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter number:");
    int count = in.nextInt();
    int[] numbers = new int[count];

    // Input integers
    for (int i = 0; i < count; i++) {
        numbers[i] = in.nextInt();
    }
    
    Arrays.sort(numbers); 

    int mode = numbers[0]; 
    int maxCount = 1; 
    int currentCount = 1; 
    
    for (int i = 1; i < count; i++) {
        if (numbers[i] == numbers[i - 1]) {
            currentCount++; 
        } else {
            if (currentCount > maxCount) {
                maxCount = currentCount; 
                mode = numbers[i - 1]; 
            }
            currentCount = 1; 
        }
    }

    if (currentCount > maxCount) {
        mode = numbers[count - 1];
    }

    System.out.println("Mode: " + mode);
    
  }
}
