import com.bridgepattern.Color.Blue;
import com.bridgepattern.Color.Green;
import com.bridgepattern.Color.Red;
import com.bridgepattern.Shapes.Circle;
import com.bridgepattern.Shapes.Shape;
import com.bridgepattern.Shapes.Square;

public class TestBridgePattern {
    public static void main(String[] args) {
//        Creating a Square of side length 5 and filling it with the red color
        Shape redSquare = new Square(5, new Red());
        redSquare.draw();
        System.out.println();

//        Creating a Circle of radius 10 and filling it with the blue color
        Shape blueCircle = new Circle(10, new Blue());
        blueCircle.draw();
        System.out.println();

//        Changing the color of the Square Object to Green
        if (redSquare instanceof Square){
            ((Square) redSquare).changeColor(new Green());
        }
        redSquare.draw();

    }
}
