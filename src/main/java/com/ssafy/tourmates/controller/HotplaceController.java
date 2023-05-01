package com.ssafy.tourmates.controller;


import com.ssafy.tourmates.controller.dto.request.AddHotplaceRequest;
import com.ssafy.tourmates.controller.dto.request.EditHotplaceRequest;
import com.ssafy.tourmates.hotplace.service.HotplaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/hotplaces")
public class HotplaceController {

    private final HotplaceService hotplaceService;

    @GetMapping
    public String hotplaceList() {
        return "hotplace/hotplaceList";
    }

    @GetMapping("/register")
    public String registerHotplace() {
        return "hotplace/registerHotplace";
    }

    @PostMapping("/register")
    public String registerHotplace(AddHotplaceRequest request) {
        return "hotplace/registerHotplace";
    }

    @GetMapping("/{hotplaceId}")
    public String detailHotplace(@PathVariable Long hotplaceId, Model model) {
        return "hotplace/detailHotplace";
    }

    @GetMapping("/{hotplaceId}/edit")
    public String editHotplace(@PathVariable Long hotplaceId, Model model) {
        return "hotplace/editHotplace";
    }

    @PostMapping("/{hotplaceId}/edit")
    public String editHotplace(@PathVariable Long hotplaceId, EditHotplaceRequest request, Model model) {
        return "hotplace/editHotplace";
    }

    @GetMapping("/{hotplaceId}/remove")
    public String removeHotplace(@PathVariable Long hotplaceId) {
        return "redirect:/hotplaces";
    }
}
