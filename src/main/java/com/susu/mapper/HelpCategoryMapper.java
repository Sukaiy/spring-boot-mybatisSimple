package com.susu.mapper;

import com.susu.entity.HelpCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelpCategoryMapper {
    List<HelpCategory> selectList();
}
