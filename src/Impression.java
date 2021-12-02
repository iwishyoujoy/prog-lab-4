public class Impression extends Subject implements Describable{

    public Impression() {
        super("впечатление", Conditions.УДРУЧАЮЩЕЕ);
    }

    public Impression(String name) {
        super(name);
    }

    public Impression(String name, String condition) {
        super(name, condition);
    }

    public Impression(String name, Conditions conditions) {
        super(name, conditions);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это первые чувства, которые вы испытываете в результате чего-либо. ", name);
        System.out.println();
    }
}
