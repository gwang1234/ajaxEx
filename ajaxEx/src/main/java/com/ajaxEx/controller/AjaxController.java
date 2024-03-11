package com.ajaxEx.controller;

import com.ajaxEx.dto.AjaxDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index"; // .html
    }

    @PostMapping("/ex02")
    public @ResponseBody String ex02() {
        System.out.println("AjaxController.ex02");
        return "index"; // 리턴 값이 그대로 출력 됨
    }

    @GetMapping("/ex03")
    public @ResponseBody String ex03(@RequestParam("param1") String param1, @RequestParam("param2") String param2 ) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex메서드 호출 완료";
    }

    @PostMapping("/ex04")
    public @ResponseBody String ex04(@RequestParam("param1") String param1, @RequestParam("param2") String param2 ) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex04메서드 호출 완료";
    }

    @GetMapping("/ex05")
    public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO){
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    @PostMapping("/ex07")
    public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO){
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    private List<AjaxDTO> DTOList() {
        List<AjaxDTO> dtoList = new ArrayList<>();
        dtoList.add(new AjaxDTO("data1", "data11"));
        dtoList.add(new AjaxDTO("data2", "data22"));
        return dtoList;
    }

    @PostMapping("/ex08")
    public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO){
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDTO> dtoList = DTOList();
        dtoList.add(ajaxDTO);
        return dtoList;
    }
}
