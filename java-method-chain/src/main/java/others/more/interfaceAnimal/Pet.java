package others.more.interfaceAnimal;

public abstract class Pet<T extends Pet<T>> implements IPet<T> {
    private String name;

    private String eyeColor;
    private int hungryLevel;

    public T setName(String name) {
        this.name = name;
        return getThis();
    }

    public T setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return getThis();
    }

    public T setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
        return getThis();
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", hungryLevel=" + hungryLevel +
                '}';
    }
}