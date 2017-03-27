// name: ralph mpanu
// date: 3/13/17
// purpose: write java program that caculates are and perimeter of the rectangle
import javax.swing.JOptionPane;
public class Rectangle {

	public static void main(String[] args) {
		String width;
		String height;
		int area;
		int widthInput;
		int heightInput;
		int perimeter;
		
		width =  JOptionPane.showInputDialog ( "Enter the width of the rectangle" );
		height = JOptionPane.showInputDialog ( "Enter the height of the rectangle" ); 
		 
		widthInput = Integer.parseInt (width);
		heightInput = Integer.parseInt (height);
		
		area = (widthInput* heightInput);
		perimeter =widthInput*2 + heightInput*2;
		
		JOptionPane.showMessageDialog(null, " The area of the triangle is " + area + " The perimeter of the triangle is " + perimeter );

		
	
		

	}

}

