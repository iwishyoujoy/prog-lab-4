public class Neznayka extends Human implements Describable{

    public Neznayka() {
        super("Незнайка", "Солнечный город");
    }

    public Neznayka(String name) {
        super(name);
    }

    public Neznayka(String name, String home) {
        super(name, home);
    }

    public void describe() {
        System.out.printf("%s - это главный герой! Он очаровашка! ", this.getName());
        System.out.println();
    }
}
