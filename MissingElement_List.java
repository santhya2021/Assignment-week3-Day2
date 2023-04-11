package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value=new ArrayList<Integer>();
		int[] data= {1,2,3,4,7,6,8};
		int j=1;
		for(int i=0;i<data.length;i++)
		{
			value.add(data[i]);
		}
		System.out.println("The List:\n"+value);
		Collections.sort(value);
		for(int i=0;i<value.size();i++)
		{
			if(value.get(i)!=j)
			{
				System.out.println("The missing Number is:"+j);
				break;
			}
			else
				j++;
		}

	}

}
