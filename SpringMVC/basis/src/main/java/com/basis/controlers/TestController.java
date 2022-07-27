package com.basis.controlers;

import com.basis.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/add")
    public String addBook(Book book){
        System.out.println(book);

        return "/tips.jsp";
    }
}
