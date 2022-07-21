package com.demo02.dao;

import com.demo02.dto.Detail;

public interface DetailDao {
    int insertDetail(Detail detail);
    Detail selectDetailByUid(int uid);
}
