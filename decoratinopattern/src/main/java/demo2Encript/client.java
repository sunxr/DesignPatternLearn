package demo2Encript;

public class client {

    public static void main(String args[]) {
        String password = "sunxinrong";
        String enPassword;
        Cipher sc,cc,ac;

        sc = new SimpleCipher();
        enPassword = sc.encrypt(password);
        System.out.println(enPassword);
        System.out.println("-----------");

        cc = new ComplexCipher(sc);
        enPassword = cc.encrypt(password);
        System.out.println(enPassword);
        System.out.println("------------");

        ac = new AdvancedCipher(cc);
        enPassword = ac.encrypt(password);
        System.out.println(enPassword);
        System.out.println("------------");

    }

}
