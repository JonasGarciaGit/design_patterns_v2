package creationalPatterns.prototype;

public class Square extends Shape{
    public Square(){}

    public Square(String color){
        this.color = color;
    }

    public Square(Square target){
        super(target);
        if(target != null)
            this.color = target.color;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}
