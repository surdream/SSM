package com.demo02.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Detail {
    private int detailId;
    private String userAddr;
    private String userTel;
    private String userDesc;
    private int uid;

}
