//package com.guvi.societalApp.project_final.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
////import org.springframework.jdbc.support.GeneratedKeyHolder;
////import org.springframework.jdbc.support.KeyHolder;
////import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
////import org.springframework.jdbc.core.namedparam.SqlParameterSource;
////import java.sql.Connection;
////import java.sql.PreparedStatement;
////import java.sql.SQLException;
////import java.sql.Statement;
//
//import com.guvi.societalApp.project_final.entity.Families;
//
//@Repository
//public class FamiliesDAOHibernateImpl implements FamiliesDAO {
////	private final String INSERT_SQL = "INSERT INTO FAMILY(owner, email, building , owned) values(:owner,:email,:building,:owned)";
//	private EntityManager entityManager;
//
//	// set up constructor injection
//	@Autowired
//	public FamiliesDAOHibernateImpl(EntityManager theEntityManager) {
//		entityManager = theEntityManager;
//	}
//
//	@Override
//	@Transactional
//	public List<Families> findAll() {
//		// TODO Auto-generated method stub
//		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//
//		// create a query
//		Query<Families> theQuery = currentSession.createQuery("from Families", Families.class);
//
//		// execute the query
//		List<Families> families = theQuery.getResultList();
//		return families;
//	}
//
////	@Override
////	public Families save(final Families f) {
////		KeyHolder holder = new GeneratedKeyHolder();
////		SqlParameterSource parameters = new MapSqlParameterSource().addValue("owner", f.getOwner())
////				.addValue("email", f.getEmail()).addValue("building", f.getBuilding()).addValue("owned", f.getOwned());
////		entityManager.update(INSERT_SQL, parameters, holder);
////	}
//
//}
