package com.ssp.soj.judge;

import com.ssp.soj.judge.strategy.DefaultJudgeStrategy;
import com.ssp.soj.judge.strategy.JavaLanguageJudgeStrategy;
import com.ssp.soj.judge.strategy.JudgeContext;
import com.ssp.soj.judge.strategy.JudgeStrategy;
import com.ssp.soj.judge.codesandox.model.JudgeInfo;
import com.ssp.soj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}

