package singleton;

public class SingleObject {
    //私有构造函数，该类不会被实例化
    private SingleObject(){}

    //创建一个SingleObject对象
    private static SingleObject instance = new SingleObject();

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
