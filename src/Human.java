public abstract class Human implements Moving {
    private String name;
    private String home;

    public Human() {
        this.name = "Неизвестный житель";
        this.home = "Неизвестный город";
    }

    public Human(String name) {
        this.name = name;
        this.home = "Неизвестный город";
    }

    public Human(String name, String home) {
        this.name = name;
        this.home = home;
    }

    @Override
    public String toString() {
        return (name + " из " + home);
    }

    public String getName() {
        return name;
    }

    public String getHome() {
        return home;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Human)) return false;

        Human h = (Human) obj;
        return this.name.equals(h.name);
    }

    @Override
    public int hashCode() {
        return 1000 * name.hashCode() + 2021;
    }

}
