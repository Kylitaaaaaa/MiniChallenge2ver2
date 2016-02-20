package mc2;

public class Task {
	private String name;
	private String time;
	private Boolean status;
	
	public Task(String name, String time, Boolean status){
		this.name = name;
		this.time = time;
		this.status = status;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public Boolean getStatus()
	{
		return status;
	}
	
	public void setStatus(Boolean status){
		this.status = status;
		
	}
	


}
