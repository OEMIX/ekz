class One{
    int test(){
        int a =45;
        return a;
    }
}
class Two extends One{
    int test(){
        int b = 20 - super.test();
        return b;
    }
}
class Three extends Two {
    int test(){
        int c = 5+ super.test();
        return c;
    }

}
public class Main {
    public static void main(String[] args) {
    One o = new One();
    Two two = new Two();
    Three t = new Three();
    System.out.println(o.test());
    System.out.println(two.test());
    System.out.println(t.test());

    }
}