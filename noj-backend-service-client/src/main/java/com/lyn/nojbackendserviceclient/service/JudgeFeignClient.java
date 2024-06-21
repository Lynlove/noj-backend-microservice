package com.lyn.nojbackendserviceclient.service;


import com.lyn.nojbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 判题服务
 */
@FeignClient(name = "noj-backend-judge-service", path = "/api/judge/inner")
public interface JudgeFeignClient {
    /**
     * 执行判题逻辑
     *
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
