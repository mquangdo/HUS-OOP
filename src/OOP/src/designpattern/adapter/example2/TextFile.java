package designpattern.adapter.example2;

public class TextFile {
    private String[] file;
    public TextFile(String[] file){
        this.file = file;
    }

    public String[] exportFile(){
        return file;
    }
}
