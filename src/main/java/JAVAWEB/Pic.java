package JAVAWEB;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ：lzy
 * @ Date       ：Created in 20:01 2021/7/16
 * @ Description：
 */
public class Pic extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //图片输入流,发布路径和真实路径不一样,要获取Context获取真实路径
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(getServletContext().getRealPath("/1.jpg")));
        ServletOutputStream respOutputStream = resp.getOutputStream();
        byte[] data = new byte[1024];
        int length;
        while ((length = bf.read(data)) != -1) {
            respOutputStream.write(data, 0, length);
        }
        bf.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
