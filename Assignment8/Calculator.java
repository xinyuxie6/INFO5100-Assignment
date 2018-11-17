package assignment8;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE
}

public class Calculator extends JFrame  {
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute;
 	private JButton numbers[];
	private Font font;
 	int first;
 	int second;
 	int result;
 	int operation;
 	
 	//number listener
 	class NumberListener implements ActionListener{
 		public void actionPerformed(ActionEvent e) {
 			if(e.getSource() == numbers[0]) {
 				resultTextField.setText(resultTextField.getText().concat("0"));
 			}
 			if(e.getSource() == numbers[1]) {
 				resultTextField.setText(resultTextField.getText().concat("1"));
 			}
 			if(e.getSource() == numbers[2]) {
 				resultTextField.setText(resultTextField.getText().concat("2"));
 			}
 			if(e.getSource() == numbers[3]) {
 				resultTextField.setText(resultTextField.getText().concat("3"));
 			}
 			if(e.getSource() == numbers[4]) {
 				resultTextField.setText(resultTextField.getText().concat("4"));
 			}
 			if(e.getSource() == numbers[5]) {
 				resultTextField.setText(resultTextField.getText().concat("5"));
 			}
 			if(e.getSource() == numbers[6]) {
 				resultTextField.setText(resultTextField.getText().concat("6"));
 			}
 			if(e.getSource() == numbers[7]) {
 				resultTextField.setText(resultTextField.getText().concat("7"));
 			}
 			if(e.getSource() == numbers[8]) {
 				resultTextField.setText(resultTextField.getText().concat("8"));
 			}
 			if(e.getSource() == numbers[9]) {
 				resultTextField.setText(resultTextField.getText().concat("9"));
 			}
 		}	
 		
 	}
 	
 	
 	
 	
 	class OperationListener implements ActionListener {
 		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add) {
				first = Integer.parseInt(resultTextField.getText());
				operation = 1;
				resultTextField.setText("");
			}
			if (e.getSource() == subtract) {
				first = Integer.parseInt(resultTextField.getText());
				operation = 2;
				resultTextField.setText("");
			}
			if (e.getSource() == multiply) {
				first = Integer.parseInt(resultTextField.getText());
				operation = 3;
				resultTextField.setText("");
			}
			if (e.getSource() == divide) {
				first = Integer.parseInt(resultTextField.getText());
				operation = 4;
				resultTextField.setText("");
			}
			if (e.getSource() == compute) {
				second = Integer.parseInt(resultTextField.getText());
				
				switch(operation) {
					case 1: result = first + second;
						break;
					case 2: result = first - second;
						break;
					case 3: result = first * second;
						break;
					case 4: result = first / second;
						break;
					default: result = 0;
				}
				resultTextField.setText(result + "");
			}
 		}
 	}
 	/*class ComputeListener implements ActionListener {
 		@Override
		public void actionPerformed(ActionEvent e) {
			int result = 0;
			if (o == Operation.ADD) {
				result = first + second;
			}
			if (o == Operation.SUBTRACT) {
				result = first - second;
			}
			if (o == Operation.DIVIDE) {
				result = first / second;
			}
			if (o == Operation.MULTIPLY) {
				result = first * second;
			}
 			resultTextField.setText(result + "");
 		}
 	}*/
 	public Calculator() {
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
 	private void addBehaviors() {
		NumberListener nl = new NumberListener();
 		OperationListener ol = new OperationListener();
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);
		compute.addActionListener(ol);
		numbers[0].addActionListener(nl);
		numbers[1].addActionListener(nl);
		numbers[2].addActionListener(nl);
		numbers[3].addActionListener(nl);
		numbers[4].addActionListener(nl);
		numbers[5].addActionListener(nl);
		numbers[6].addActionListener(nl);
		numbers[7].addActionListener(nl);
		numbers[8].addActionListener(nl);
		numbers[9].addActionListener(nl);
 	}
 	
 	private void display() {
		setSize(600, 600);
		setVisible(true);
 	}
 	
 	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);
 		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(compute);
		c.add(panel);
 		panel = new JPanel();
		panel.add(compute);
		c.add(panel);
 		JPanel p = new JPanel();
		p.add(numbers[1]);
		p.add(numbers[2]);
		p.add(numbers[3]);
		p.add(numbers[4]);
 		c.add(p);
 		p = new JPanel();
		p.add(numbers[5]);
		p.add(numbers[6]);
		p.add(numbers[7]);
		p.add(numbers[8]);
 		c.add(p);
 		p = new JPanel();
		p.add(numbers[9]);
		p.add(numbers[0]);
 		c.add(p);
 	}
 	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);
 	}
 	private void createComponents() {
		font = new Font("TimesRoman", Font.PLAIN, 36);
		resultTextField = new JTextField();
		resultTextField.setFont(font);
 		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("/");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
 		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
			numbers[i].setFont(font);
		}
 	}
 	public static void main(String[] args) {
		Calculator c = new Calculator();
 	}
}
