package com.santos.api.controller.health;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {

    @GetMapping
    public SystemStatus health(){
        return new SystemStatus("UP");
    }

    @Getter
    private class SystemStatus{
        private String status;

        public SystemStatus(String status) {
            this.status = status;
        }
    }

}
