class Circle extends Shape{
    
    private double pi = 3.14;
    private double radius;
    
    public Circle(double r){
        radius = r;
    }    
    
    @Override
    double calculateArea(){

        area = pi*radius*radius;
        return area;

     }   
       
    
}


   