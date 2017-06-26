public class BookArray{
	public static void main(String[]args){
		Book[]books={new NonFiction("... of Tomorrow"), new Fiction("Spiritua"),
			new Fiction("EverWorld"), new Fiction("The Hunger Games"), new
			NonFiction("Sweet Child of Mine"), new Fiction("The Undead"), new
			NonFiction("The Truth of Life"), new NonFiction("The Day of Moscow"), new
			NonFiction("Our Cosmic Backyard"), new Fiction("Unforgiving Love")};
		int x;
		
		for(x=0; x<books.length; x++)
			System.out.println("\""+books[x].getTitle()+"\", $"+books[x].getPrice());
	}
}