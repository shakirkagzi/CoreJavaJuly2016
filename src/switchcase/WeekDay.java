package switchcase;

public class WeekDay {
	public String getWeekDay(String day)
	{
		String taskToDo="";
		// day =day.toUpperCase();
		switch(day)
		{
		case "Monday": taskToDo="Start with CodeLab";break;
		case "Tuesday": taskToDo="Join Mentoring Session by Jawed";break;
		case "Wednesday": taskToDo="Join Mentoring Session by Kaya";break;
		case "Thursday": taskToDo="Home work is due";break;
		case "Friday": taskToDo="Prepare for the quiz and complates the quiz on friday night";break;
		case "Saturday": taskToDo="Our Java class is on session";break;
		case "Sunday": taskToDo="Start with CodeLab";break;
		default: taskToDo = "Out of week days";
		}
		return taskToDo;
	}
}
