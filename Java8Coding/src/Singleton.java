public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }
    public static void main(String[] args) {
        Singleton ob1=Singleton.getInstance();
        Singleton ob2=Singleton.getInstance();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
    }
}
