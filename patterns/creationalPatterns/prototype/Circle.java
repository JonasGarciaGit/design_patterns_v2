package creationalPatterns.prototype;

public class Circle extends Shape {
    public Circle(){}

    public Circle(String color){
        this.color = color;
    }

    public Circle(Circle target){
        super(target);
        if(target != null)
            this.color = target.color;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
