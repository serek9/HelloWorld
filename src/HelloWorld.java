import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[]args){
        List<coche> coches = new ArrayList<>();

        coche jaguar = new coche("2525CNT","Jaguar", "J-Type", 8000.0, "rojo");
        coche bmw = new coche("2424CNT","BMW", "B-Type", 9000.0, "rojo");
        coche nissan = new coche("2323CNT","Nissan", "N-Type", 5000.0, "rojo");

        coches.add(jaguar);
        coches.add(bmw);
        coches.add(nissan);

        System.out.println(coches.get(0));

    }
}
