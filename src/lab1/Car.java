package lab1;

public class Car {
	public int engineCapcity;

	public int getengineCapcity() {
		return engineCapcity;
	}

	public int getEngineCapcity(int extracapacity) {
		this.engineCapcity=this.engineCapcity + extracapacity ;
		return  engineCapcity;
	}
}
