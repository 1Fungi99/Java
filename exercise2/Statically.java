package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run,
    //refactor the code here in Java.
    public static void main(String[] args) {
        Statically stats = new Statically("Epoxy", "Jello");
        stats.moveAndShake();
        stats.stubborn();
        stats.explain();
    }

    public Statically(String glue, String jello) {
        glue = "Epoxy";
        jello = "Jello";
    }

    public void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public void stubborn() {
        this.moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public void explain() {
        this.stubborn();
        System.out.println(
                "I have no idea what static does but the minute that i deleted it, everything worked the way i think it should.");
    }
}
