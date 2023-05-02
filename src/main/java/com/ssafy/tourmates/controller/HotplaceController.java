package com.ssafy.tourmates.controller;


import com.ssafy.tourmates.authoriry.Login;
import com.ssafy.tourmates.common.FileStore;
import com.ssafy.tourmates.common.UploadFile;
import com.ssafy.tourmates.controller.dto.request.AddHotplaceRequest;
import com.ssafy.tourmates.controller.dto.request.EditHotplaceRequest;
import com.ssafy.tourmates.controller.dto.response.DetailHotplaceResponse;
import com.ssafy.tourmates.controller.dto.response.HotplaceResponse;
import com.ssafy.tourmates.hotplace.service.HotplaceService;
import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;
import com.ssafy.tourmates.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/hotplaces")
public class HotplaceController {

    private final HotplaceService hotplaceService;
    private final FileStore fileStore;

    @GetMapping
    public String hotplaceList(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "9") Integer amount,
            Model model
    ) {
        List<HotplaceResponse> hotplaces = hotplaceService.searchHotplaces(pageNum, amount);
        model.addAttribute("hotplaces", hotplaces);
        return "hotplace/hotplaceList";
    }

    @GetMapping("/register")
    public String registerHotplace() {
        return "hotplace/registerHotplace";
    }

    @PostMapping("/register")
    public String registerHotplace(@Login Member member, AddHotplaceRequest request) throws IOException {

        UploadFile attachFile = fileStore.storeFile(request.getAttachFile());

        AddHotplaceDto dto = AddHotplaceDto.builder()
                .tag(request.getTag())
                .title(request.getTitle())
                .content(request.getContent())
                .visitedDate(request.getVisitedDate())
                .uploadFile(attachFile)
                .build();

        Long hotplaceId = hotplaceService.registerHotplace(member.getLoginId(), request.getContentId(), dto);
        return "redirect:/hotplaces/" + hotplaceId;
    }

    @GetMapping("/{hotplaceId}")
    public String detailHotplace(@PathVariable Long hotplaceId, @Login Member member, Model model) {
        hotplaceService.increaseHit(hotplaceId);
        DetailHotplaceResponse hotplace = hotplaceService.searchHotplace(hotplaceId);
        if (member.getNickname().equals(hotplace.getNickname())) {
            model.addAttribute("isMine", true);
        }
        model.addAttribute("hotplace", hotplace);
        return "hotplace/detailHotplace";
    }

    @GetMapping("/{hotplaceId}/edit")
    public String editHotplace(@PathVariable Long hotplaceId, Model model) {
        DetailHotplaceResponse hotplace = hotplaceService.searchHotplace(hotplaceId);
        model.addAttribute("hotplace", hotplace);
        return "hotplace/editHotplace";
    }

    @PostMapping("/{hotplaceId}/edit")
    public String editHotplace(@PathVariable Long hotplaceId, @Login Member member, EditHotplaceRequest request, Model model) throws IOException {

        UploadFile attachFile = fileStore.storeFile(request.getAttachFile());

        ModifyHotplaceDto dto = ModifyHotplaceDto.builder()
                .tag(request.getTag())
                .title(request.getTitle())
                .content(request.getContent())
                .visitedDate(request.getVisitedDate())
                .uploadFile(attachFile)
                .build();
        Long id = hotplaceService.editHotplace(hotplaceId, member.getLoginId(), dto);
        return "redirect:/hotplaces/" + id;
    }

    @GetMapping("/{hotplaceId}/remove")
    public String removeHotplace(@PathVariable Long hotplaceId) {
        hotplaceService.removeHotplace(hotplaceId);
        return "redirect:/hotplaces";
    }
}
