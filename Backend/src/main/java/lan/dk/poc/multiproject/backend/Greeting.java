package lan.dk.poc.multiproject.backend;

/**
 * Created by kevin on 20/05/2016 for MultiProject-Java-JS
 */
public class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Greeting setName(String name) {
        this.name = name;
        return this;
    }
}
