package sample.tomcat.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(HttpServletRequest request) {
        request.getSession(true);
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>please reload.</h1>");
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                sb.append("cookie name = " + cookie.getName());
                sb.append("<br>");
                sb.append("cookie value = " + cookie.getValue());
                sb.append("<br>");
            }
        }
        sb.append("<p>It is correct if session cookie name = FOOID ...</p>");
        return sb.toString();
    }
}
