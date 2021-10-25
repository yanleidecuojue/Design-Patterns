package prototype;

public class PrototypeRealize implements Cloneable {
    PrototypeRealize() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (PrototypeRealize)super.clone();
    }
}
