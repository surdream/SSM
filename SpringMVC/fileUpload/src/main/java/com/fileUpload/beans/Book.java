package com.fileUpload.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String bookName;
    private String bookAuthor;
    private double bookPrice;
    private String bookImage;
}
