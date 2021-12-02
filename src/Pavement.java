public class Pavement extends Subject implements Moving, Describable{

    public Pavement(){
        super("тротуары", Conditions.АСФАЛЬТИРОВАННЫЕ);
    }

    public Pavement(String name){
        super(name);
    }

    public Pavement(String name, String condition) {
        super(name, condition);
    }

    public Pavement(String name, Conditions conditions) {
        super(name, conditions);
    }


    public void end(){
        char[] stringArray = this.getCondition().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String condition = new String(stringArray);
        System.out.printf("%s %s кончились. ", condition, this.getName());
        System.out.println();
    }

    public void begin(Conditions conditions){
        this.setCondition(conditions);
        System.out.printf("Начались %s %s, с выбоинами и ухабами. ", this.getCondition(), this.getName());
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это часть улицы, где разрешено ходить пешеходам!", name);
        System.out.println();
    }
}
