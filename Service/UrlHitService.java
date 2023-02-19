package com.example.urlHitCounterApp.Service;

import com.example.urlHitCounterApp.Model.UrlHit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
        static Map<String,Integer> map = new HashMap<>();
        public UrlHit getVisit(String username){
            int count = map.getOrDefault(username,0)+1;
            map.put(username,count);

            UrlHit visit = new UrlHit(username,count);
            return visit;
    }
}
