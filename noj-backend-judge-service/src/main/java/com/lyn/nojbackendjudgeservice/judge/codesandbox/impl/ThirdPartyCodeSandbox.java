package com.lyn.nojbackendjudgeservice.judge.codesandbox.impl;

import com.lyn.nojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeResponse;

;

/**
 * 第三方代码沙箱(调用网上现成的)
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("调用第三方代码沙箱");
        return null;
    }
}
