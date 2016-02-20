package mc2;
import java.util.*;

import java.util.ArrayList;

public class TaskList {
		private ArrayList<View> allViews;
		private ArrayList<Task> allTasks;
		
	
	public ArrayList getTaskList(){
		return allTasks;
		
	}
		public TaskList getTastkList()
		{
			return this;
		}
		
		public void initTaskList()
		{
			allTasks = new ArrayList<>();
		}
		
		public int getTaskListSize()
		{
			return allTasks.size();
		}
		
		public int getViewSize()
		{
			return allViews.size();
		}

	
	


}
