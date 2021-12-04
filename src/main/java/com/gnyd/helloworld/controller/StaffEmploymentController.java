package com.gnyd.helloworld.controller;


import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.entity.StaffArchives;
import com.gnyd.helloworld.entity.StaffEmployment;
import com.gnyd.helloworld.entity.StaffStatuses;
import com.gnyd.helloworld.service.impl.DepManageServiceImpl;
import com.gnyd.helloworld.service.impl.StaffArchivesServiceImpl;
import com.gnyd.helloworld.service.impl.StaffEmploymentServiceImpl;
import com.gnyd.helloworld.service.impl.StaffStatusesServiceImpl;
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
public class StaffEmploymentController {

    @Autowired
    private StaffEmploymentServiceImpl staffEmploymentService;
    @Autowired
    private DepManageServiceImpl depManageService;
    @Autowired
    private StaffArchivesServiceImpl staffArchivesService;
    @Autowired
    private StaffStatusesServiceImpl staffStatusesService;

    @RequestMapping("/emps")
    public String list(Model model) {
        List<StaffEmployment> staffEmployments = staffEmploymentService.queryAll();
        model.addAttribute("emps", staffEmployments);
        return "emp/list";
    }

    @GetMapping("/seasta")
    public String toSeaPage(@RequestParam("search") String search, Model model) {
        List<StaffEmployment> staffEmployments = staffEmploymentService.queryByCon(search);
        model.addAttribute("emps", staffEmployments);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model) {
        List<DepManage> depManages = depManageService.queryAll();
        model.addAttribute("departments", depManages);
        List<StaffEmployment> staffEmployments = staffEmploymentService.queryAll();
        model.addAttribute("employees", staffEmployments);
        List<StaffStatuses> staffStatuses = staffStatusesService.queryAll();
        model.addAttribute("statuses", staffStatuses);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addDep(StaffEmployment staffEmployment) {
        System.out.println(staffEmployment);
        Boolean staEmp = staffEmploymentService.saveStaEmp(staffEmployment);
        System.out.println(staEmp);
        return "redirect:/emps";
    }

    @GetMapping("/toUpdateEmp/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        StaffEmployment staffEmployment = staffEmploymentService.queryById(id);
        model.addAttribute("emp", staffEmployment);
        List<DepManage> depManages = depManageService.queryAll();
        model.addAttribute("departments", depManages);
        List<StaffEmployment> staffEmployments = staffEmploymentService.queryAll();
        model.addAttribute("employees", staffEmployments);
        List<StaffStatuses> staffStatuses = staffStatusesService.queryAll();
        model.addAttribute("statuses", staffStatuses);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(StaffEmployment staffEmployment) {
        staffEmploymentService.updateStaEmp(staffEmployment);
        return "redirect:/emps";
    }

    @GetMapping("/toDetEmp/{id}")
    public String toDetail(@PathVariable("id") Integer id, Model model) {
        StaffEmployment staffEmployment = staffEmploymentService.queryById(id);
        model.addAttribute("emp", staffEmployment);
        List<StaffArchives> staffArchives = staffArchivesService.queryAll();
        model.addAttribute("archives", staffArchives);
        return "emp/detail";
    }

    @PostMapping("/detEmp")
    public String detailEmp(Model model) {
        return "redirect:/emps";
    }

    @GetMapping("/delEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        staffEmploymentService.deleteStaEmp(id);
        return "redirect:/emps";
    }

}

