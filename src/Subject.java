public abstract class Subject implements Describable{

    private String name;
    private String condition;
    private Conditions conditionType;

    public Subject(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public Subject(String name, Conditions conditions) {
        this.name = name;
        conditionType = conditions;
        this.setCondition(conditionType);
    }

    public Subject(String name) {
        this.name = name;
        this.condition = "Состояние неизвестно";
    }

    public Subject() {
        this.name = "Неопознанный объект";
        this.condition = "Состояние неизвестно";
    }

    @Override
    public String toString() {
        return ("Этот объект называется " + name + ". Его состояние: " + condition);
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public String getAll() {
        return (condition + " " + name);
    }

    public void setCondition(Conditions conditionType) {
        switch(conditionType){
            case ОСВЕЩЕННЫЕ:
                condition = "освещенные";
                break;
            case ЯРКИЕ:
                condition = "яркие";
                break;
            case АСФАЛЬТИРОВАННЫЕ:
                condition = "асфальтированные";
                break;
            case БУЛЫЖНЫЕ:
                condition = "булыжные";
                break;
            case УДРУЧАЮЩЕЕ:
                condition = "удручающее";
                break;
            case НЕПРИЯТНОЕ:
                condition = "неприятное";
                break;
        }
    }

    public void describe(){
        System.out.println("Этот объект ещё не определен. В Солнечном городе ничего про него не слышали :( ");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Subject)) return false;

        Subject s = (Subject) obj;
        return this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return 1000 * name.hashCode() + 2021;
    }
}
