public class App {
    public static void main(String[] args) throws Exception {
     
        Rectangle rec = new Rectangle(20,20);
        Circle c1 = new Circle(7);
            
        rec.calculateArea();
        rec.display();

        c1.calculateArea();
        c1.display();
        
            
        
    }
}
