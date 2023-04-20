package many_to_one_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update_acc 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Account ac=em.find(Account.class, 1);
		if(ac!=null)
		{
			ac.setAccno(254786622);
			ac.setName("abc");
		}
		else
		{
			System.out.println("account dosenot exist");
		}

		et.begin();
		em.merge(ac);
		et.commit();

		System.out.println("data updated successfully");




	}
}
