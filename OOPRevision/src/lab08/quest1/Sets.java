package lab08.quest1;
import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>();
        for (int num: first){
            if (second.contains(num)){
                set.add(num);
            }
        }
        return set;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        for (int num: first){
            if (!second.contains(num)){
                second.add(num);
            }
        }
        return second;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>(first);
        res.retainAll(second);
        return res;
    }
}
