package com.aircode.modules.sheng.repository;

import com.aircode.modules.sheng.domain.GameSheng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author Zeta
* @date 2020-02-28
*/
public interface GameShengRepository extends JpaRepository<GameSheng, Integer>, JpaSpecificationExecutor<GameSheng> {
}