package com.example.client.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/getProductmsg")
  String productMsg();
}
