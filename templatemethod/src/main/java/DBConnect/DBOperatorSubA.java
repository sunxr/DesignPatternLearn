package DBConnect;

public class DBOperatorSubA extends DBOperator{
    @Override
    public void connectDB() {
        System.out.println("使用JDBC连接数据库");
    }
}
