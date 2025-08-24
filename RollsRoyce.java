public class RollsRoyce extends Car{
	private String name;
	private String color;
	private double hp;
	private String price;
	private int myr;
	
	RollsRoyce(String name,String color,double hp,String price,int myr){
		this.name=name;
		this.color=color;
		this.hp=hp;
		this.price=price;
		this.myr=myr;

	}
	public void setColor(String color){
		this.color=color;
	}
	public void setHp(double hp){
		this.hp=hp;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public void setMyr(int myr){
		this.myr=myr;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public String getPrice(){
		return price;
	}
	public double getHp(){
		return hp;
	}
	public int getMyr(){
		return myr;
	}

	public void show(){
		System.out.println("***RollsRoyce**");
		System.out.println("\nModel Name:"+name+"\nColor:"+color+"\nHorsepower:"+hp+"\nPrice:"+price+"\nManufacturer Year:"+myr);



			
		}

	


}