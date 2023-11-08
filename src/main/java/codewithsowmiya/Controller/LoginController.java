package codewithsowmiya.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/loginForm")
    public String loginform() {
        return "loginForm";
    }

    @RequestMapping("/ProcessLoginForm")
    public String ProcessLoginForm(@RequestParam("username") String name, @RequestParam("password") String password, Model model) {
        model.addAttribute("message1", name);
        model.addAttribute("message2", password);
        return "ProcessLoginForm";


    }
}
