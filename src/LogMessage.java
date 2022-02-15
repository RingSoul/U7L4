public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index+1);
    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {

        // Sample solution:
        String newDes = " " + description + " ";
        if (newDes.indexOf(" " + keyword + " ") != -1)
        {
            return true;
        }
        else
        {
            return false;
        }

        /* faulty solution: only works as intended when disk appears EXACTLY ONCE in the description
           i.e. fails the third test (out of the 8)
        int beginning = 0;
        int end = description.length() - keyword.length();
        int index = description.indexOf(keyword);
        if (index == -1)
        {
            return false;
        }
        else if (index == beginning && index == end)
        {
            return true;
        }
        else if (index == beginning)
        {
            String next = description.substring(keyword.length(), keyword.length() + 1);
            if (next.equals(" "))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (index == end)
        {
            String before = description.substring(end - 1, end);
            if (before.equals(" "))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else // not beginning, not end, but is found
        {
            String before = description.substring(index - 1, index);
            String next = description.substring(index + keyword.length(), index + keyword.length() + 1);
            if (before.equals(" ") && next.equals(" "))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        */
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
// There may be instance variables, constructors, and methods that are not shown.

    // added toString method for testing purposes
    public String toString()
    {
        return "ID: " + machineId + "---Description: " + description;
    }
}
