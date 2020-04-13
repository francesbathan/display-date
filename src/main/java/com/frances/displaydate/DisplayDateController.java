package com.frances.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date newDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		String formattedDate = formatter.format(newDate);
		
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date anotherDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a" );
		String formattedTime = formatter.format(anotherDate);
		model.addAttribute("date", formattedTime);
		return "time.jsp";
	}

}