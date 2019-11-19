package com.program.task1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {TestAccountant.class, TestManager.class, TestProgrammer.class})
public class StartAllTest {
}
