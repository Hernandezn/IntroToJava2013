import java.util.Arrays;
import javax.swing.JOptionPane;

public class SortDoublesWithOption{
	public static void main(String[]args){
		double[]values={-8.9,-4.5, -6.7,-2.3, 2.1, -.1, 4.3, 8.7, 6.5,10.9,
			-11.1,13.1, -13.3,15.3,-15.5};
		int x;
		StringBuilder nums=new StringBuilder(75);
		String entry;
		int result;
		
		for(x=0; x<values.length; x++)
			nums.append(values[x]+" ");
		
		result=JOptionPane.showConfirmDialog(null,"The values are:\n"+nums+
			"\nWould you like them sorted in decending order?");
		
		nums=new StringBuilder(75);
		if(result==JOptionPane.NO_OPTION){
			Arrays.sort(values);
			for(x=0; x<values.length; x++)
				nums.append(values[x]+" ");
			JOptionPane.showMessageDialog(null,"In ascending order, the values are:\n"+
				nums);
		}
		else if(result==JOptionPane.YES_OPTION){
			descendingSort(values);
			for(x=0; x<values.length; x++)
				nums.append(values[x]+" ");
			JOptionPane.showMessageDialog(null,"In descending order, the values are:\n"
				+nums);
		}
		else
			JOptionPane.showMessageDialog(null,"No sort requested.");
	}//main
	
	public static void descendingSort(double[]array){
		int x, y;
		double temp;
		int limit=array.length-1;
		
		for(y=0; y<limit; y++)
			for(x=0; x<limit-y; x++)
				if(array[x]<array[x+1]){
					temp=array[x];
					array[x]=array[x+1];
					array[x+1]=temp;
				}
	}//descendingSort
}