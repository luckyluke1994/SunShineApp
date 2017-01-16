package com.example.maidaidien.sunshine.app;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by mai.dai.dien on 16/01/2017.
 */
public class FullTestSuite extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTestSuite.class)
            .includeAllPackagesUnderHere().build();
    }

    public FullTestSuite() {
        super();
    }
}
