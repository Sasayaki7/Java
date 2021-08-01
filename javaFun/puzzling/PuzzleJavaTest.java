import java.util.ArrayList;

public class PuzzleJavaTest{

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        int[] tenrolls = puzzle.getTenRolls();
        for (int roll: tenrolls){
            System.out.println(roll);
        }
        char randLetter = puzzle.getRandomLetter();
        System.out.println(randLetter);
        String password = puzzle.generatePassword();
        System.out.println(password);
        String[] passwordSet = puzzle.getNewPasswordSet(7);
        for (String pw: passwordSet){
            System.out.println(pw);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 24; i++){
            nums.add(i);
        }
        puzzle.shuffleArray(nums);
        System.out.println(nums);
    }
}