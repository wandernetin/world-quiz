package org.wneto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wneto.domain.Quiz;
import org.wneto.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class WorldQuizController {

    private final QuizService quizService;

    public WorldQuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/random")
    public Quiz getRandomQuiz() {
        return quizService.getRandomQuiz();
    }
}
