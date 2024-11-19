package Problem4;

public abstract class Shape2 implements Scalable {
    private String name;

    public Shape2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double computeArea();
    public abstract double computePerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}

