package com.aircode.modules.system.service;

import com.aircode.modules.system.service.dto.DictDetailDTO;
import com.aircode.modules.system.service.dto.DictDetailQueryCriteria;
import com.aircode.modules.system.domain.DictDetail;
import org.springframework.data.domain.Pageable;
import java.util.Map;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
public interface DictDetailService {

    DictDetailDTO findById(Long id);

    DictDetailDTO create(DictDetail resources);

    void update(DictDetail resources);

    void delete(Long id);

    Map queryAll(DictDetailQueryCriteria criteria, Pageable pageable);
}