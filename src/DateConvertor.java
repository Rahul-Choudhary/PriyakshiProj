import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {
	public static void main(String...s)
	{
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date dt = new Date();
		String str = df.format(dt);
		System.out.println(str);
		
		String[] datecontent = str.split("/");
		String month_converted = MonthFormatConvertor(Integer.parseInt(datecontent[0]));
		//System.out.println(month_converted);
		
		System.out.println(datecontent[1]+"-"+month_converted+"-"+datecontent[2]);
	}
	public static String MonthFormatConvertor(int month)
	{
		String month_modified = "";
		switch(month)
		{
		
		case 1 :
			month_modified = "Jan";
			break;
		case 2 :
			month_modified = "Feb";
			break;
		case 3 : 
			month_modified = "Mar";
			break;
		case 4 : 
			month_modified = "Apr";
			break;
		case 5 :
			month_modified = "May";
			break;
		case 6 :
			month_modified = "Jun";
			break;
		case 7 : 
			month_modified = "Jul";
			break;
		case 8 : 
			month_modified = "Aug";
			break;
		case 9 :
			month_modified = "Sept";
			break;
		case 10 :
			month_modified = "Oct";
			break;
		case 11 : 
			month_modified = "Nov";
			break;
		case 12 : 
			month_modified = "Dec";
			break;
		}
		return month_modified;
	}
}
