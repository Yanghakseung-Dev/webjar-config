package com.example.webjar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @RequestMapping(value = "/")
    public ModelAndView main() {
        ModelAndView view = new ModelAndView("webjar-test");
        view.addObject("text", "webjar-test");
        return view;
    }

    @RequestMapping(value = "/cdn")
    public ModelAndView cdn() {
        ModelAndView view = new ModelAndView("cdn-test");
        view.addObject("text", "cdn-test");
        return view;
    }

    @RequestMapping(value = "/webjar")
    public ModelAndView webjar() {
        ModelAndView view = new ModelAndView("webjar-test");
        view.addObject("text", "webjar-test");
        return view;
    }
}
