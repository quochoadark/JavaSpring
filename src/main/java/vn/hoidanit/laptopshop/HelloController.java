package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // Tạo 3 trang web kết nối 
    
    // Trang web localhost  => Google: localhost:8080
	@GetMapping("/")   
	public String index() {
		return "Hello World from Spring";
	}

    // Trang web user    
    @GetMapping("/user")   //+tên trang web   => Google: localhost:8080/user
	public String userPage() {
		return "Only user can access this page";
	}

    // Trang web admin
    @GetMapping("/admin")
	public String adminPage() {  //+tên trang web  => Google: localhost:8080/admin
		return "Only admin can access this page";
	}

}
