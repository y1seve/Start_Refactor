package com.refactor.chapter4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Jim on 17/4/7.
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTest.class,
    CalculatorTest01.class,
    TestMethodOrder.class,
    TestExecution.class
})
public class FeatureTestSuite {
    //the class remains empty,
    //used only as a holder for the above annotations
}
