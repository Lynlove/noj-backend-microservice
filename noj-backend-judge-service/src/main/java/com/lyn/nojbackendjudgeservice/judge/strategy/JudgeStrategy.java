package com.lyn.nojbackendjudgeservice.judge.strategy;


import com.lyn.nojbackendmodel.codesandbox.JudgeInfo;

/**
 * 判题策略接口
 */
public interface JudgeStrategy {
    /**
     * 执行判题逻辑
     * @param context
     * @return
     */
    JudgeInfo doJudge(JudgeContext context);
}
