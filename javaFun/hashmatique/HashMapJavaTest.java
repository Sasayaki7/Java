import java.util.HashMap;
import java.util.Set;

public class HashMapJavaTest{

    public static void main(String[] args){
        HashMapJava hashes = new HashMapJava();
        HashMap<String, String> tracks = hashes.getTracks();
        Set<String> keys = tracks.keySet();
        for(String key: keys){
            System.out.println(key+": "+tracks.get(key));
        }
    }
}