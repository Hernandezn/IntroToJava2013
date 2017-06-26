public class UseBook{
	public static void main(String[]args){
		Fiction a=new Fiction("Spiritua");
		NonFiction b=new NonFiction("History in Brief");
		
		System.out.println("\""+a.getTitle()+"\", $"+a.getPrice());
		System.out.println("\""+b.getTitle()+"\", $"+b.getPrice());
	}
}