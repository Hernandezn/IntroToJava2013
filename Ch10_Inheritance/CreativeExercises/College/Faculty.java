import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee{
	private boolean tenured;
	
	public void setData(){
		super.setData();
		boolean b=false;
		String entry;
		
		do{
			entry=JOptionPane.showInputDialog(null,"Is the employee tenured?");
			entry=(entry.charAt(0)+"").toUpperCase();
			
			if(entry.equals("Y")){
				tenured=true;
				b=true;
			}
			else if(entry.equals("N")){
				tenured=false;
				b=true;
			}
		}while(!b);
	}
	
	public void display(){
		super.display();
		System.out.println("Tenured: "+tenured);
	}
}