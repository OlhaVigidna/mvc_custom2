package ua.com.owu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.dao.ProductDAO;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.models.Product;
import ua.com.owu.models.User;

@Controller
public class MainController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("products", productDAO.findAll());
        System.out.println("home");
        return "index";
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestParam("username") String username, @RequestParam("productId") int productId){

        User user = new User(username);


        userDAO.save(user);

        Product product = productDAO.findOne(productId);

        product.setUser(user);

        productDAO.save(product);
        return "redirect:/";
    }

    @PostMapping("/saveProduct")
    public  String saveProduct(Product product){
productDAO.save(product);
        return "redirect:/";
    }
}
