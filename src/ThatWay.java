public class ThatWay extends Subject implements Describable{

    public ThatWay() {
        super("таким образом");
    }

    public ThatWay(String name) {
        super(name);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это когда что-то сделано определенным образом. ", name);
        System.out.println();
    }
}
