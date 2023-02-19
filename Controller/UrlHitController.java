package com.example.urlHitCounterApp.Controller;

import com.example.urlHitCounterApp.Model.UrlHit;
import com.example.urlHitCounterApp.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-counter-app")
public class UrlHitController {
        @Autowired
        private UrlHitService hitService;

        @GetMapping("username/{username}/count")
        public UrlHit getCount(@PathVariable String username){
            UrlHit visit = hitService.getVisit(username);
            return visit;
    }
}
