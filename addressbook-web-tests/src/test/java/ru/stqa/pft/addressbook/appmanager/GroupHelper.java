package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(ChromeDriver driver) {
        super(driver);

    }

    public void returnToGroupPage() {
        click(By.xpath("//a[text()='group page']"));
    }

    public void submitGroupCreation() {
        click(By.cssSelector("input[type='submit']"));
    }

    public void fillGroupFrom(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }
}
