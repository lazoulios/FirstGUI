package src;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Info {
    public static Map<String, String> info;

    public Info(){
        info = new HashMap<String, String>();
        try (BufferedReader buffer = new BufferedReader(new FileReader("resources/files/info.txt"))){
            String username = buffer.readLine();
            String password = buffer.readLine();
            while (username!= null && password!=null){
                info.put(username, password);
                username = buffer.readLine();
                password = buffer.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, String> getMap(){
        return info;
    }
}