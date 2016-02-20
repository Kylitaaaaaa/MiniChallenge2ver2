package mc2;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListView extends View{
	private JLabel lblTodoList;
	private int tasksLeft;
	private int tasksFinished;
	private JLabel lblTasksLeft;
	private JLabel lblTasksFinished;
	private JCheckBox ckbViewFinishedTasks;
	
	
	
	public ListView(String name){
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle(name);
		this.setBounds(50, 30, 500, 700);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	void update(TaskList taskList) {
		// TODO Auto-generated method stub
		
	}
   
}