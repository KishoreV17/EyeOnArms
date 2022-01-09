package Utility;

import java.util.Date;

public class Award {
	private String name;
	private Double prizeMoney;
	private Date date;
	
	public Award()
	{
		this.name=" ";
		this.prizeMoney=0.0;
		this.date= new Date();
	}
	public Award(String name, Double prizeMoney, Date date) {
		this.name = name;
		this.prizeMoney = prizeMoney;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(Double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}	
	
}
