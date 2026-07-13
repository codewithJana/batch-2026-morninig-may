public class Ternary_operator {

    static void main() {
        int a=10, b=40,c=30, result;
        result=((a>b)?(a>c)?a:c:(c>b)?c:b); // 1. if a>b and a>c then print a or else print c
                                            // 2. if c>a then check c>b if yes then print c or print b

        System.out.println(result);
    }
}

