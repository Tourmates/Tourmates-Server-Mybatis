package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.authoriry.Login;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.tripplan.service.TripPlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("trip")
public class TripPlanController {

    private final TripPlanService tripPlanService;

    @GetMapping
    public String tripPlans() {
        return null;
    }

    @GetMapping("/register")
    public String registerTripPlan() {
        return null;
    }

    @PostMapping("/register")
    public String registerTripPlan(@Login Member member) {
        return null;
    }

    @GetMapping("/{tripPlanId}")
    public String detailTripPlan(@PathVariable Long tripPlanId) {
        return null;
    }

    @GetMapping("/{tripPlanId}/edit")
    public String editTripPlan(@PathVariable Long tripPlanId) {
        return null;
    }

    @PostMapping("/{tripPlanId}/edit")
    public String editTripPlan(@PathVariable Long tripPlanId, @Login Member member) {
        return null;
    }

    @GetMapping("/{tripPlanId}/remove")
    public String removeTripPlan(@PathVariable Long tripPlanId) {
        return null;
    }
}
