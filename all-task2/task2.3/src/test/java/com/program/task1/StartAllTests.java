package com.program.task1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestAccountant.class,
        TestProgrammer.class,
        TestManager.class,
        EmployeeListTest.class,
        MergeEmployeeAsListTest.class})
public class StartAllTests {
    // Start all tests
}
