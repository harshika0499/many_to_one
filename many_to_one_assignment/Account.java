package many_to_one_assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account 
{ 
	@Id
	private int id;
	private String name;
	private int accno;
	@OneToMany
	private List<Transaction> transac;
	public List<Transaction> getTransac() {
		return transac;
	}
	public void setTransac(List<Transaction> transac) {
		this.transac = transac;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
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
	

}
