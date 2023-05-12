package project_1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Encounter {

	@Id
	private int id;
	private String pname;
	private String date;
	private String last_in;
	private String last_out;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLast_in() {
		return last_in;
	}
	public void setLast_in(String last_in) {
		this.last_in = last_in;
	}
	public String getLast_out() {
		return last_out;
	}
	public void setLast_out(String last_out) {
		this.last_out = last_out;
	}
	
	
	
}
