package com.susu.service.impl;

import com.susu.entity.HelpCategory;
import com.susu.mapper.HelpCategoryMapper;
import com.susu.service.HelpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpCategoryServiceImpl implements HelpCategoryService {
    @Autowired
    private HelpCategoryMapper helpCategoryMapper;

    @Override
    public List<HelpCategory> selectList() {
        return helpCategoryMapper.selectList();
    }
}
