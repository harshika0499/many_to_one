package many_to_one_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch_Acc_details 
{

	public static void main(String[] args)
	{


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em= emf.createEntityManager();

		Transaction Tt=em.find(Transaction.class, 1);
		if(Tt != null) {
		System.out.println(Tt.getId());
		System.out.println(Tt.getTname());
		System.out.println(Tt.getPrice());
		
		Account acc=Tt.getAcc();
		System.out.println(acc.getId());
		System.out.println(acc.getName());
		System.out.println(acc.getAccno());
		}
		else
		{
			System.out.println("No transaction done with this id");
		}
		


	}

}
