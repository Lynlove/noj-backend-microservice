package com.lyn.nojbackendjudgeservice.judge;


import com.lyn.nojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.lyn.nojbackendjudgeservice.judge.strategy.JavaJudgeStrategy;
import com.lyn.nojbackendjudgeservice.judge.strategy.JudgeContext;
import com.lyn.nojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.lyn.nojbackendmodel.codesandbox.JudgeInfo;
import com.lyn.nojbackendmodel.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理，简化调用
 */
@Service
public class JudgeManager {
    /**
     * 执行判题逻辑
     * @param context
     * @return
     */
    JudgeInfo doJudge(JudgeContext context){
        QuestionSubmit questionSubmit = context.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (language.equals("java")){
            judgeStrategy = new JavaJudgeStrategy();
        }
        return judgeStrategy.doJudge(context);
    }
}
