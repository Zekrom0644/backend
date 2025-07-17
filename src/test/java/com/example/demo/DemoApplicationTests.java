package com.example.demo;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionService;
import com.example.demo.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Transactional
    @Test
    void testJpa(){
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다: [%03d]", i);
            String content = "내용무";
            this.questionService.create(subject,content);
        }
    }

}


