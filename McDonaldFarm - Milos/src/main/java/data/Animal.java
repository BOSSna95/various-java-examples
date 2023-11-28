package data;

public abstract class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Name: "+ name +", "+"Age: "+ age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
