package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		int firstValue[]= {3,2,11,4,6,7};
		int secondValue[]= {1,2,8,4,9,7};
		for(int i=0;i<firstValue.length;i++)
		{
			list1.add(firstValue[i]);
		}
		for(int i=0;i<secondValue.length;i++)
		{
			list2.add(secondValue[i]);	
		}
		
		System.out.println("List1:"+list1+"\n"+"List2:"+list2);
		System.out.println("The common values in the given two List are:");
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
				{
					System.out.println(list1.get(i));
				}
			}
		}
	}

}
