import javax.swing.*;//I GIVE UP. The book instructions tied up my preferred logic.

public class GadgetOrderTaker{
	public static void main(String[]args){
		Order[]order=new Order[4];
		String entry, name, address;
		int[][]productNum={{-1,-1,-1,-1},{101,124,256,512}};
		int[]quantity={-1,-1,-1,-1};
		int orderNum;
		boolean done=false;
		boolean valid=false;
		int x, y, z;
		
		try{
			for(y=0; y<order.length; y++){
				productNum[0][0]=-1;
				productNum[0][1]=-1;
				productNum[0][2]=-1;
				productNum[0][3]=-1;
				
				name=JOptionPane.showInputDialog(null,"Please enter your name.");
				address=JOptionPane.showInputDialog(null,"Enter a street address for"+
					" your order to be shipped to.");
				orderNum=(int)(Math.random()*900)+101;
				
				for(x=0; x<y; x++)
					if(orderNum==order[x].getOrderNumber()){
						orderNum=(int)(Math.random()*900)+101;
						x=0;
					}
				
				JOptionPane.showMessageDialog(null,"Your order number is "+orderNum+
					".\nPlease record this number for future reference.");
				
				entry=JOptionPane.showInputDialog(null,"Please enter an item number"+
						" to order.\nEnter 999 to finalize your order so far.");
				if(entry.equals("999"))
					done=true;
				
				for(x=0; !done; x++){
					done=false;
					valid=false;
					
					System.out.println(entry);
					
					if(x>4)
						throw(new OrderException(1));
					
					productNum[0][x]=Integer.parseInt(entry);
					for(z=0; z<productNum[1].length; z++)
						if(productNum[0][x]==productNum[1][z])
							valid=true;
					
					if(productNum[0][x]==999)
						done=true;
					
					if(!done){
						if(!valid)
							throw(new OrderException(3));
						
						entry=JOptionPane.showInputDialog(null,"Please enter a quantity "
							+"for the items you want to order.");
						quantity[x]=Integer.parseInt(entry);
						if(quantity[x]>100)
							throw(new OrderException(2));
						
						entry=JOptionPane.showInputDialog(null,"Please enter an item "+
							"number to order.\nEnter 999 to finalize your order so far.");
					}
				}
				
				order[y]=new Order(orderNum, name, address, productNum[0][0],
					productNum[0][1], productNum[0][2], productNum[0][3], quantity[0],
					quantity[1], quantity[2], quantity[3]);
			}
			
			for(x=0; x<order.length; x++){
				entry="";
				for(z=0; z<order[x].itemsOrdered.length; z++)
					entry+="\n"+order[x].getItemDescription(z)+"(s), item ID "+
						order[x].getItemOrdered(z)+", unit price $"+
						order[x].getItemPrice(z);
				JOptionPane.showMessageDialog(null,"Order "+(x+1)+" has order ID "+
					order[x].getOrderNumber()+", belonging to "+
					order[x].getCustomerName()+" at "+order[x].getAddress()+", costs $"+
					order[x].getTotalPrice()+" in total, plus a shipping and handling "+
					"charge of $"+order[x].getShippingAndHandling()+". The products"+
					" ordered are as follows:"+entry);
			}
		}
		catch(OrderException error){
			JOptionPane.showMessageDialog(null,error.getMessage());
		}
		catch(Exception error){
			JOptionPane.showMessageDialog(null,"That's not a numeric entry!");
		}
	}
}