package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupFrom(new GroupData("name1", "header1", "footer1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
