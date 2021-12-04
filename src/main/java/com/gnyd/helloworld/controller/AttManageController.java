package com.gnyd.helloworld.controller;


import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatuses;
import com.gnyd.helloworld.entity.StaffEmployment;
import com.gnyd.helloworld.mapper.AttManageMapper;
import com.gnyd.helloworld.service.impl.AttManageServiceImpl;
import com.gnyd.helloworld.service.impl.AttStatusesServiceImpl;
import com.gnyd.helloworld.service.impl.StaffEmploymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
public class AttManageController {

    @Autowired
    private AttManageServiceImpl attManageService;
    @Autowired
    private AttStatusesServiceImpl attStatusesService;
    @Autowired
    private StaffEmploymentServiceImpl staffEmploymentService;

    @RequestMapping("/atts")
    public String list(Model model) {
        List<AttManage> attManages = attManageService.queryAll();
        model.addAttribute("atts", attManages);
        return "att/list";
    }

    @GetMapping("seaatt")
    public String toSeaPage(@RequestParam("search") String search, Model model) {
        List<AttManage> attManages = attManageService.queryByCon(search);
        model.addAttribute("atts", attManages);
        return "att/list";
    }

    @GetMapping("/att")
    public String toAddPage(Model model) {
        List<AttManage> attManages = attManageService.queryAll();
        model.addAttribute("attendances", attManages);
        List<AttStatuses> attStatus = attStatusesService.queryAll();
        model.addAttribute("statuses", attStatus);
        return "att/add";
    }

    @PostMapping("/att")
    public String addAtt(AttManage attManage) {
        System.out.println(attManage);
        Boolean attMan = attManageService.saveAttMan(attManage);
        System.out.println(attMan);
        return "redirect:/atts";
    }

    @GetMapping("/toUpdateAtt/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        AttManage attManage = attManageService.queryById(id);
        model.addAttribute("att", attManage);
        List<StaffEmployment> staffEmployments = staffEmploymentService.queryAll();
        model.addAttribute("employees", staffEmployments);
        List<AttStatuses> attStatuses = attStatusesService.queryAll();
        model.addAttribute("statuses", attStatuses);
        return "att/update";
    }

    @PostMapping("/updateAtt")
    public String updateAtt(AttManage attManage) {
        attManageService.updateAttMan(attManage);
        return "redirect:/atts";
    }

    @GetMapping("/delAtt/{id}")
    public String deleteAtt(@PathVariable("id") Integer id) {
        attManageService.deleteAttMan(id);
        return "redirect:/atts";
    }

}

