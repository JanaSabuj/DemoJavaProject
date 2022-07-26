import com.flipkart.jedi.ClassB;
import com.flipkart.jedi.ClassC;
import com.flipkart.jedi.ClassD;

public class Demo {
    public static void main(String[] args) {
        System.out.println("This is the first project");

        ClassB classB = new ClassB();
        classB.introB();

        ClassC classC = new ClassC();
        classC.introC();

        ClassD classD = new ClassD();
        classD.introD();
    }
}
