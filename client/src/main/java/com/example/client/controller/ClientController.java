package com.example.client.controller;

import com.example.client.feignclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getclienttMsg")
    public String getProductMsg(){
        //1. 第一种方式
//        RestTemplate  restTemplate = new RestTemplate();
//       String  response =  restTemplate.getForObject("http://localhost:8888/getProductmsg",String.class);
        // 2.第二种方式
//        RestTemplate  restTemplate = new RestTemplate();
//        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", product.getHost(), product.getPort()) + "/getProductmsg";
//        String  response =  restTemplate.getForObject(url,String.class);
        // 3. 第三种方式
//        String response = restTemplate.getForObject("http://PRODUCT/getProductmsg", String.class);
       //   使用 feign 方式 调用
        String response =  productClient.productMsg();
        return response;
    }

}
