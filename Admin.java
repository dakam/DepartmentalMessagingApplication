package prob2;

public class Admin {
	private Department[] depts;
	
	Admin(Department[] depts) {
		this.depts=depts;
	}
	
	public String hourlyCompanyMessage() 
	{
	String res=null;
	String fmsg="";
	for(int i=0;i<depts.length;i++) {
		
		String name = depts[i].getName();
		
		String msg = depts[i].nextMessage();
		if(msg !=null) {
		res=	format(name, msg)+"\n";	
		}
		
		fmsg =fmsg+res;
		
	}
	fmsg=fmsg+"\n";
	return fmsg;
	}
	
	public String format(String name, String msg) {
		return name+" : "+msg;
	}
	

	
}
