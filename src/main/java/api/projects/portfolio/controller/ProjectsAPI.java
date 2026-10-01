package api.projects.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectsAPI {

    @GetMapping
    public String getIntro(){
        return "Welcome to the Projects API created for the personal portfolio of Vansilu Kodikara (vansilu.vercel.app)." +
                "PATHS[" +
                "/featured-projects , " +
                "/all-projects]";
    }


}
