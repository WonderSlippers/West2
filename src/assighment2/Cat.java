package assighment2;

public abstract class Cat {
    protected String name;
    protected int age;
    protected String gender;
    protected double price;

    public Cat(String name, int age, String gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public abstract String toString() ;
}
