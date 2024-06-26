package com.lyn.nojbackendserviceclient.service;

import com.lyn.nojbackendmodel.entity.Question;
import com.lyn.nojbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lyn
 * @description 针对表【question(题目)】的数据库操作Service
 * @createDate 2024-06-15 22:14:39
 */
@FeignClient(name = "noj-backend-question-service", path = "/api/question/inner")
public interface QuestionFeignClient{

    @GetMapping("/get/id")
    Question getById(@RequestParam("questionId") long questionId);

    @PostMapping("/question/update")
    boolean updateById(@RequestBody Question question);

    @GetMapping("/question_submit/get/id")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId);

    @PostMapping("/question_submit/update")
    boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);

}
