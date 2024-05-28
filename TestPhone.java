package Day2;

public class TestPhone{
    public static void main(String[] args) {
        Phone.softkeyboard=false;
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        System.out.println(p1.softkeyboard);
        System.out.println(p2.softkeyboard);
        p1.softkeyboard=true;
        System.out.println(p1.softkeyboard);
        System.out.println(p2.softkeyboard);
        System.out.println(p3.softkeyboard);

        p1.setNumber();
        System.out.println(p1.phoneN);
    }
}
