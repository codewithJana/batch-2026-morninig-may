package CollectionsSimpleComplex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Q14 {

    public static void main(String[] args) {

        List<String> pageVisits = new ArrayList<>();

        pageVisits.add("p1");
        pageVisits.add("p2");
        pageVisits.add("p1");
        pageVisits.add("p3");
        pageVisits.add("p2");
        pageVisits.add("p4");

        LinkedHashSet<String> uniqueIds = new LinkedHashSet<>();

        for (String id : pageVisits) {
            uniqueIds.add(id);
        }

        System.out.println(uniqueIds);
    }
}
