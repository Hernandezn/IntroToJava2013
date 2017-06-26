import java.util.Scanner;

public class LibraryBookSort{
	enum Sort{T, A, P}
	
	public static void main(String[]args){
		LibraryBook[]books=new LibraryBook[5];
		Scanner input=new Scanner(System.in);
		int x;
		String data;
		Sort entry;
		
		for(x=0; x<books.length; x++){
			books[x]=new LibraryBook();
			
			System.out.print("What is the title of book "+(x+1)+"? ");
			books[x].setTitle(input.nextLine());
			
			System.out.print("What's the author's name? ");
			books[x].setAuthor(input.nextLine());
			
			System.out.print("How many pages are in book "+(x+1)+"? ");
			books[x].setPageCount(input.nextInt());
			input.nextLine();
			System.out.println();
		}
		
		do{
		System.out.print("Would you like these books sorted by title, author, or"+
			" page count? ");
		data=Character.toUpperCase(input.nextLine().charAt(0))+"";
		}while(!data.equalsIgnoreCase("T") && !data.equalsIgnoreCase("A") &&
				 !data.equalsIgnoreCase("P"));
		entry=Sort.valueOf(data);
		
		switch(entry){
			case T:
				sortByTitle(books);
				break;
			case A:
				sortByAuthor(books);
				break;
			case P:
				sortByPages(books);
				break;
		}
		
		for(x=0; x<books.length; x++)
			books[x].display();
	}//main
	
	public static void sortByTitle(LibraryBook[]array){
		int x;
		int y;
		int compare;
		LibraryBook temp;
		int limit=array.length-1;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++){
				compare=array[y].getTitle().compareTo(array[y+1].getTitle());
				if(compare>0){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
	}//title sort
	public static void sortByAuthor(LibraryBook[]array){
		int x;
		int y;
		int compare;
		LibraryBook temp;
		int limit=array.length-1;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++){
				compare=array[y].getAuthor().compareTo(array[y+1].getAuthor());
				if(compare>0){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
	}//author sort
	public static void sortByPages(LibraryBook[]array){
		int x;
		int y;
		LibraryBook temp;
		int limit=array.length-1;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++)
				if(array[y].getPageCount() > array[y+1].getPageCount()){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
	}//pages sort
}