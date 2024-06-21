package com.lyn.nojbackendjudgeservice.judge.strategy;


import com.lyn.nojbackendmodel.codesandbox.JudgeInfo;
import com.lyn.nojbackendmodel.dto.question.JudgeCase;
import com.lyn.nojbackendmodel.entity.Question;
import com.lyn.nojbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文，用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase> judgeCaseList;

    private Question question;
    private QuestionSubmit questionSubmit;
}
