package abstractfactory;

//抽象工厂：农场类
interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}