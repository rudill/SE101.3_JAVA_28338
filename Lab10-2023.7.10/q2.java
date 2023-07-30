import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        int [] array1;
        int index;
        array1 = new int[]{4,6,1,7,8};

        System.out.println("Enter index value --> ");
        index = scan.nextInt();
        scan.close();
        try{
        System.out.println("The value is "+array1[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is not available");
        }
        
        
    }
}
