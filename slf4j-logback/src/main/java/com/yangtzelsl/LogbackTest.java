package com.yangtzelsl;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    // 快速入门
    @Test
    public void testQuick()throws Exception{

        for (int i = 0; i < 100; i++) {
            // 日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            // 默认级别
            LOGGER.debug("debug");
            LOGGER.trace("trace");
        }
    }
}
