package com.mpt.repository;

import com.mpt.model.ProcedureCost;
import com.mpt.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureCostRepository extends JpaRepository<ProcedureCost, Integer> {
}
