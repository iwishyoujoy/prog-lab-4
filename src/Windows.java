public class Windows extends Impression implements Moving, Describable{

    private final String how = "подслеповатее";

    public Windows(){
        super("окна");
    }

    public Windows(String name){
        super(name);
    }

    public void become(){
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s становились %s. ", name, how);
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это рамы со стеклянными вставками, через которые можно наблюдать за птичками!", name);
        System.out.println();
    }
}
