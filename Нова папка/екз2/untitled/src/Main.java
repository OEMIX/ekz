class One {
    int j = 2;

}
class Two extends One {
    int j = 3;

    public Two(){
    }

    void suma(){
        System.out.println(super.j + this.j);
    }
}

public class Main {
    public Main(){

    }
    public static void main(String[] args) {
        Two t = new Two();
        t.suma();
    }
}