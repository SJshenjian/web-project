package online.shenjian.xuefeng.controller;

import online.shenjian.xuefeng.model.Visitor;
import online.shenjian.xuefeng.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VisitorController {

	@Autowired
	private VisitorService visitorService;
	
	/**联系我**/
	//沈健 5.15
	@RequestMapping(value="/contact",method=RequestMethod.POST)
	public String contactMe(Visitor visitor, Model model){
		
		visitorService.contactMe(visitor);
		model.addAttribute("success","您的邮件已收到,我会尽快回复，谢谢");
		
	    return "index";
	}
	
}
