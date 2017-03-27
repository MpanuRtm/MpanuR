import javax.swing.JOptionPane;
public class EnumSwitchCase {

		public enum MonthType {January, Feburary, March, April, May, June, July, August, September, October, November, December}
		 public static void main(String[] args) { 
		   MonthType[] choices = { MonthType.January, MonthType.Feburary, MonthType.March, MonthType.April, MonthType.May,
		   MonthType.June, MonthType.July, MonthType.August, MonthType.September, MonthType.October, MonthType.November, MonthType.December }; 
		   MonthType input = (MonthType) JOptionPane.showInputDialog(null,"Select a month.", "Month Type", 
                   JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
		   
		   
		            while (input!=null) { 
		            	 
		            	 switch (input) {
		            	 case January:
		            		 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
		            		 break;
		            	 case Feburary:
		            		 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
		            		 break;
		            	 case March:
		            		 JOptionPane.showMessageDialog(null, "Happy Spring days!");
		            		 break;
		            	 case April:
		            		 JOptionPane.showMessageDialog(null, "Happy Spring days!");
		            		 break;
		            	 case May:
		            		 JOptionPane.showMessageDialog(null, "Happy Spring days!");
		            		 break;
		            	 case June:
		            		 JOptionPane.showMessageDialog(null, "It’s a summer time.");
		            		 break;
		            	 case July:
		            		 JOptionPane.showMessageDialog(null, "It’s a summer time.");
		            		 break;
		            	 case August:
		            		 JOptionPane.showMessageDialog(null, "It’s a summer time.");
		            		 break;
		            	 case September:
		            		 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		            		 break;
		            	 case October:
		            		 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		            		 break;
		            	 case November:
		            		 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		            		 break;
		            	 case December:
		            		 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
		            		 break;
		            			
		            	 }
		            	  input = (MonthType) JOptionPane.showInputDialog(null,"Select a month.", "Month Type", 
                                 JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
		            	 
	}

}
}

