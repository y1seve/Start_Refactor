package com.refactor.chapter4;

import org.junit.Test;

import java.io.File;

import static org.junit.Assume.*;
import static org.hamcrest.CoreMatchers.is;
/**
 * Created by Jim on 17/4/10.
 */
public class TestAssume {

    @Test
    public void assumeThatFileSeparatorTest(){
        assumeThat(File.separatorChar, is('/'));
        System.out.println("execute test1");
    }

    @Test
    public void assumeNotNullTest(){
        Object object = null;
        assumeNotNull(object);
        System.out.println("execute test2");
    }

    @Test
    public void assumeServerIsRunningTest(){
        boolean isServerRunning = false;
        assumeTrue(isServerRunning);
        System.out.println("execute test3");
    }
}
