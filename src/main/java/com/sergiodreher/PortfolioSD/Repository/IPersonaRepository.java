package com.sergiodreher.PortfolioSD.Repository;

import com.sergiodreher.PortfolioSD.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
