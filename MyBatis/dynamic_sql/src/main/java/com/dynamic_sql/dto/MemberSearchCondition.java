package com.dynamic_sql.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    private String gender;
    private int minAge;
    private int maxAge;
    private String city;
}
