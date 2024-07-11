package designpattern.adapter.example2;
import java.util.HashMap;

public class JSONFile {
    HashMap<String, String> hm;
    public JSONFile(String[] info) {
        hm = new HashMap<>();
        hm.put("name", info[0]);
        hm.put("school", info[1]);
    }

    public HashMap<String, String> exportJSONFile(){
        return hm;
    }
}
