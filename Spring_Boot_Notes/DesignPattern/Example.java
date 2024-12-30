public class Example {
    public static void main(String[] args) throws Exception, CloneNotSupportedException {

    //    Samosa samosa = Samosa.getSamosa();
    //    System.out.println(samosa.hashCode());

    //    Samosa samosa1 = Samosa.getSamosa();
    //    System.out.println(samosa1.hashCode());


    //    System.out.println(Jalebi.getJalebi().hashCode());
    //    System.out.println(Jalebi.getJalebi().hashCode());

    /*
     * 1. Reflection API to break singleton pattern
     *  solution: 1-> if object is there ==> throw exception from inside constructor
     *            2-> use enum
     * 
     * 2. Deserialization:
     *  solution: implementing readResolve method
     *   
     * 3. cloning
     * 
     * 
     */
    
        // Samosa s1 = Samosa.INSTANCE;
        // System.out.println(s1.hashCode());
        // s1.test();

        // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());


        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        // objectOutputStream.writeObject(samosa);

        // System.out.println("serialization done...");

        // ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        // Samosa s2 = (Samosa)objectInputStream.readObject();

        // System.out.println(s2.hashCode());

        Samosa s2 = (Samosa) samosa.clone();
        System.out.println(s2.hashCode());

    }
}
