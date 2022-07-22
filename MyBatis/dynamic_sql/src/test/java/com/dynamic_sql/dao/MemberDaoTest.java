package com.dynamic_sql.dao;

import com.dynamic_sql.dto.Member;
import com.dynamic_sql.dto.MemberSearchCondition;
import com.dynamic_sql.utils.MyBatisUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberDaoTest {

    @Test
    void searchMember() {
        // 给定HashMap
        // 设置map的key应该和动态SQL保持一致
        HashMap<String, Object> params = new HashMap<>();
        params.put("gender","女");
        params.put("minAge",18);
        params.put("maxAge",23);
//        params.put("city","武汉");

        MemberDao memberDao = MyBatisUtils.getMapper(MemberDao.class);
        List<Member> members = memberDao.searchMember(params);

        for (Member member:
             members) {
            System.out.println(member);
        }


        // ########################################################### //

        // 给定自定义实体类
        // 无需考虑属性名
//        MemberSearchCondition param = new MemberSearchCondition();
//        param.setGender("女");
//        param.setMinAge(18);
//        param.setMaxAge(23);
//        param.setCity("北京");
//        List<Member> memberList = memberDao.searchMember(param);


    }

    @Test
    void searchMemberByCity() {
        List<String> cities = new ArrayList<>();
        cities.add("武汉");
//        cities.add("北京");
//        cities.add("上海");
        MemberDao memberDao = MyBatisUtils.getMapper(MemberDao.class);
        List<Member> members = memberDao.searchMemberByCity(cities);
        for (Member member :members) {
            System.out.println(member);
        }
    }

    @Test
    void searchMemberByNick() {
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("nike","梦");
        MemberDao memberDao = MyBatisUtils.getMapper(MemberDao.class);
        String Nick = "星";
        List<Member> members = memberDao.searchMemberByNick(Nick);

        for (Member member :members) {
            System.out.println(member);
        }
    }
}