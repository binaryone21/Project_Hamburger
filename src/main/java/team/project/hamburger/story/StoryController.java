package team.project.hamburger.story;

import org.springframework.web.bind.annotation.GetMapping;

public class StoryController {

    @GetMapping("/story")
    public String story() {
        return "/story/brand";
    }
}
