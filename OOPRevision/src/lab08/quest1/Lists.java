package lab08.quest1;
import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value){
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value){
        list.add(value);
    }

    public static void replace(List<Integer> list, int value){
        list.set(2, value);
    }

    public static void remove(List<Integer> list){
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 666){
                list.remove(i);
            }
        }
    }
    public static void copy(List<Integer> source, List<Integer> target){
        target.clear();
        for (int num: source){
            target.add(num);
        }
    }

    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list){
        for (int i = 0; i < list.size() / 2; i++){
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.add(0, value);
        list.add(value);
    }
}
