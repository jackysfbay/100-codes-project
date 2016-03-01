package com.bimanywhere;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({  RegisterUser.class,UserLoginStage.class, CreateNewProject.class, CreateIssue.class, IssuesFilter.class })
public class AllTests {
		
}
