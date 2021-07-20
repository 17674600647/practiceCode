package JAVAWEB;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：lzy
 * @ Date       ：Created in 14:31 2021/7/16
 * @ Description：
 */
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //获取输出流
        ServletOutputStream outputStream = resp.getOutputStream();
            //设置响应编码格式,就是修改浏览器响应时的格式,设置内容响应格式

        String str = "lzy是李智勇";
        //写出数据
        outputStream.write(str.getBytes());
        //获取字符流对象
        PrintWriter writer = resp.getWriter();
        writer.write(str);



    }
}
