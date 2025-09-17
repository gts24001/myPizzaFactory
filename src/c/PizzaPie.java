package c;
public class PizzaPie implements Pizza {
    public void prepare() {
        System.out.println("Preparing Pizza Pie");
    }
    
    public void bake() {
        System.out.println("Baking Pizza Pie");
    }
    
    public void cut() {
        System.out.println("Cutting Pizza Pie");
    }
    
    public void box() {
        System.out.println("Boxing Pizza Pie");
    }
}