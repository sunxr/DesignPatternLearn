package demo2Encript;

public class AdvancedCipher extends CipherDecorator{

    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    @Override
    public String encrypt(String text) {
        String result = super.encrypt(text);
        result = this.mod(result);
        return result;
    }

    private String mod(String text) {
        String str="";
        for(int i=0;i<text.length();i++)
        {
            String c=String.valueOf(text.charAt(i)%6);
            str+=c;
        }
        return str;
    }
}
