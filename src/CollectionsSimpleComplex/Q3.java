package CollectionsSimpleComplex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q3 {

    static void main(String[] args) {
        int k =3;

        ArrayList<Integer> input = new ArrayList<Integer>
                (Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println("input = " + input);

        k = k % input.size();

        Collections.rotate(input, k);

        System.out.println("Rotated List = " + input);

    }
}
