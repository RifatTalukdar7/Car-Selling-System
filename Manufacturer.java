import java.util.Scanner;
public class Manufacturer{
	Scanner sx=new Scanner(System.in);

      public void models(){

		System.out.println("Please select a model");

		System.out.println("1.Rolls Royce\n2.BMW\n3.Nissan\n4.Hyundai\n5.Tesla\n6.Ford\n7.Corolla\n8.Lamborghini");
		
		int b=sx.nextInt();

		if(b==1){
			System.out.println("Model Number:1");
			RollsRoyce r1=new RollsRoyce("Boat Tail","Gold",563,"$28 million",2021);
			r1.show();
			System.out.println("Model Number:2");
			RollsRoyce r2=new RollsRoyce("Spectre","Red",610,"$250,000",2019);
			r2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+r1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+r2.getName());}
			   

				

		}
		if(b==2){
			System.out.println("Model Number:1");
			Bmw b1=new Bmw("Boat Tail","Gold",563,"$28 million",2021);
			b1.show();
			System.out.println("");
			System.out.println("Model Number:2");
			Bmw b2=new Bmw("Spectre","Red",610,"$250,000",2019);
			b2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+b1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+b2.getName());}
							    

				
		}
		if(b==3){
			System.out.println("Model Number:1");
			Nissan n1=new Nissan("Murano","Silver",499,"$33,600",2012);
			n1.show();
			System.out.println("");
			System.out.println("Model Number:2");
            Nissan n2=new Nissan("Kicks","Silver",599,"$35,500",2014);
			n2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+n1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+n2.getName());}
							    

				

		}
		if(b==4){
			System.out.println("Model Number:1");
			Hyundai h1=new Hyundai("Murano","Silver",499,"$33,600",2012);
			h1.show();
			System.out.println("");
			System.out.println("Model Number:2");
            Hyundai h2=new Hyundai("Kicks","Silver",599,"$35,500",2014);
			h2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+h1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+h2.getName());}
							    

				
		}
		if(b==5){
			System.out.println("Model Number:1");
			Tesla t1=new Tesla("Model X","Black",670,"$120,99",2016);
			t1.show();
			System.out.println("");
			System.out.println("Model Number:2");
			Tesla t2=new Tesla("Model 3","White",669,"$150,00",2019);
			t2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+t1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+t2.getName());}
							    

				

		}
		if(b==6){
			System.out.println("Model Number:1");
			Ford f1=new Ford("Model X","Black",670,"$120,99",2016);
			f1.show();
			System.out.println("");
			System.out.println("Model Number:2");
			Ford f2=new Ford("Model 3","White",669,"$150,00",2019);
			f2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+f1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+f2.getName());}
							    

				

		}
		if(b==7){
			System.out.println("Model Number:1");
			Corolla c1=new Corolla("AVENTADOR SVJ","BLue",740,"$501,953",2011);
			c1.show();
			System.out.println("");
			System.out.println("Model Number:2");
			Corolla c2=new Corolla("Urus","Yello",740,"$501,953",2016);
			c2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
				if(x==1){System.out.println("Congratulations\nYou have Bought "+c1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+c2.getName());}
							  

				

		}
		if(b==8){
			System.out.println("Model Number:1");
			Lamborghini l1=new Lamborghini("AVENTADOR SVJ","BLue",740,"$501,953",2011);
			l1.show();
			System.out.println("");
			System.out.println("Model Number:2");
			Lamborghini l2=new Lamborghini("Urus","Yello",740,"$501,953",2016);
			l2.show();
			System.out.println("Choose Model Number to buy:\nEnter any other key to go back");
				int x=sx.nextInt();
			if(x==1){System.out.println("Congratulations\nYou have Bought "+l1.getName());}
				if(x==2){System.out.println("Congratulations\nYou have Bought "+l2.getName());}
							 

				

		}
	}}
       