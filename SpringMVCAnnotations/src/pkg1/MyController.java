package pkg1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Link.spring")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String myMethod()  {

		//Get data from DB
		return "view";
	}
}
