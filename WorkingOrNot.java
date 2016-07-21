import java.util.Scanner;

public class WorkingOrNot {
	public String workingDay(String st){
		if((st.equals("Monday"))||(st.equals("Tuesday"))||(st.equals("Wednesday"))||(st.equals("Thursday"))||(st.equals("Friday"))||(st.equals("Saturday")))
			return "True";
		else if((st.equals("Saturday"))||(st.equals("Sunday")))
			return "False";
		else
			return "Invalid day";

	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the week day: ");
		String str= s.next();
		WorkingOrNot not=new WorkingOrNot();
		not.workingDay(str);
		
	}

}
