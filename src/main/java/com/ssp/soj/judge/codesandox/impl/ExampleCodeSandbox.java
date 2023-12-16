package com.ssp.soj.judge.codesandox.impl;

import com.ssp.soj.judge.codesandox.CodeSandbox;
import com.ssp.soj.judge.codesandox.model.ExecuteCodeRequest;
import com.ssp.soj.judge.codesandox.model.ExecuteCodeResponse;
import com.ssp.soj.judge.codesandox.model.JudgeInfo;
import com.ssp.soj.model.enums.JudgeInfoMessageEnum;
import com.ssp.soj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

public class ExampleCodeSandbox implements CodeSandbox{
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }

}
