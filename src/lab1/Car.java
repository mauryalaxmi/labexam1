package lab1;

public class Car {
	public int engineCapcity;

	public Car(int i) {
		// TODO Auto-generated constructor stub
		this.engineCapcity=i;
	}

	public int getengineCapcity() {
		return engineCapcity;
	}

	public int getEngineCapcity(int extracapacity) {
		this.engineCapcity=this.engineCapcity + extracapacity ;
		this.engineCapcity=this.engineCapcity  * extracapacity ;
		return  engineCapcity;
	}
}
