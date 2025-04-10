package assignments;

public class EmpGroups {

	//String[] EmpNames = new String[] {"Bharath","Vilasini","XYZ"};
	//int [] EmpID = new int[] {1234, 1235, 1235};
	String[] EmpNames = new String[3];
	int[] EmpID= new int[3];

	public static void main(String[] args) {

		Employes data = new Employes();
		System.out.println("Employee Name1:"+data.Employee1Name + "," + "Employee1 ID :"+ data.Emp1ID);
		System.out.println("Employee Name2:"+data.Employee2Name + "," + "Employee2 ID :"+ data.Emp2ID);
		System.out.println("Employee Name3:"+data.Employee3Name + "," + "Employee3 ID :"+ data.Emp3ID);



	}


}