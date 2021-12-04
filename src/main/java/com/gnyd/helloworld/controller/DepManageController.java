package com.gnyd.helloworld.controller;


import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.service.impl.DepManageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Controller
public class DepManageController {

    @Autowired
    private DepManageServiceImpl depManageService;

    @RequestMapping("/deps")
    public String list(Model model) {
        List<DepManage> depManages = depManageService.queryAll();
        model.addAttribute("deps", depManages);
        return "dep/list";
    }

    @GetMapping("/seadep")
    public String toSeaPage(@RequestParam("search") String search, Model model) {
        List<DepManage> depManages = depManageService.queryByCon(search);
        model.addAttribute("deps", depManages);
        return "dep/list";
    }

    @GetMapping("/dep")
    public String toAddpage(Model model) {
        List<DepManage> depManages = depManageService.queryAll();
        model.addAttribute("deps", depManages);
        return "dep/add";
    }

    @PostMapping("/dep")
    public String addDep(DepManage depManage) {
        System.out.println(depManage);
        Boolean depMan = depManageService.saveDepMan(depManage);
        System.out.println(depMan);
        return "redirect:/deps";
    }

    @GetMapping("/toUpdateDep/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        DepManage depManage = depManageService.queryById(id);
        model.addAttribute("dep", depManage);
        List<DepManage> depManages = depManageService.queryAll();
        model.addAttribute("departments", depManages);
        return "dep/update";
    }

    @PostMapping("/updateDep")
    public String updateDep(DepManage depManage) {
        depManageService.saveDepMan(depManage);
        return "redirect:/deps";
    }

    @GetMapping("/delDep/{id}")
    public String deleteDep(@PathVariable("id") Integer id) {
        depManageService.deleteDepMan(id);
        return "redirect:/deps";
    }

}

