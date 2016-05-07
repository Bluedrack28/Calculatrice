/*
 * @author Orelian Kohler
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Programm {
	
	public static int choise = 0;
	public static int number = 0;
	public static int number2 = 0;
	public static int number3 = 0;
	public static int result = 0;
	public static boolean refaire = false;
	public static boolean resetNumber2 = true;
	public static JLabel numberClark = null;
	
	public static void main(String[] args) throws Exception {
		Font font1 = new Font("Courier 10 Pitch", 1, 50);
		Font font2 = new Font("Courier 10 Pitch", 1, 11);
		Font fontButton = new Font("Courier 10 Pitch", 1, 40);
		Dimension d = new Dimension(60,60);
		Dimension d2 = new Dimension(300,60);

		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonReset = new JButton("E");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonMoin = new JButton("-");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPlus = new JButton("+");
		JButton buttonDiv = new JButton("/");
		JButton button0 = new JButton("0");
		JButton buttonFois = new JButton("*");
		JButton buttonEgal= new JButton("=");
		JFrame frame = new JFrame("Calculatrice");

		button1.setFont(fontButton);
		button2.setFont(fontButton);
		button3.setFont(fontButton);
		button4.setFont(fontButton);
		button5.setFont(fontButton);
		button6.setFont(fontButton);
		button7.setFont(fontButton);
		button8.setFont(fontButton);
		button9.setFont(fontButton);
		button0.setFont(fontButton);
		buttonEgal.setFont(fontButton);
		buttonReset.setFont(fontButton);
		buttonDiv.setFont(fontButton);
		buttonFois.setFont(fontButton);
		buttonPlus.setFont(fontButton);
		buttonMoin.setFont(fontButton);
		button1.setFont(fontButton);
		button1.setFont(fontButton);
		button1.setFont(fontButton);
		button1.setFont(fontButton);
		button1.setFont(fontButton);
		
		button1.setPreferredSize(d);
		button1.setMaximumSize(d);
		button2.setPreferredSize(d);
		button2.setMaximumSize(d);
		button3.setPreferredSize(d);
		button3.setMaximumSize(d);
		button4.setPreferredSize(d);
		button4.setMaximumSize(d);
		button4.setPreferredSize(d);
		button5.setMaximumSize(d);
		button5.setPreferredSize(d);
		button6.setMaximumSize(d);
		button6.setPreferredSize(d);
		button7.setMaximumSize(d);
		button7.setPreferredSize(d);
		button8.setMaximumSize(d);
		button8.setPreferredSize(d);
		button9.setMaximumSize(d);
		button9.setPreferredSize(d);
		button0.setMaximumSize(d);
		button0.setPreferredSize(d);
		buttonEgal.setMaximumSize(d);
		buttonEgal.setPreferredSize(d);
		buttonPlus.setMaximumSize(d);
		buttonPlus.setPreferredSize(d);
		buttonMoin.setMaximumSize(d);
		buttonMoin.setPreferredSize(d);
		buttonDiv.setMaximumSize(d);
		buttonDiv.setPreferredSize(d);
		buttonFois.setMaximumSize(d);
		buttonFois.setPreferredSize(d);
		buttonReset.setMaximumSize(d);
		buttonReset.setPreferredSize(d);
		button1.setMaximumSize(d);

		Programm.numberClark = new JLabel();
		
		JLabel autor = new JLabel();
		autor.setText("par Orélian Kohler");
		autor.setFont(font2);
				
		Programm.numberClark.setPreferredSize(d2);
		Programm.numberClark.setMaximumSize(d2);
		Programm.numberClark.setFont(font1);

		Box box1 = new Box(BoxLayout.Y_AXIS);
		Box box2 = new Box(BoxLayout.X_AXIS);
		Box box3 = new Box(BoxLayout.X_AXIS);
		Box box4 = new Box(BoxLayout.X_AXIS);
		Box box5 = new Box(BoxLayout.X_AXIS);
		Box box6 = new Box(BoxLayout.X_AXIS);
		box2.add(numberClark);
		box3.add(button1);
		box3.add(button2);
		box3.add(button3);
		box3.add(buttonReset);
		box4.add(button4);
		box4.add(button5);
		box4.add(button6);
		box4.add(buttonMoin);
		box5.add(button7);
		box5.add(button8);
		box5.add(button9);
		box5.add(buttonPlus);
		box6.add(buttonDiv);
		box6.add(button0);
		box6.add(buttonFois);
		box6.add(buttonEgal);
		box1.add(box2);
		box1.add(box3);
		box1.add(box4);
		box1.add(box5);
		box1.add(box6);
		box1.add(autor);

		numberClark.setText(Integer.toString(number));
		
		frame.add(box1);
		frame.setSize(320,320);

		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 1;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=1;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
			
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 2;
					numberClark.setText(Integer.toString(number));

				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=2;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
			
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 3;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=3;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		buttonReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				number = 0;
				choise = 0;
				number2 = 0;
				result = 0;
				numberClark.setText(Integer.toString(number));
				refaire = false;
			}
		});
		
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 4;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=4;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 5;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=5;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		button6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 6;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=6;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		buttonMoin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choise = 2;
				refaire = false;
				
			}
		});
		
		button7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 7;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=7;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		button8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 8;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=8;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});		
		button9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					number += 9;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					number2 +=9;
					numberClark.setText(Integer.toString(number2));
				}
				refaire = false;
				resetNumber2 = false;
			}
		});
		
		buttonPlus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choise = 1;
				refaire = false;
			}
		});
		
		buttonDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choise = 3;
				refaire = false;
			}
		});
		
		button0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (choise == 0){
					
					number *=  10;
					numberClark.setText(Integer.toString(number));
				}
				else {
					if (resetNumber2 == true){
						number2 = 0;
					}
					number2 *= 10;
					numberClark.setText(Integer.toString(number2));
				}
				resetNumber2 = false;
				refaire = false;
			}
		});
		
		buttonFois.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choise = 4;
				refaire = false;
			}
		});
		
		buttonEgal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (refaire == false){

					if (choise == 1){
					
					 result = number + number2;
					}
				
					if (choise == 2){
				
						result = number - number2;		
					}	
				
					if (choise == 3){
						
						result = number / number2;
					}	
				
					if (choise == 4){
						
						result = number * number2;
						refaire = true;

					}
				}
				
				else {
					if (choise == 1){
					
					 result = result + number2;
					}
					if (choise == 2){
				
						result = result - number2;		
					}	
					if (choise == 3){
						
						result = result / number2;
					}	
					if (choise == 4){
						
						result = result * number2;
					}

				}

				number = result;
				numberClark.setText(Integer.toString(result));
				resetNumber2 = true;
			}
		});
	}

}