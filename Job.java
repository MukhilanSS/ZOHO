class Job{
	static int count=0;
	private int jobid;
	private String jobname;
	private String jobdescription;
	private String jobrequierements;
	private String joblocation;
	private String jobsalary;
	public Job()
	{
		jobid=++count;
	}
	public Job(String jobname,String jobdescription,String jobrequierements,String jobsalary)
	{
			jobid=++count;
			this.jobname=jobname;
			this.jobdescription=jobdescription;
			this.jobrequierements=jobrequierements;
			this.joblocation=joblocation;
			this.jobsalary=jobsalary;
	}
	public void setjobid(int jobid){
		this.jobid=jobid;
	}
	public int getjobid(){
		return jobid;
	}
	public void setjobname(String jobname){
		this.jobname=jobname;
	}
	public String getjobname(){
		return jobname;
	}
	
	public void setjobdescription(String jobdescription){
		this.jobdescription=jobdescription;
	
	}
	public String getjobdescription(){
		return jobdescription;
	}
	
	
	public void setjobrequierements(String jobrequierements){
		this.jobrequierements=jobrequierements;
	}
	public String getjobrequierements(){
		return jobrequierements;
	}
	
	public void setjoblocation(String joblocation){
		this.joblocation=joblocation;
	}
	public String getjoblocation(){
		return joblocation;
	}
	
	public void setsalary(String jobsalary){
		this.jobsalary=jobsalary;
	}
	public String getjobsalary(){
		return jobsalary;
	}
	@Override
	public String toString(){
        return jobid+"				"+jobname +"                         "+ jobdescription+"                   "+jobrequierements+"                       "+joblocation+"                           "+jobsalary; 
	}
	}