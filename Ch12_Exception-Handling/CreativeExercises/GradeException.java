public class GradeException extends Exception{
	public static char[]valid={'A','B','C','D','F','I'};
	
	public GradeException(char grade){
		super("\""+grade+"\" isn't a valid letter grade; the student's grade will"+
			" be set to \"I\" for \"Incomplete.\"");
	}
}