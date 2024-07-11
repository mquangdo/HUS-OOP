package designpattern.adapter.example2;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        String[] info = {"Quang", "HUS"};
        ReadTextFile readTextFile = new ReadTextFile();
        TextFile textFile = new TextFile(info);
        JSONFile jsonFile = new JSONFile(info);
        readTextFile.read(textFile);
        JSONFileAdapter jsonFileAdapter = new JSONFileAdapter(jsonFile);
        readTextFile.read(jsonFileAdapter);
        System.out.println(jsonFile.exportJSONFile());
        System.out.println(Arrays.toString(textFile.exportFile()));

    }
}
