package codewithsowmiya.Controller;

import codewithsowmiya.Dao.Userdao;
import codewithsowmiya.model.Register;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.Date;
import java.sql.SQLException;

@Controller
public class RegisterController {
    @RequestMapping("/registerForm")
    public String registerform() {
        return "registerForm";
    }


    @RequestMapping("/ProcessRegisterForm")
    public String processRegisterForm(HttpServletRequest request, Model model) throws SQLException {
        Userdao userdao = new Userdao();
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String emailId = request.getParameter("email");
        String password = request.getParameter("password");

        model.addAttribute("fname",firstname);
        model.addAttribute("lname",lastname);
        model.addAttribute("address",address);
        model.addAttribute("gender",gender);
        model.addAttribute("state",state);
        model.addAttribute("city",city);
        model.addAttribute("emailId",emailId);
        model.addAttribute("password",password);
        userdao.RegisterUser(firstname,lastname,address,gender,state,city,emailId,password);

        return "ProcessRegisterForm";
    }

}




