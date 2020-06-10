package edu.cc.examples.springdata.dao;

import edu.cc.examples.springdata.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolDao extends JpaRepository<Rol, Long>{
}
