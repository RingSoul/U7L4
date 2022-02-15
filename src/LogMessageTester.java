import java.util.ArrayList;
import java.util.Arrays;

public class LogMessageTester {
    public static void main(String[] args) {
        ArrayList<LogMessage> list = new ArrayList<LogMessage>(Arrays.asList(new LogMessage("1:disk"), new LogMessage("2:error on disk"), new LogMessage("3:error on /dev/disk disk"), new LogMessage("4:error on disk DSK1"), new LogMessage("5:DISK"), new LogMessage("6:error on disk3"), new LogMessage("7:error on /dev/disk"), new LogMessage("8:diskette")));
        System.out.println("--------Testing containsWord()--------");
        for (LogMessage lm : list)
        {
            System.out.println(lm.containsWord("disk"));
            // first four should be true; last four should be false
        }

        System.out.println("--------Testing removeMessages()--------");
        ArrayList<LogMessage> list2 = new ArrayList<LogMessage>();
        list2.add(new LogMessage("CLIENT3:security alert – repeated login failures"));
        list2.add(new LogMessage("Webserver:disk offline"));
        list2.add(new LogMessage("SERVER1:file not found"));
        list2.add(new LogMessage("SERVER2:read error on disk DSK1"));
        list2.add(new LogMessage("SERVER1:write error on disk DSK2"));
        list2.add(new LogMessage("Webserver:error on /dev/disk"));
        SystemLog theLog = new SystemLog(list2);
        System.out.println("Before: " + list2); // original list
        ArrayList<LogMessage> removed = theLog.removeMessages("disk");
        System.out.println("After: " + list2); // after remove
        System.out.println("Removed: " + removed);
    }
}
