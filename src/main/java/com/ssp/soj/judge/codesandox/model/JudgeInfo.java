package com.ssp.soj.judge.codesandox.model;

import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeInfo {

    /**
     * 消耗时间 ms
     */
    private Long time;

    /**
     * 消耗内存 KB
     */
    private Long memory;

    /**
     *程序执行信息
     */
    private String message;
}
