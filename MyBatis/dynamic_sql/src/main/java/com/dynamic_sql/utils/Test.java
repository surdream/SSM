package com.dynamic_sql.utils;

import com.dynamic_sql.dao.MemberDao;
import com.dynamic_sql.dto.Member;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        MemberDao memberDao = MyBatisUtils.getMapper(MemberDao.class);
        String Nick = "星";
        List<Member> members = memberDao.searchMemberByNick(Nick);

        for (Member member :members) {
            System.out.println(member);
        }
    }
}
