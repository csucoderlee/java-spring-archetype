package org.csu.coderlee;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * @author csucoderlee
 * 普通单测类都继承此基类
 */
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class BaseTestNG extends AbstractTestNGSpringContextTests {
}
