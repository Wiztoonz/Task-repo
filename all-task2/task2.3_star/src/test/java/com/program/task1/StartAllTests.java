package com.program.task1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestProgrammer.class,
        TestManager.class,
        TestAccountant.class,
        TestEmployeeArray.class,
        TestDeepMerge.class})
public class StartAllTests {
}
