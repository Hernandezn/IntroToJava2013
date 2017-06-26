public class LeapYear2 extends Year2{
	
	public LeapYear2(){
		numOfDays=366;
	}
	
	public int daysElapsed(String mon, int date){
		int day=0;
		String s=mon.charAt(0)+""+mon.charAt(1)+mon.charAt(2)+"";
		String[]months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct",
			"Nov","Dec"};
		int[]days={			 31,	 29,	 31,	 30,	 31,	 30,	 31,	 31,	 30,	 31,
				30,	31};
		int x, y;
		
		for(x=0; x<months.length; x++)
			if(s.equalsIgnoreCase(months[x]))
				for(y=0; y<x; y++)
					day+=days[y];
		
		day+=date-1;
		return day;
	}
}