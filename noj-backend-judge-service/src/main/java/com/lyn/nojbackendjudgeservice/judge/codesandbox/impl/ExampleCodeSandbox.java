package com.lyn.nojbackendjudgeservice.judge.codesandbox.impl;


import com.lyn.nojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeResponse;
import com.lyn.nojbackendmodel.codesandbox.JudgeInfo;
import com.lyn.nojbackendmodel.enums.JudgeInfoMessageEnum;
import com.lyn.nojbackendmodel.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {

        System.out.println("ExampleCodeSandBox executeCode");
        List<String> inputList = executeCodeRequest.getInputList();
        String code = executeCodeRequest.getCode();
        String language = executeCodeRequest.getLanguage();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCESS.getText());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
