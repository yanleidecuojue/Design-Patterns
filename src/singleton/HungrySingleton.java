package singleton;

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    private static HungrySingleton getInstance() {
        return instance;
    }
}
