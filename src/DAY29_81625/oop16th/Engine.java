package DAY29_81625.oop16th;

public class Engine {
    private String type;

    Engine(String type) {
        this.type = type;
    }

    void engineStart() {
        System.out.println("Engine started: " + this.type);
    }
    // Instead of object.engineType.type
    // and also used by the getters 
    // for not the reference hash be returned 
    @Override
    public String toString() {
        return type;
    }
}
