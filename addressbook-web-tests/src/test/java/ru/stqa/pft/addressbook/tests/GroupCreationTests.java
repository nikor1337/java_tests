package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGrouplist();
        app.getGroupHelper().createGroup(new GroupData("name1", null, null));
        List<GroupData> after = app.getGroupHelper().getGrouplist();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
