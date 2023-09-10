public class Version {

    public static void main(String[] args){
        System.out.println("Displaying Java version:");
        System.out.println("========================");
        System.out.println("  Current JVM GetProperty version - " + System.getProperty("java.version"));
        // Following only works in Java 9 and above
        //System.out.println("  Current JVM Runtime version     - " + Runtime.version());
    }
}