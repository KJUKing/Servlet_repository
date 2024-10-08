package homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

@WebServlet("/now.do")
public class WatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ZonedDateTime now = ZonedDateTime.now();
        String pattern = "\"now\":\"현재 시간 : %s\"";
        StringBuffer json = new StringBuffer();
        json.append("{");
        json.append( String.format(pattern, now.toString()));
        json.append("}");
        resp.setContentType("application/json;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(json);
    }
}
