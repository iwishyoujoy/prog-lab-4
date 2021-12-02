public class Houses extends Subject implements Moving, Describable{

    private final String how = "ниже";

    public Houses(){
        super("дома");
    }

    public Houses(String name){
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
        System.out.printf("%s - это каменные сооружения, в которых живут добрые люди!", name);
        System.out.println();
    }
}
