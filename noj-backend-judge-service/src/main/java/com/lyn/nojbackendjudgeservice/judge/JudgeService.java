package com.lyn.nojbackendjudgeservice.judge;


import com.lyn.nojbackendmodel.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService {
    /**
     * 执行判题逻辑
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
