package many_to_one_assignment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction
{
	@Id
   private int id;
   private String Tname;
   private double price;
   @ManyToOne
    private Account acc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTname() {
	return Tname;
}
public void setTname(String tname) {
	Tname = tname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Account getAcc() {
	return acc;
}
public void setAcc(Account acc) {
	this.acc = acc;
}
   

}
