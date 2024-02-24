import java.util.Scanner;

public class Application {

        static String progressCharacter = "-";
        static String alternateCharacer = "+";

        public static void main(String[] args) throws InterruptedException {

            long loopCount = 1_000_000_000; // How long to loop (_ enhances readabilty)
            long frequency = 10;            // How often to perform alternate processing
            int  sleepTime = 1000;          // How many milliseconds to pause program (1000=1 second)

            for (int i = 0; i < loopCount; i++) {
                if (i % frequency != 0) {
                   System.out.print(progressCharacter);
                }
                else {
                      System.out.print(alternateCharacer);
                }
                Thread.currentThread().sleep(sleepTime);  // pause execution for sleepTime milliseconds
                }
             }
        }

