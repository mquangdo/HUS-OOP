package week12;

import java.util.Scanner;
import java.util.ArrayList;

public class MotorbikeTest
{
    public MotorbikeTest(){

    }

    static Scanner sc;

    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n) {
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String manu = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());
            double weight = Double.parseDouble(sc.nextLine());
            String date = sc.nextLine();
            Motorbike mb = new Motorbike(id, name, manu, quantity, price, weight, date);
            motorbikes.add(mb);
        }
    }
    public static void outputMotorbike (ArrayList<Motorbike> motorbikes) {
        for(int i = 0; i < motorbikes.size(); i++){
            motorbikes.get(i).printMotorbike();
        }
    }
    public static ArrayList<Motorbike> search (String manu, ArrayList<Motorbike> motorbikes)
    {
        ArrayList<Motorbike> result = new ArrayList<Motorbike>();
        for(int i=0;i<motorbikes.size();i++){
            if(motorbikes.get(i).getManu().equals(manu))
                result.add(motorbikes.get(i));

        }
        return result;
    }
    public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
    {
        ArrayList<Motorbike> result2=new ArrayList<Motorbike>();
        double max=0;
        for(int i=0;i<motorbikes.size();i++){
            if(motorbikes.get(i).getWeight()>max)
                max=motorbikes.get(i).getWeight();
        }
        for(int i=0;i<motorbikes.size();i++){
            if(motorbikes.get(i).getWeight()==max){
                result2.add(motorbikes.get(i));
            }
        }
        return result2;
    }
    public static ArrayList<Motorbike> minQuantity (ArrayList<Motorbike> motorbikes)
    {
        ArrayList<Motorbike> result3 = new ArrayList<Motorbike>();
        double min=Integer.MAX_VALUE;
        for(int i=0;i<motorbikes.size();i++){
            if(motorbikes.get(i).getQuantity()<min){
                min = motorbikes.get(i).getQuantity();
            }
        }
        for(int i=0;i<motorbikes.size();i++){
            if(motorbikes.get(i).getQuantity()==min){
                result3.add(motorbikes.get(i));
            }
        }

        return result3;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Motorbike> mbs = new ArrayList<Motorbike>();
        inputMotorbike(mbs,n);
        int c = Integer.parseInt(sc.nextLine());
        //outputMotorbike(mbs);
        if (c == 1) {
            ArrayList <Motorbike> results = new ArrayList<Motorbike>();
            results = search ("Honda", mbs);
            outputMotorbike(results);
        }
        else if(c==2){
            ArrayList <Motorbike>rs2= new ArrayList<Motorbike>();
            rs2= maxWeight(mbs);
            outputMotorbike(rs2);
        }
        else if(c==3){
            ArrayList <Motorbike>rs3= new ArrayList<Motorbike>();
            rs3= minQuantity(mbs);
            outputMotorbike(rs3);


        }


    }

}