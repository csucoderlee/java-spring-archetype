package org.csu.coderlee;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * @author csucoderlee
 * 事务单测类都继承此事务基类
 * 场景：单测的测试数据，不想要落入测试环境数据库，需要回滚该数据
 */
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class BaseTransactionalTestNG extends AbstractTransactionalTestNGSpringContextTests {
}
