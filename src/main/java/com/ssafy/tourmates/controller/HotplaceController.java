package com.ssafy.tourmates.controller;


import com.ssafy.tourmates.controller.dto.AddHotplaceRequest;
import com.ssafy.tourmates.hotplace.service.HotplaceService;
import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/{hotplaceId}/remove")
    public String removeHotplace(@PathVariable Long hotplaceId) {
        return "redirect:/hotplaces";
    }
}
