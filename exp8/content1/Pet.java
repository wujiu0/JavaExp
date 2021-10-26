package exp8.content1;

public abstract class Pet {
    private String name;
    private String color;
    private String breed;

    public Pet() {
    }

    public Pet(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "";
    }

    public abstract void cry();

    public void speak() {
        System.out.print("我是一只" + getType() + "。我叫" + name + ",是一只" + color + "的" + breed + "。我会");
        cry();
    };

    public abstract String getType();
}
