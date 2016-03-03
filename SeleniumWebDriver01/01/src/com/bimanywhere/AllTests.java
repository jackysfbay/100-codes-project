package com.bimanywhere;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, CreateIssue.class, CreateNewProject.class, IssueArchive.class, IssuesFilter.class,
		RegisterUser.class, UserLoginStage.class })

public class AllTests {

}
