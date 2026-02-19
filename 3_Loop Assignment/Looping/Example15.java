/*Q15. Write a java program to print all ASCII characters with their values.*/

public class Example15 {
    public static void main(String[] args) {
        System.out.println("ASCII Characters and their Values:");

        int i = 0; // starting ASCII value
        while (i <= 255) {
            System.out.println(i + " --> " + (char)i);
            i++;
        }
    }
}
