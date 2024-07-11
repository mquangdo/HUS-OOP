package designpattern.adapter.example2;

public class ReadTextFile {
    public ReadTextFile(){

    }
    public void read(TextFile file){
        System.out.println("Name: " + file.exportFile()[0]);
        System.out.println("School: " + file.exportFile()[1]);
    }
}
