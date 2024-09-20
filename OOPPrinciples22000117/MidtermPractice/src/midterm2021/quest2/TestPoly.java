package midterm2021.quest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPoly {
    List<Poly> polyList;

    public TestPoly() {
        polyList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int[] coef = new int[5];
            for (int j = 0; j < 5; j++) {
                int num = random.nextInt(10);
                coef[j] = num;
            }
            Poly listPoly = new ListPoly(coef);
            polyList.add(listPoly);
        }
        for (int i = 0; i < 5; i++) {
            int[] coef = new int[5];
            for (int j = 0; j < 5; j++) {
                int num = random.nextInt(10);
                coef[j] = num;
            }
            Poly listPoly = new ArrayPoly(coef);
            polyList.add(listPoly);
        }
    }
}
