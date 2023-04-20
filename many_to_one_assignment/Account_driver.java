package many_to_one_assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Account_driver
{
	public static void main(String[] args)
	{
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one")	;
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   Account a =new Account();
	   a.setId(1);
	   a.setName("Harshika");
	   a.setAccno(254788666);
	   
	   Transaction t=new Transaction();
	   t.setId(1);
	   t.setTname("watch");
	   t.setPrice(2000);
	   t.setAcc(a);
	   
	   Transaction t1=new Transaction();
	   t1.setId(2);
	   t1.setTname("bottle");
	   t1.setPrice(500);
	   t1.setAcc(a);
	   
	   Transaction t2= new Transaction();
	   t2.setId(3);
	   t2.setTname("mobile");
	   t2.setPrice(20000);
	   t2.setAcc(a);
	   
	   List <Transaction> transac=new ArrayList<Transaction>();
	   transac.add(t);
	   transac.add(t1);
	   transac.add(t2);
	   
	    a.setTransac(transac);
	   
	   et.begin();
	   em.persist(a);
	   em.persist(t);
	   em.persist(t1);
	   em.persist(t2);
	   et.commit();
	   
	   System.out.println("=================data saved================");
	   
	}

}
