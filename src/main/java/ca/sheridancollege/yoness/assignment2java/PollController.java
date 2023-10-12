package ca.sheridancollege.yoness.assignment2java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/candy-poll")
public class PollController {

    @Autowired
    private PollService pollService; // You should create this service

    @GetMapping("/poll")
    public String showPollPage(Model model) {
        // Retrieve the "Candy Poll" from the service
        Poll candyPoll = pollService.getPollById(3); // Replace with the actual poll ID
        model.addAttribute("candyPoll", candyPoll);
        return "candy-poll";
    }

    @PostMapping("/vote")
    public String vote(@RequestParam("choice") String choice) {
        // Record the user's vote for the "Candy Poll" using the service
        pollService.recordVote(3, choice); // Replace with the actual poll ID
        return "redirect:/candy-poll/results";
    }

    @GetMapping("/results")
    public String showResults(Model model) {
        // Retrieve the "Candy Poll" results from the service
        Poll candyPoll = pollService.getPollById(3); // Replace with the actual poll ID
        model.addAttribute("candyPoll", candyPoll);
        return "candy-poll-results";
    }
}


