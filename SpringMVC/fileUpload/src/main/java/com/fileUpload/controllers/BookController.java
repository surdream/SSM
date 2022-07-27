package com.fileUpload.controllers;

import com.fileUpload.beans.Book;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/add")
    public String addBook(Book book, MultipartFile img, HttpServletRequest request, Model model) throws IOException {

        // 1.截取文件的后缀名
        String originalFilename = img.getOriginalFilename();
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName = System.currentTimeMillis()+ext;
        System.out.println(fileName);

        // 2.获取img目录在服务器的路径
        ServletContext context = request.getServletContext();
        String dir = context.getRealPath("images");
        String savePath = dir + "\\" +fileName;
        System.out.println(savePath);

        // 3.保存文件
        img.transferTo(new File(savePath));

        // 4.访问路径设置给book
        book.setBookImage("images/"+fileName);

        System.out.println(book);
        model.addAttribute("book",book);
        return "/tips.jsp";
    }


    @RequestMapping("/list")
    @ResponseBody
    public String[] listImgs(HttpServletRequest request){
        // 1.从images目录下获取所有的图片信息
        String dir = request.getServletContext().getRealPath("images");
        File imgDir = new File(dir);
        String[] fileNames = imgDir.list();


        return fileNames;
    }

    @RequestMapping("/download")
    public void downloadImg(String fname, HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 从image目录下找到当前文件
        String dir = request.getServletContext().getRealPath("images");
        String filePath = dir + "/" + fname;

        FileInputStream fileInputStream = new FileInputStream(filePath);

        // 让浏览器识别不了文件（可另下载）
        response.setContentType("application/aaa");
        response.addHeader("Content-Disposition","attachment;filename="+fname);

        // 到这里可以看到原图
        IOUtils.copy(fileInputStream,response.getOutputStream());
    }

    @RequestMapping("/query")
    public String queryBook(String bookId){

        System.out.println(bookId);
        return "/tips.jsp";
    }

}
