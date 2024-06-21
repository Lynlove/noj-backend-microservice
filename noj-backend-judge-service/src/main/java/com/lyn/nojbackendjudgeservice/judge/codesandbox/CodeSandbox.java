package com.lyn.nojbackendjudgeservice.judge.codesandbox;


import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.lyn.nojbackendmodel.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
