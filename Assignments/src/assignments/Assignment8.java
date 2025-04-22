package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args){

		List<Integer> amount = new ArrayList<Integer>();
		amount.add(50000);
		amount.add(-2000);
		amount.add(3000);
		amount.add(-15000);
		amount.add(-200); 
		amount.add(-300); 
		amount.add(4000);
		amount.add(-3000);

		int creditTrans=0;
		int debitTrans=0; 
		int creditedAmt=0;
		int debitedAmt=0; 


		for(int i=0; i<amount.size(); i++) {
			if(amount.get(i)>0) {
				creditTrans++;
			}
			else if(amount.get(i)<0) {
				debitTrans++;
			}

		}
		System.out.println("-----------------------Totol credit/debit---------------------------------");
		System.out.println("Toatl credit transaction = " + creditTrans);
		System.out.println("Total debit transaction = " + debitTrans);

		System.out.println("------------------------Totol number of Transatation--------------------------------");
		for(int i =0; i<amount.size(); i++) {
			if(amount.get(i)>=0) {
				System.out.println("credit transaction = " + amount.get(i));
			}
			else if(amount.get(i)<0) {
				System.out.println("debit transaction = " + amount.get(i));
			}
				if(amount.get(i)>0) { 
					creditedAmt += amount.get(i);
				}
				else if(amount.get(i)<0) { 
					debitedAmt += amount.get(i); 
					
				}
				
				}
			System.out.println("------------------------Totol Amount Transatation--------------------"); 
					System.out.println("Total Amount credit transaction = " + creditedAmt);
					System.out.println("Total Amount debit transaction = " + debitedAmt);
					System.out.println("----------------------------Totol Suspicious Transatation---------------------------");
					
					for(int j=0; j<amount.size(); j++) {
						if(amount.get(j)>=10000) { 
					System.out.println("Suspicious credit transaction = " + amount.get(j));
				      }
					else if(amount.get(j)<=-10000) {
                   System.out.println("Suspicious debit transaction = " + amount.get(j));
						} 
					}
					
					System.out.println("-----------------------------------------------------------------"); 
					System.out.println("-------------------------Balane totol---------------------------------------"); 
                    System.out.println("Total Balannce = " + (creditedAmt + debitedAmt));
				}
	}

				
			

