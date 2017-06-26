public class DemoBook{
	public static void main(String[]args){
		Book assignment=new Book();
		Textbook worldLit=new Textbook();
		
		assignment.setTitle("Confessions");
		assignment.setPages(195);
		
		worldLit.setTitle("The World of Modern Literature");
		worldLit.setPages(1232);
		worldLit.setGrade(12.5);
		
		System.out.println(assignment.getTitle()+", "+assignment.getPages()+" pages");
		System.out.println(worldLit.getTitle()+", "+worldLit.getPages()+
			" pages, grade "+worldLit.getGrade());
	}
}