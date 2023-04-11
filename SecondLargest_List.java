package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value=new ArrayList<Integer>();
		int[] data = {3,2,11,4,6,7};
		for(int i=0;i<data.length;i++)
		{
			value.add(data[i]);
		}
		int listLength=value.size();
		System.out.println("The Given List:\n"+value);
		Collections.sort(value);
		System.out.println("The second heighest number in the List is:"+value.get(listLength-2));
	}

}
