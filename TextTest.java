
import java.util.Scanner;

/**
 *  <h1> Phrase Analyzer </h1>
 *  The text analyzer program takes input from user and its should be string,
 *  then it compute the frequency of the letter which is come from user. It
 *  proceeds in alphabetical order.
 *  <p>
 *      <b>Note:</b> I gave proper comments in the rows.
 *  </p>
 * @author Jiyan Sürer
 * @version 2.5
 * @since 2020-12-13
 */

public class TextTest {
    /**
     * In the main method, it takes string from user than count all the
     * characters then showed the frequency of the all characters.
     */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input a string of text.");
            String txt = scan.nextLine();

            int freq;
            int[] counter = new int[100000000]; //array of frequency

            for (freq = 0; freq < txt.length(); freq++) {
                counter[txt.charAt(freq)]++; //txt means it analyses given text
            }

            System.out.println("Table of Frequency");
            System.out.println("*************************");

            // Print Frequency of characters
            for (freq = 1; freq < 100000000; freq++) { //it counts by one by
                if (counter[freq] != 0) {

                    System.out.println((char) freq  + " - " + counter[freq] );
                    //it prints the frequency of the characters
                }
            }
        }
    }


