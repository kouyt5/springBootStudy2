package com.cd826dong.clouddemo.baihui.service.impl;

import com.cd826dong.clouddemo.baihui.entity.ErShouHouse;
import com.cd826dong.clouddemo.baihui.repository.ErShouRepository;
import com.cd826dong.clouddemo.baihui.service.HouseSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ErShouServiceImpl implements HouseSaleService {
    @Autowired
    private ErShouRepository erShouRepository;
    @Override
    public Page<ErShouHouse> getPage(Pageable pageable) {
        return erShouRepository.findAll(pageable);
    }

    @Override
    public ErShouHouse load(Long id) {
        return erShouRepository.findOne(id);
    }
}
