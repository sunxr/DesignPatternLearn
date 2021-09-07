package DBConnect;

public class DBOperatorSubB extends DBOperator{
    @Override
    public void connectDB() {
        System.out.println("使用连接池连接数据库");
    }
}
