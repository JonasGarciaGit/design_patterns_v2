package creationalPatterns.prototype;

public abstract class Shape {
    public String color;

    public Shape(){}

    public Shape(Shape target){
        if(target != null)
            this.color = target.color;
    }

    public abstract Shape clone();
}
