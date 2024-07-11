package designpattern.adapter.example2;

public class JSONFileAdapter extends TextFile{
    private JSONFile jsonFile;

    public JSONFileAdapter(JSONFile jsonFile){
        super(new String[0]);
        this.jsonFile = jsonFile;
    }

    public String[] exportFile(){
        String[] file = {jsonFile.exportJSONFile().get("name"), jsonFile.exportJSONFile().get("school")};
        return file;
    }
}
