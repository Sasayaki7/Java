import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{
    Random randMachine = new Random(817241231);

    public int[] getTenRolls(){
        int[] tenrolls = new int[10];
        for(int i = 0; i < 10; i++){
            tenrolls[i]=randMachine.nextInt(19)+1;
        }
        return tenrolls;
    }

    public char getRandomLetter(){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return alphabet[randMachine.nextInt(25)];
    }

    public String generatePassword(){
        String password = "";
        for (int i = 0; i < 8; i++){
            password = password+getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int num){
        String[] passwordSet = new String[num];
        for(int i = 0; i < num; i++){
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public void shuffleArray (ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            int index1 = randMachine.nextInt(arr.size());
            int index2 = randMachine.nextInt(arr.size());
            Integer x = arr.get(index1);
            arr.set(index1, arr.get(index2));
            arr.set(index2, x);
        }
    }
}