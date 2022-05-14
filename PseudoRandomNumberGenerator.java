// Cryptography Proof Of Concept
// How PRNG doesn't use a secure algorithm to generate a random value ?

// ----------------------------------------------------------------------
// Import util package
import java.util.*;

class PRNG {
  public static void main(String[] args) {
    // Create new random instance
    Random random = new Random();

    // Create new scanner instance
    // It work to verify if the number enter is integer
    Scanner sc = new Scanner(System.in);
    int i = 1;
    

    System.out.println("Cryptography Proof Of Concept\n");

    while(true)
    {

        System.out.print("Enter value : ");
        int userEntry = sc.nextInt();
        int secret = random.nextInt();
        

        if(secret == userEntry){
            System.out.println("Well played, you find guess value !\n");
        }
        else
        {
        System.out.println("Random "+ i + ": " + secret + "\n");
        }
        i++;
    }
  }
}