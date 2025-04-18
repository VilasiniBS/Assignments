package assignments;

import java.util.Hashtable;

public class Assignment6 {

	public static void main(String[] args) {
		//Student names
		String[] stdNames  = new String[3];
		stdNames[0] = "Suresh";
		stdNames[1] = "Mahesh";
		stdNames[2] = "Naresh";

		//Student marks

		int[] stdMarks = new int[3];
		stdMarks[0]= 75;
		stdMarks[1]= 80;
		stdMarks[2] =82;

		System.out.println(stdMarks[0]+=10);
		System.out.println(stdMarks[1]+=10);
		System.out.println(stdMarks[2]+=10);

		//Updated marks
		Hashtable<String, Integer> storeValue =new Hashtable<String, Integer>();
		storeValue.put(stdNames[0], stdMarks[0]);
		storeValue.put(stdNames[1], stdMarks[1]);
		storeValue.put(stdNames[2], stdMarks[2]);

		System.out.println("Updated Marks :" + storeValue );
		System.out.println("avaerage of marks is " + ((stdMarks[0]+stdMarks[1]+stdMarks[2])/3));

	}

}
