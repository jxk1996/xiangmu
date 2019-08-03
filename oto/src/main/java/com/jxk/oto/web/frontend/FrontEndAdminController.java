package  com.jxk.oto.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "frontend", method = { RequestMethod.GET,
		RequestMethod.POST })
public class FrontEndAdminController {
	@RequestMapping(value = "index", method = RequestMethod.GET)
	private String index() {
		return "frontend/index";
	}
	@RequestMapping(value = "shoplist", method = RequestMethod.GET)
	private String shoplist() {
		return "frontend/shoplist";
	}
	@RequestMapping(value = "shopdetail", method = RequestMethod.GET)
	private String shopdetail() {
		return "frontend/shopdetail";
	}

}
