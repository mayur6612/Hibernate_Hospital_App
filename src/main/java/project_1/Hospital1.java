package project_1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital1 {

	@Id
	private int id;
	private String name;
	private String ceo;
	
	@OneToMany
	private List<Branches> branches;
	
	
	public List<Branches> getBranches() {
		return branches;
	}
	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	
}
