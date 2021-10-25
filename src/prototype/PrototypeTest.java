package prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeRealize obj1 = new PrototypeRealize();
        PrototypeRealize obj2 = (PrototypeRealize) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
