package core.dao;

import java.util.List;

import org.hibernate.Session;

import static core.util.HibernateUtil.getSessionFactory;

public interface CoreDao<P, I> {
	int insert(P entity);

	int deleteById(I id);

	int update(P entity);

	P selectById(I id);

	List<P> selectAll();
	
	//hibernate的session
	default Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
}
