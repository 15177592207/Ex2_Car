package tutorial;

import com.opensymphony.xwork2.ActionSupport;

public class CarAction extends ActionSupport {
	private String name;
	private int year;
	private double speed;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	// 创建动作类 P53=================================
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
