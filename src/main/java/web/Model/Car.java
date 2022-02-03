package web.Model;

public class Car {
    private String model;
    private int age;
    private int gosNumber;

    public Car(String carModel, int age, int gosNumber) {
        this.model = carModel;
        this.age = age;
        this.gosNumber = gosNumber;
    }

    public String getCarModel() {
        return model;
    }

    public void setCarModel(String carModel) {
        this.model = carModel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }
}
