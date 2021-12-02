public class Centre extends Subject implements Describable {

    public Centre() {
        super("центр");
    }

    public Centre(String name) {
        super(name);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это часть города, где происходят разные интересные события!", name);
        System.out.println();
    }

}
