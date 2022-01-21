package refreshjavaCom.ControlFlowStatements;
class SwitchStatement
{
    public static void main(String [] args)
    {
        int dayNo = 4;
        String dayName;
        switch (dayNo)
        {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("day name = "+dayName);
    }
}
