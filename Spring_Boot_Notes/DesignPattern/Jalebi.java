public class Jalebi {

    // Eager way of creating singleton object
    private static final Jalebi jalebi = new Jalebi();

    public static  Jalebi getJalebi(){
        return jalebi;
    }
}
