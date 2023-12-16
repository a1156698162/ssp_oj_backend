package com.ssp.soj.judge.codesandox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CodeSandboxTest {

    @Value("${codesandbox.type}")
    String type;

    @Test
    void executeCode(){
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        codeSandbox.executeCode(null);

    }

    public static void main(String[] args) {

        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance("example");
        codeSandbox.executeCode(null);

    }
}
