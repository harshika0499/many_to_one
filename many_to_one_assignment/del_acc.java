package many_to_one_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class del_acc 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();


		Account ac=em.find(Account.class,2);
		if(ac!=null)
		{
			et.begin();
			em.remove(ac);
			et.commit();
		}
		else
		{
			System.out.println("invalid id");   
		}
	}


}
