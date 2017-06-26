public class LibraryBook{
	private String title;
	private String author;
	private int pageCount;
	
	public void setTitle(String entry){
		title=entry;
	}
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(String entry){
		author=entry;
	}
	public String getAuthor(){
		return author;
	}
	
	public void setPageCount(int entry){
		pageCount=entry;
	}
	public int getPageCount(){
		return pageCount;
	}
	
	public void display(){
		System.out.println("\""+title+"\" by "+author+", "+pageCount+" pages");
	}
}