package com.gnyd.helloworld.controller;


import com.gnyd.helloworld.entity.SysManage;
import com.gnyd.helloworld.entity.SysType;
import com.gnyd.helloworld.service.impl.SysManageServiceImpl;
import com.gnyd.helloworld.service.impl.SysTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Controller
public class SysManageController {

    @Autowired
    private SysManageServiceImpl sysManageService;
    @Autowired
    private SysTypeServiceImpl sysTypeService;

    @RequestMapping("/usrs")
    public String list(Model model) {
        List<SysManage> sysManages = sysManageService.queryAll();
        model.addAttribute("usrs", sysManages);
        return "sys/list";
    }

    @GetMapping("/seausr")
    public String toSeaPage(@RequestParam("search") String search, Model model) {
        List<SysManage> sysManages = sysManageService.queryByCon(search);
        model.addAttribute("usrs", sysManages);
        return "sys/list";
    }

    @GetMapping("/usr")
    public String toAddPage(Model model) {
        List<SysManage> sysManages = sysManageService.queryAll();
        model.addAttribute("systems", sysManages);
        List<SysType> sysTypes = sysTypeService.queryAll();
        model.addAttribute("types", sysTypes);
        return "sys/add";
    }

    @PostMapping("/usr")
    public String addSys(SysManage sysManage) {
        System.out.println(sysManage);
        Boolean sysMan = sysManageService.saveSysMan(sysManage);
        System.out.println(sysMan);
        return "redirect:/usrs";
    }



}

