package com.basis.controlers;

import com.basis.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController  {

    @RequestMapping("/add")
    public ModelAndView add(String bookName,String bookAuthor,double bookPrice){

        ModelAndView modelAndView = new ModelAndView("../tips.jsp");
        modelAndView.addObject("bookName",bookName);
        modelAndView.addObject("bookAuthor",bookAuthor);
        modelAndView.addObject("bookPrice",bookPrice);

        return modelAndView;
    }

    @RequestMapping("/list")
    public void list(@RequestHeader("key") int value){
        System.out.println(value);
    }

    @RequestMapping("/body")
    @ResponseBody
    public List<Book> body(@RequestBody Book book) {
        System.out.println(book);

        List<Book> books = new ArrayList<>();
        books.add(new Book(10001,"java","zzz",36.5));
        books.add(new Book(10002,"python","张三",36.88));

        return books;
    }

}
