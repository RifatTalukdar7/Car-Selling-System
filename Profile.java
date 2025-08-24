public class Profile
{
	private String FirstName;
	private String LastName;
	private String DOB;
	private String Gender;
	

	Profile(String FirstName,String LastName,String DOB,String Gender,)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DOB=DOB;
		this.Gender=Gender;
		
	}
	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;
	}
	public void setDOB(String DOB){
		this.DOB=DOB;
	}
	public void setGender(String Gender){
		this.Gender=Gender;
	}
	
	public String getFirstName(){
		return FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public String getDOB(){
		return DOB;
	}
	public String getGender(){
		return Gender;
	}
	
}