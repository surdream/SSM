package com.dynamic_sql.dao;

import com.dynamic_sql.dto.Member;
import com.dynamic_sql.dto.MemberSearchCondition;

import java.util.HashMap;
import java.util.List;

public interface MemberDao {
    // 再多条件查询中，如果查询条件不确定，可以直接使用HashMap作为参数
    // 1.使用HashMap，无需单独定义相关的类，但
    List<Member> searchMember(HashMap<String,Object> param);

    // 2.使用自定义的类封装参数
    List<Member> searchMember(MemberSearchCondition param);

    // 根据城市集合来查询
    List<Member> searchMemberByCity(List<String> cities);

    // 根据昵称模糊查询
//    List<Member> searchMemberByNick(HashMap params);
    List<Member> searchMemberByNick(String nick);
}
