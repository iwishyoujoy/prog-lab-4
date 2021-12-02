public class ClosedBalagan extends Subject implements Describable {

    public ClosedBalagan() {
        super("закрытие балагана");
    }

    public ClosedBalagan(String name) {
        super(name);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это когда весь шум и вздор заканчивается. ", name);
        System.out.println();
    }
}
