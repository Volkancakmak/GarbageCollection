public class Main {
    public static void main(String[] args) {
        Runtime rs =Runtime.getRuntime();
        System.out.println("Amount of free memory in jvm before garbage coolection:"+rs.freeMemory());
        rs.gc();
        System.out.println("Amount of free memory in jvm after garbage collection:"+rs.freeMemory());


    }

}