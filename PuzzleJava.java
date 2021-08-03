import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{

    Random randMachine = new Random();

    public String getTenRolls(){
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i]=randMachine.nextInt(21);
        }
        return Arrays.toString(arr);
        
    }

    public char getRandomLetter(){
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int randIndex=randMachine.nextInt(21);

        return alphabet[randIndex];
    }

    public String generatePassword(){
        String password= new String();
        for (int i=0; i<8; i++){
            password += getRandomLetter();
        }
        return password;
    }
}