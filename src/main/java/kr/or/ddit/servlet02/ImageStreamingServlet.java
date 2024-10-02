package kr.or.ddit.servlet02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class ImageStreamingServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        classpath resource를 web resource로 서비스하고싶어함.

        String imageFileName = req.getParameter("image");
//        String imageFileName = "cute3.JPG";
        ServletContext application = getServletContext();
        String mime = application.getMimeType(imageFileName);
        resp.setContentType(mime);

        String imageLogicalPath = "/kr/or/ddit/images/"+imageFileName;
        InputStream is = this.getClass().getResourceAsStream(imageLogicalPath);
        OutputStream out = resp.getOutputStream();
        byte[] buffer = new byte[1024];

        int cnt = -1;
        while ((cnt = is.read(buffer)) != -1) { // EOF를 만나기전까지 반복
            out.write(buffer, 0, cnt);
        }

    }
}
