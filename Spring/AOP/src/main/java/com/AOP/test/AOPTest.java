package com.AOP.test;

import com.AOP.beans.BookDaoImpl;
import com.AOP.beans.StudentDaoImpl;
import com.AOP.service.AddBook;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        BookDaoImpl bookDao = (BookDaoImpl) context.getBean("bookDao");
        StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");

        bookDao.delete();
//        studentDao.delete(12);

//        AddBook addBook = (AddBook) context.getBean("addBook");
//        addBook.addBook();


    }

}
