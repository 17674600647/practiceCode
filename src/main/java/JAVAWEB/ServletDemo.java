package JAVAWEB;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：lzy
 * @ Date       ：Created in 14:31 2021/7/16
 * @ Description：
 */
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取输出流
        ServletOutputStream outputStream = resp.getOutputStream();


        String str="lzy是李智勇";
        //写出数据
        outputStream.write(str.getBytes());

    }
}
