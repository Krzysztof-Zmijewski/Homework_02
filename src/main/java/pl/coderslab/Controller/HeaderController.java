package pl.coderslab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class HeaderController {

    @GetMapping("showUserAgent")
    public String userAgent(@RequestHeader Map<String, String> header, Model model){
        model.addAttribute("header", header);
        return "userAgent";
    }
}
