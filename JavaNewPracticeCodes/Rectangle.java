package JavaNewPracticeCodes;
public class Rectangle {
	
    int width;
    
    int height;

   
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

   
    int getPerimeter() {
        return 2 * (width + height);
    }

    boolean Square() {
        return width == height;
    }

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        
        System.out.println("Area of rectangle : " + r.getArea()); 
        
        System.out.println("Perimeter of rectangle : " + r.getPerimeter()); 
        
        System.out.println("Is a Square ? " + r.Square());  
        
    }
}
