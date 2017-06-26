import com.course.buildings.Building;
import com.course.buildings.House;
import com.course.buildings.School;

public class CreateBuildings{
	public static void main(String[]args){
		Building storehouse=new Building();
		storehouse.setAcreage(2200);
		storehouse.setStories(7);
		
		System.out.println("The storehouse has "+storehouse.getAcreage()+" square "+
			"feet of property and is "+storehouse.getStories()+" stories high.");
		System.out.println();
		
		House residency=new House();
		residency.setAcreage(1200);
		residency.setStories(2);
		residency.setBedrooms(3);
		residency.setBaths(2);
		
		System.out.println("The residency has "+residency.getAcreage()+" square "+
			"feet of property and is "+residency.getStories()+" stories high.\nIt has "
			+residency.getBedrooms()+" bedrooms and "+residency.getBaths()+" baths.");
		System.out.println();
		
		School hoskins=new School();
		hoskins.setAcreage(9800);
		hoskins.setStories(1);
		hoskins.setClassrooms(48);
		hoskins.setGrade("junior high");
		
		System.out.println("The residency has "+hoskins.getAcreage()+" square "+
			"feet of property and is "+hoskins.getStories()+" story high.\nIt has "
			+hoskins.getClassrooms()+" classrooms and instructs in the "+
			hoskins.getGrade()+" grade levels.");
	}
}