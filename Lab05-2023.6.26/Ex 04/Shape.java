public abstract class Shape {
    protected double area;
    
    abstract double calculateArea();
    
    public void display(){
        System.out.println("Area is --> "+area);
    }
}
