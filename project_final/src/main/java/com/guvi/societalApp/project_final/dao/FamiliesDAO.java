package com.guvi.societalApp.project_final.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guvi.societalApp.project_final.entity.Families;

@Repository
public interface FamiliesDAO extends JpaRepository<Families, Integer> {
//	public List<Families> findAll();

//	public Families save(final Families f);
}
