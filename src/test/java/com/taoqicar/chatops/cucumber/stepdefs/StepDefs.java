package com.taoqicar.chatops.cucumber.stepdefs;

import com.taoqicar.chatops.ChatOpsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ChatOpsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
