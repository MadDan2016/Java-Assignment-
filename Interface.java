import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Interface implements ActionListener{

		public Interface(){ // Constructor Method - same name as the class - no return type = used to initialize objects

			JFrame frame = new JFrame("Basic Geometry Calculations");
			frame.setSize(400,400);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);

			JPanel panel = new JPanel();
			panel.setBackground(Color.red);

			frame.add(panel);

			JButton button1 = new JButton("Area of Square");
			panel.add(button1);

			button1.addActionListener(this); // refers to the class object (ActionListener)

			JButton button2 = new JButton("Area of Circle");
			panel.add(button2);

			button2.addActionListener(this);

			JButton button3 = new JButton("Perimeter of Circle");
			panel.add(button3);

			button3.addActionListener(this);
			
			JButton button4 = new JButton("Perimeter of Rectangle");
			panel.add(button4);

			button4.addActionListener(this);
		}

		public static float min (float a, float b){
			float min = Math.min(a,b);
			return min;
		}

		public static float max (float a, float b){
			float max = Math.max(a,b);
			return max;
		}

		public void actionPerformed(ActionEvent e) { // Method for ActionListener which passes an ActionEvent object as its argument

			String btn = e.getActionCommand(); // Returns a string associated to the component(JButton)

			if (btn.equals("Button1")){
				String num1 = JOptionPane.showInputDialog("Please put in the 1st number.");
				String num2 = JOptionPane.showInputDialog("Please put in the 2nd number.");

				float number1 = Float.parseFloat(num1);
				float number2 = Float.parseFloat(num2);

				JOptionPane.showMessageDialog(null, "Min Number is " + String.format("%.0f", min(number1, number2)), "", JOptionPane.INFORMATION_MESSAGE);
			
			}

	
			else if (btn.equals("Perimeter of Circle")){
				String num1 = JOptionPane.showInputDialog("Please put in a radius.");
				

				float number1 = Float.parseFloat(num1);
				

				JOptionPane.showMessageDialog(null, "The Perimeter of The Circle is " + String.format("%.2f",(number1 * 2 * 3.14)), "", JOptionPane.INFORMATION_MESSAGE);
			}
			
			else if (btn.equals("Perimeter of Rectangle")){
				String num1 = JOptionPane.showInputDialog("Please put in one length of your rectangle.");
				String num2 = JOptionPane.showInputDialog("Please put in one width of your rectangle.");
				

				float number1 = Float.parseFloat(num1);
				float number2 = Float.parseFloat(num2);
				

				JOptionPane.showMessageDialog(null, "The Perimeter of The Circle is " + String.format("%.2f",(number1 * 2 + (number2 * 2))), "", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		public static void main(String[] args){

			new Interface(); // Calling the contuctor Method - New invokes the contructor method
		}
	}

