public class View extends Subject implements Moving, Describable{

    private final String ofWhat = "всего этого";

    public View(){
        super("вид");
    }

    public View(String name){
        super(name);
    }

    public void impress(Neznayka neznayka, Impression impression){
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s %s производил на %s %s. ", name, ofWhat, neznayka.getName(), impression.getAll());
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это то, что можно наблюдать своими глазами!", name);
        System.out.println();
    }
}
