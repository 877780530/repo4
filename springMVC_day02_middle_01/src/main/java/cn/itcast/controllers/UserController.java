package cn.itcast.controllers;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("正常");
        return "success";
    }

    @RequestMapping("/fileUpload")
    public String fileUpload(HttpServletRequest request) throws Exception {
        String path = "C:\\Users\\韩帆\\Desktop\\ideaProject_hanfan\\springMVC_day02_middle_01\\target\\springMVC_day02_middle_01\\uploads";
        File file = new File(path);

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        List<FileItem> files = fileUpload.parseRequest(request);
        for (FileItem fileItem : files) {
            if (fileItem.isFormField()){
            }else{
                String fileName = fileItem.getName();
                fileItem.write(new File(file,fileName));//将文件写入到指定的文件夹中
                fileItem.delete();
            }
        }
        return "success";
    }
}
