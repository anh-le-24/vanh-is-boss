package com.example.qldatban.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.qldatban.model.Nguoidung;
import com.example.qldatban.service.NguoidungService;

@Controller
@RequestMapping("/nguoidung")
public class NguoidungController {
    
    @Autowired
    private NguoidungService nguoidungService;
    
    @GetMapping("/tatca")
    public String allNguoidung(Model model){
        model.addAttribute("nguoidungs", nguoidungService.getAllNguoidung());
        model.addAttribute("nguoidung", new Nguoidung());
        return "khachhang";
    }
    
    @PostMapping("/them")
    public String themKhachHang(@ModelAttribute("nguoidung") Nguoidung nguoiDung, RedirectAttributes redirectAttributes) {
        nguoidungService.saveOrUpdate(nguoiDung);
        redirectAttributes.addFlashAttribute("successMessage", "Thêm khách hàng thành công!");
        return "redirect:/nguoidung/tatca";
    }

    @GetMapping("/chitiet/{mand}")
    public ResponseEntity<?> getNguoidungChiTiet(@PathVariable Long mand) {
        Optional<Nguoidung> optionalNguoidung = nguoidungService.getNguoidungById(mand);
        if (optionalNguoidung.isPresent()) {
            Nguoidung nguoidung = optionalNguoidung.get();
            return ResponseEntity.ok(nguoidung);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/sua/{mand}")
    @ResponseBody
    public Optional<Nguoidung> suaNguoiDung(@PathVariable Long mand) {
        return nguoidungService.getNguoidungById(mand);
    }
 
    @PostMapping("/sua")
    public String processEditForm(@ModelAttribute("nguoidung") Nguoidung nguoidung, RedirectAttributes redirectAttributes) {
        nguoidungService.saveOrUpdate(nguoidung);
        redirectAttributes.addFlashAttribute("successMessage", "Cập nhật thông tin khách hàng thành công!");
        return "redirect:/nguoidung/tatca";
    }
 
    @DeleteMapping("/xoa/{mand}")
    public ResponseEntity<Void> xoaNguoidung(@PathVariable Long mand, RedirectAttributes redirectAttributes) {
        nguoidungService.deleteNguoidung(mand);
        redirectAttributes.addFlashAttribute("successMessage", "Xóa khách hàng thành công!");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/timkiem")
    @ResponseBody
    public List<Nguoidung> searchNguoidung(@RequestParam("keyword") String keyword) {
        return nguoidungService.searchNguoidung(keyword);
    }
}
