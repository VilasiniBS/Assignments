package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		//to store employee names
		String[] empNames= new String[5];
		empNames[0] ="Alice johnson";
		empNames[1] ="Bob Smith";
		empNames[2] ="Carol Davis";
		empNames[3] ="David Brown";
		empNames[4] ="Eva Green";

		//Employee data
		Double[] emp1Data = {75000.0, 5.0, 4.2};
		Double[] emp2Data = {68000.0, 3.0, 3.8};
		Double[] emp3Data = {82000.0, 7.0, 4.5};
		Double[] emp4Data = {90000.0, 10.0, 2.2};
		Double[] emp5Data = {60000.0, 2.0, 3.5};

		//Store data of employee
		Map<String, Double[]> employeeData = new HashMap<>();
		employeeData.put(empNames[0], emp1Data);
		employeeData.put(empNames[1], emp2Data);
		employeeData.put(empNames[2], emp3Data);
		employeeData.put(empNames[3], emp4Data);
		employeeData.put(empNames[4], emp5Data);

		Map<String, Double> hikeMap= new HashMap<>();

		for(String employees : empNames) {

			Double[] data = employeeData.get(employees);
			double basicSalary = data[0];
			double exp = data[1];
			double ratings= data[2];
			double varPayPercentage=0;
			int bonus = 0;
			double reward=0;

			if(ratings>=4)
			{
				varPayPercentage=15;
				bonus=1500;
			}else if(ratings>=3 || ratings<=4) {
				varPayPercentage=10;
				bonus=1200;
			}else {
				varPayPercentage=3;
				bonus=300;
			}
			//additional experience for employee more than 5+ years 

			if(exp >=5) {
				reward=5000;
			}

			double hike = (basicSalary * varPayPercentage/100) + bonus + reward;
			double hikePer = (hike/basicSalary)*100;

			hikeMap.put(employees, hikePer);

		}
		System.out.println("hike of employess :" + hikeMap);

	}
}



