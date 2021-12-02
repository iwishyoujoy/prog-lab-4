public class Garbage extends Subject implements Moving, Describable{

    private final String how = "поперек";

    public Garbage(){
        super("кучи мусора");
    }

    public Garbage(String name){
        super(name);
    }

    public void lay(){
        char[] stringArray = how.toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String how = new String(stringArray);
        System.out.printf("%s лежали %s. ", how, this.getName());
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это мешки, которые оставляют плохие люди на улице.", name);
        System.out.println();
    }
}
