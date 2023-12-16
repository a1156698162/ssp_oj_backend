package com.ssp.soj.judge.codesandox.impl;

import com.ssp.soj.judge.codesandox.CodeSandbox;
import com.ssp.soj.judge.codesandox.model.ExecuteCodeRequest;
import com.ssp.soj.judge.codesandox.model.ExecuteCodeResponse;

public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
