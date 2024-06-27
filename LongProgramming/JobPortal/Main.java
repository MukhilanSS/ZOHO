import java.util.*;
class Main{
	static List<Job> alljobs=new ArrayList<>();
	static Map<Integer,Employee> allemployee=new HashMap<>();
	static Map<Integer,List<Employee>> application=new HashMap<>();
	public static void main(String args[]){
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do{	
			System.out.println("\n1. Enter the Job Details\n2. Search the jobs\n3.List the job\n4.Enter the Employee Details\n5.Update the Employee profile \n6.Delete the employee profile\n7.Show the particular employee\n8.Enter the jobId to apply\n9.Employee Details for particular job\n10.Exit\n");
		    System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter the Job Title :");
					String jobname=sc.nextLine();
					System.out.println("Enter the job Description :");
					String jobdescription=sc.nextLine();
					System.out.println("Enter the Requirements");
					String jobrequierements=sc.nextLine();
					System.out.println("Enter the Salary");
					String jobsalary=sc.nextLine();
					Job j=new Job(jobname,jobdescription,jobrequierements,jobsalary);
					alljobs.add(j);
					System.out.println("The Job Details has entered sucessfully....!!!");
					break;
				case 2:
					System.out.print("Search a Job:");
					String key=sc.nextLine();
					int flag=1;
					for(Job i:alljobs)
					{
						if(i.getjobname().contains(key) || i.getjobdescription().contains(key)|| i.getjobrequierements().contains(key)||i.getjobsalary().contains(key)){
							System.out.println(i);
							flag=1;
						}
						
					}
					if(flag==0)
							System.out.println("Your Key was not matched to jobs");
						
				    break;
				case 3:

					System.out.println(
                            "----------------------------------------------------------------------------------------------------------------");
                    System.out.println("job_id"+"-----------job_title" +"-------------"+"description"+ "-------------" + "requirements" + "------------------" + "location"
                            + "----------" + "salary");
                    System.out.println(
                            "----------------------------------------------------------------------------------------------------------------");
					for(Job i: alljobs)
					{
						
						System.out.println(i);
					}
					System.out.println("\n-------------------------------------------------------------------------------------------------------------\n");

					break;
				case 4:
					System.out.print("Enter the employee name:");
					String empname=sc.nextLine();
					System.out.print("Enter the employee age:");
					String empage=sc.nextLine();
					System.out.print("Enter the Employee Description:");
					String empdescription=sc.nextLine();
					System.out.print("Enter the Employee Qualification:");
					String empqualification=sc.nextLine();
					Employee emp=new Employee(empname,empage,empdescription,empqualification);
					allemployee.put(emp.getempid(),emp);
					System.out.println("Employee Details where added sucessfully");
					break;
				case 5:
					System.out.println("Enter the Employee Id to update");
					int uid=sc.nextInt();
					sc.nextLine();
					if(allemployee.containsKey(uid))
					{
						System.out.print("Enter the employee name:");
						String empname1=sc.nextLine();
						System.out.print("Enter the employee age:");
						String empage1=sc.nextLine();
						System.out.print("Enter the Employee Description:");
						String empdescription1=sc.nextLine();
						System.out.print("Enter the Employee Qualification:");
						String empqualification1=sc.nextLine();
						Employee updateEmployee=allemployee.get(uid);
						updateEmployee.setempname(empname1);
						updateEmployee.setempage(empage1);
						updateEmployee.setempdescription(empdescription1);
						updateEmployee.setempqualification(empqualification1);
						System.out.println("Employee application has been updated");
					}
					else{
						System.out.println("No Employee found");
					}
					break;
				case 6:
					System.out.println("Enter Employee Id to remove ");
					int did=sc.nextInt();
					if(allemployee.containsKey(did))
					{
						allemployee.remove(did);
						System.out.println("Employee application has been deleted");
					}
					else{
						System.out.println("No Employee found");
					}
					break;
				case 7:
					System.out.println("Enter the Employee id:");
					int id=sc.nextInt();
					if(allemployee.containsKey(id))
					{
						System.out.println(allemployee.get(id));
					}
					else
						System.out.println("No Employee found");

					break;
				
				case 8:
					System.out.println("Enter the Employee Id:");
					int eid2=sc.nextInt();
					System.out.println("Enter the Job Id:");
					int jid=sc.nextInt();
					if(!application.containsKey(jid))
					{
						application.put(jid,new ArrayList<Employee>());
					}
					application.get(jid).add(allemployee.get(eid2));
					System.out.println("Job Applied sucessfully...........!!");
					break;
				case 9:
					System.out.println("Enter the Job Id to show the employee details:");
					int ejid=sc.nextInt();
					if(application.containsKey(ejid))
					{
						List<Employee> applyEmp=application.get(ejid);
						
						for(Employee i:applyEmp)
						{
							System.out.println(i);
						}
					}
					else{
						System.out.println("no employee add for this job:");
					}
					break;
				case 10:
					System.out.println("\nThank you for using my application");
					System.exit(0);
					
				default:
					System.out.println("Choose a valid number from 1 to 5");
					
			}
		}while(choice<=10);
	}
}
	
						
					