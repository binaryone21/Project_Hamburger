package team.project.hamburger.layout;

import org.springframework.web.bind.annotation.GetMapping;

public class LayoutController {

    @GetMapping("/")
    public String Layout() {
        return "";
    }

}
