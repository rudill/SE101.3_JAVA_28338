class Rectangle extends Shape {
    
    private double width;
    private double hight;
    

    public Rectangle(double w,double h){

        width = w;
        hight = h;
    }

    @Override
    double calculateArea() {
        
        area = width*hight;
        return area;
    }
}
