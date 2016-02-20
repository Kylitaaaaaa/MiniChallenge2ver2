package mc2;
import java.util.*;

import javax.swing.*;

public class SortedView extends View{
	private JButton btnAddTask;
	private JLabel lblTodoList;
	private JLabel lblTasksLeft;
	private JLabel lblTasksFinished;
	private JLabel lblToday;
	private	JCheckBox ckbViewFinishedTasks;
	private JPanel panelTodayTaskList;
	private ArrayList<JPanel> panelTodayTasks;
	private JButton btnClear;
	private JCheckBox ckbSingleTask;
	private JLabel lblThisWeek;
	private JLabel lblSomeday;
	private JPanel panelThisWeekTaskList;
	private ArrayList<JPanel> panelThisWeekTasks;
	private JPanel panelSomedayTaskList;
	private ArrayList<JPanel> panelSomedayTasks;
	private TaskList taskList;
	private ConcreteController controller;
	@Override
	void update(TaskList taskList) {
		// TODO Auto-generated method stub
		
	}

}
