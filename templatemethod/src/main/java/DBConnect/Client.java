package DBConnect;

public class Client {

    public static void main(String args[]) {
        DBOperator dbo;

        dbo = new DBOperatorSubA();
        dbo.process();
        System.out.println("-----------");
        dbo = new DBOperatorSubB();
        dbo.process();
    }

}
