package com.zhexun.controller;

import com.zhexun.pojo.Picture;
import com.zhexun.service.PictureService;
import com.zhexun.service.impl.PictureServiceImpl;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/pictures")
public class PictureController {
    private final PictureService pictureService = new PictureServiceImpl();

    @GetMapping
    public List<Picture> selectAll() {
        return pictureService.selectAll();
    }

    @PostMapping("upload")
    public Map upload(MultipartFile file, HttpServletRequest request) {
        String prefix = "";
        String dateStr = "";
        String photoUrl = "";
        //保存上传
        OutputStream out = null;
        InputStream fileInput = null;
        try {
            if (file != null) {
                String originalName = file.getOriginalFilename();
                prefix = originalName.substring(originalName.lastIndexOf(".") + 1);
                Date date = new Date();
                String uuid = UUID.randomUUID() + "";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                dateStr = simpleDateFormat.format(date);
                photoUrl = dateStr + uuid + "." + prefix;
                String filepath = "D:\\IDEA_PROJECT\\Revolutionary_Times\\src\\main\\resources\\static\\image\\" + photoUrl;
                File files = new File(filepath);
                //打印查看上传路径
                System.out.println("上传路径：" + filepath);
                if (!files.getParentFile().exists()) {
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                Map<String, Object> map2 = new HashMap<>();
                Map<String, Object> map = new HashMap<>();
                map.put("code", 0);
                map.put("msg", "");
                map.put("data", map2);
                map2.put("src", photoUrl);
                return map;
            }

        } catch (Exception e) {
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (fileInput != null) {
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("msg", "");
        return map;
    }

    /**
     * 文件名后缀前添加一个时间戳
     */
    private String getFileName(String fileName) {
        int index = fileName.lastIndexOf(".");
        final SimpleDateFormat sDateFormate = new SimpleDateFormat("yyyymmddHHmmss");  //设置时间格式
        String nowTimeStr = sDateFormate.format(new Date()); // 当前时间
        fileName = fileName.substring(0, index) + "_" + nowTimeStr + fileName.substring(index);
        return fileName;
    }

    /**
     * 获取当前系统路径
     */
    private String getUploadPath() {
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!path.exists()) path = new File("");
        File upload = new File(path.getAbsolutePath(), "static/image/");
        if (!upload.exists()) upload.mkdirs();
        return upload.getAbsolutePath();
    }

}
