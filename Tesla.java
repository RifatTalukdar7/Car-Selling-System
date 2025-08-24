public class Tesla extends Car
{
    private String name;
    private String color;
    private double hp;
    private String price;
    private int myr;
    Tesla(String name,String color,double hp, String price,int myr)
    {
        this.name=name;
        this.color=color;
        this.hp=hp;
        this.price=price;
        this.myr=myr;
    }
    public void setName(String name){this.name=name;}

    public String getName(){return name;}
    
    public void setColor(String color){this.color=color;}

    public void setHp(double hp ){this.hp=hp;}

    public void setPrice(String price){this.price=price;}

    public void SetMyr(int myr){this.myr=myr; }

    public String getColor(){return color;}

    public double getHp(){return hp;}

    public String getPrice(){return price;}

    public int getMyr(){return myr;}


    public void show(){

        System.out.println("***Tesla****\nModel Name:"+name+"\nColor:"+color+"\nHorsepower:"+hp+"\nPrice:"+price+"\nManufacturer Year:"+myr);

            
        }

} 
    


