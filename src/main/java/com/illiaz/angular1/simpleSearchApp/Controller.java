package com.illiaz.angular1.simpleSearchApp;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String printTesting() {
        return "\nHello World!\n";
    }

}
