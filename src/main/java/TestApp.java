import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.util.HibernateUtil;
import web.emp.entity.Dept;
import web.emp.entity.Emp;
import web.member.dao.MemberDao;
import web.member.entity.Member;

public class TestApp {
	public static void main(String[] args) {
		
		//line 23-30 測試spring getbean
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			MemberDao memberDao = applicationContext.getBean(MemberDao.class);
				
			for (Member member : memberDao.selectAll()) {
				System.out.println(member.getNickname());
			}
		}
	}	
		
		
		
		
		
		
		
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		
//		//測試看有沒有抓到資料 line 20-25
////		Dept dept=session.get(Dept.class,30);
////		var emps =dept.getEmps();
////		for(var emp: emps) {
////			System.out.println(emp.getEname());
////		}
////	}
//		
//		//測試一(dept)對多(emp)  line28-33
////		Emp emp=session.get(Emp.class,7369);
////		Dept dept=emp.getDept();
////		System.out.println(dept.getDeptno());
////		System.out.println(dept.getDname());
////	}
//		
//		
//		//測試 雙向1對n
////		Emp emp=session.get(Emp.class,7369);
////		Dept dept=emp.getDept();
////		List<Emp>emps=dept.getEmps();
////		for(Emp emp: emps) {
////		System.out.println(emp.getEname());
////		
////	}
////	}
//		
//		//criteria 敘述範例 line 20-40
//		//select USERNAME, NICKNAME
//		//CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
//		//CriteriaQuery<Member>criteriaQuery=criteriaBuilder.createQuery(Member.class);
//		
//		//from MEMBER
//		//Root<Member> root=criteriaQuery.from(Member.class);
//		
//		//where USERNAME=? and PASSWORD=?
//		//criteriaQuery.where(criteriaBuilder.and(
//		//    criteriaBuilder.equal(root.get("username"), "admin"),
//		//    criteriaBuilder.equal(root.get("password"), "P@ssw0rd")
//		// ));
//		//select USERNAME,NICKNAME
//		//criteriaQuery.multiselect(root.get("username", root.get("nickname"));
//		
//		//order by ID
//		//criteriaQuery.orderBy(criteriaBuilder.asc(root.get("id")));
//	
//		//Member member= session.createQuery(criteriaQuery).uniqueResult();
//		//System.out.println(member.getNickname());
//		
//		TestApp app=new TestApp(); 
//		//app.selectAll().forEach(member -> System.out.println(member.getNickname()));
//		//or
//		for (Member member:app.selectAll()) {
//			System.out.println(member.getNickname());
//		}
//	}
//		Member member=new Member();
//		//test 覆蓋率
////		member.setId(1);
////		member.setPass(true);
////		member.setRoleId(2);
//		
//		
////		member.setUsername("使用者名稱");
////		member.setPassword("密碼");
////		member.setNickname("暱稱");
////		
////		
////		
////		app.insert(member);
////		System.out.println(member.getId());
////		System.out.println(app.deleteById(3));
////		
////	}
//
//	public Integer insert( Member member) {
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		try {
//			Transaction transaction = session.beginTransaction();
//			session.persist(member);
//			transaction.commit();
//			return member.getId();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//
//	}
//	
//	public int deleteById( Integer id) {
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		try {
//			Transaction transaction = session.beginTransaction();
//			Member member =session.get(Member.class,id);
//			session.persist(member);
//			transaction.commit();
//			return 1;
//		} catch (Exception e) {
//			
//			
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return -1;
//		}
//
//	} 
//	
//	                      //資料型別不同用object
//	public int updateById( Member newMember) {
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		try {
//			Transaction transaction = session.beginTransaction();
//			Member oldMember =session.get(Member.class,newMember.getId());
//			final Boolean pass=newMember.getPass();
//			if (pass!=null) {
//				oldMember.setPass(pass);
//			}
//			
//			final Integer roleId= newMember.getRoleId();
//			if(roleId!=null) {
//				oldMember.setRoleId(roleId); 
//			}
//			
//			transaction.commit();
//			return 1;
//		} catch (Exception e) {
//			
//			
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return -1;
//		}
//
//	} 
//	
//	//藉由id select member 回傳型態為member
//	public Member selectById( Integer id) {
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		try {
//			Transaction transaction = session.beginTransaction();
//			Member member =session.get(Member.class,id);
//			
//			
//			transaction.commit();
//			return member;
//		} catch (Exception e) {
//			
//			
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//
//	} 
//	
//	public List<Member> selectAll() {
//		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
//		Session session= sessionFactory.openSession();
//		try {
//			Transaction transaction = session.beginTransaction();
//			Query<Member> query =session.createQuery("SELECT new web.member.pojo.Member(username, nickname) FROM Member", Member.class);
//			List<Member> list=query.getResultList();
//			
//			transaction.commit();
//			return list;
//		} catch (Exception e) { 
//			
//			
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return null;
//		}
//
//	} 
//}
