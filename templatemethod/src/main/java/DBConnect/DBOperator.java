package DBConnect;

public abstract class DBOperator {

    public abstract void connectDB();

    public void openDB() {
        System.out.println("打开数据库");
    }

    public void useDB() {
        System.out.println("使用数据库");
    }

    public void closeDB() {
        System.out.println("关闭数据库");
    }

    public void process() {
        connectDB();
        openDB();
        useDB();
        closeDB();
    }

}
