class Employee{
	static int count=0;
	private int empid;
	private String empname;
	private String empage;
	private String empdescription;
	private String empqualification;
	
	public Employee(String empname,String empage,String empdescription,String empqualification){
		empid=++count;
		this.empname=empname;
		this.empage=empage;
		this.empdescription=empdescription;
		this.empqualification=empqualification;
	}
	public void setempid(int empid)
	{
		this.empid=empid;
	}
	public void setempname(String empname)
	{
		this.empname=empname;
	}
	public void setempage(String empage)
	{
		this.empage=empage;
	}
	public void setempdescription(String empdescription)
	{
		this.empdescription=empdescription;
	}
	public void setempqualification(String empqualification)
	{
		this.empqualification=empqualification;
	}
	public int getempid(){
		return empid;
	}
	public String getempname(){
		return empname;
	}
	public String getempage(){
		return empage;
	}
	public String getempdescription(){
		return empdescription;
	}
	public String getqualification(){
		return empqualification;
	}
	@Override
	public String toString(){
	return "EmpId:"+empid+"\nEmpName:"+empname+"\nEmpAge:"+empage+"\nEmpDescription:"+empdescription+"\nEmpQulaification:"+empqualification;
	}
		
	
}