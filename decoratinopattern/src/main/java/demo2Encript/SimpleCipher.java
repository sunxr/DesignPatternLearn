package demo2Encript;

public class SimpleCipher implements Cipher{

    @Override
    public String encrypt(String text) {
        String str="";
        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            if(c>='a'&&c<='z')
            {
                c+=6;
                if(c>'z') c-=26;
                if(c<'a') c+=26;
            }
            if(c>='A'&&c<='Z')
            {
                c+=6;
                if(c>'Z') c-=26;
                if(c<'A') c+=26;
            }
            str+=c;
        }
        return str;
    }
}
