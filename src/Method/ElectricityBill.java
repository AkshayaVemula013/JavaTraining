//If units<=200 then cost is 10 rs per unit, but after 200 units cost will be 15 rs per unit.
//Calculate bill using conditional operator

package Method;

public class ElectricityBill {
	public static long CalculateBill(int units)
	{
		int cost=0;
		cost=units<=200?units*10:200*10;            //if units=300 then for 200 units it is 2000
		units=units-200;                            //units updated without calculated 200 units
		cost+=units>0?units*15:units*0;             //to avoid -ve values multiplying by 15(when <200) used units*0
		return cost;                                //now remaining 100 units = 100*15 added to existing cost
	}
	public static void main(String[] args)
	{
		long bill1=CalculateBill(100);
		long bill2=CalculateBill(300);
		
		System.out.println(bill1);					//100*10
		System.out.println(bill2);					//(200*10)+(100*15)
	}

}
