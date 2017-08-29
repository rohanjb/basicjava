
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1 = new car();
		car1.name = "Reaper";
        car1.company = "Chevrolet";
        car1.model = "Corvette";
        car1.type = "sports";
        car1.color = "red";
        car1.speed = 207;
        car1.price = 80000;
        
        car car2 = new car();
        car2.name = "Bob";
        car2.company = "Toyota";
        car2.model = "Sonoma";
        car2.type = "truck";
        car2.color = "white";
        car2.speed = 190;
        car2.price = 30000;
        
        System.out.println(car1.company + " model is:" + car1.model);
        System.out.println(car2.company + " model is:" + car2.model);
	}

}
