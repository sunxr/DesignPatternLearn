package DeepClone;

public class Client {

    public static void main(String args[]) {
        WeeklyLog log_previous, log_new = null;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
        try {
            log_new = log_previous.deepClone();
        }
        catch (Exception e) {
            System.out.println("克隆失败");
        }

        System.out.println("深复制");
        System.out.println("周报是否相同：" + (log_previous == log_new));
        System.out.println("附件是否相同：" + (log_previous.getAttachment() == log_new.getAttachment()));
    }

}
