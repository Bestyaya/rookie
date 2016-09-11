package JavaYEARTWO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.border.*;

public class ArrayListGUI extends JFrame{
	private JTextField jtfEnterANumber = new JTextField(30);	
	private JTextArea jtaArrayList = new JTextArea(3,80);
	private JButton jbtSort =new JButton("SORT");
	private JButton jbtShuffle = new JButton("SHUFFLE");
	private JButton jbtReverse = new JButton("REVERSE");
	private ArrayList<Double> list = new ArrayList<Double>();
	
	public ArrayListGUI(){
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p1.add(new JLabel("Enter a number:"));
		p1.add(jtfEnterANumber);
		jtfEnterANumber.addKeyListener(new  KeyEnterListener());
			
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jtaArrayList);
		jtaArrayList.setEditable(false);
		
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p3.add(jbtSort);
		p3.add(jbtShuffle);
		p3.add(jbtReverse);
		jbtSort.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Collections.sort(list);
				jtaArrayList.setText("");
				for(Object element:list){
					jtaArrayList.append(element.toString() + " ");
				}
			}
		});
		
		jbtShuffle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Collections.shuffle(list);
				jtaArrayList.setText("");
				for(Object element:list){
					jtaArrayList.append(element.toString() + " ");
				}
			}
		});
		
		jbtReverse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Collections.reverse(list);
				jtaArrayList.setText("");
				for(Object element:list){
					jtaArrayList.append(element.toString() + " ");
				}
			}
		});
		
		setLayout(new GridLayout(3,1,5,5));
		add(p1);
		add(p2);
		add(p3);
	}
	
	public static void main(String[] args){
		JFrame frame = new ArrayListGUI();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Test");
		frame.setVisible(true);	
		
	}
	
	private class KeyEnterListener implements KeyListener{
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == jtfEnterANumber){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					jtaArrayList.setText("");
					list.add(Double.parseDouble(jtfEnterANumber.getText()));
					Iterator<Double> iterator = list.iterator();
					while (iterator.hasNext()){
						jtaArrayList.append((iterator.next().toString()) + " ");
					}
					jtfEnterANumber.setText("");
				}
			}
			
		}

		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}
