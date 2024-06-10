package core;

import config.EmulatorConfig;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class BasePage {
    public AppiumDriver driver;

    @FindBy(xpath = "//android.widget.Toast")
    public WebElement toastMessage;

    @FindBy(id = "action_filter")
    public WebElement searchMenuBtn;

    @FindBy(id = "action_history")
    public WebElement historyMenuBtn;

    @FindBy(id = "action_account")
    public WebElement accountMenuBtn;

    @FindBy(id = "layoutManagerChuyenXe")
    private WebElement layoutManagerBus;

    @FindBy(id = "layoutManagerUser")
    private WebElement layoutManagerUser;

    @FindBy(id = "layoutManagerLoaiXe")
    private WebElement layoutManagerCarType;

    @FindBy(id = "layoutManagerVeDat")
    private WebElement layoutManagerBookedTicket;

    @FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    public WebElement popUpConfirmBtn;

    @FindBy(id = "btnLogout")
    private WebElement logoutBtn;

    public Random random;

    public BasePage() {
        this.driver = EmulatorConfig.getAndroidDriver();
        random = new Random();
    }

    public String getToastMessage() {
        try {
            System.out.println("Toast message: " + toastMessage.getText());
            return toastMessage.getText();
        } catch (Exception e) {
            System.out.println("No toast message");
            return "";
        }
    }

    public void selectSearchMenu() {
        searchMenuBtn.click();
    }

    public void selectHistoryMenu() {
        historyMenuBtn.click();
    }

    public void selectAccountMenu() {
        accountMenuBtn.click();
    }

    public void userManagementMenuClick() {
        layoutManagerUser.click();
    }

    public void busManagementMenuClick() {
        layoutManagerBus.click();
    }

    public void carTypeMenuClick() {
        layoutManagerCarType.click();
    }

    public void goToAdminMangageTicket() {
        layoutManagerBookedTicket.click();
    }

    public void goToHistoryPage() {
        historyMenuBtn.click();
    }

    public void confirmPopUp() {
        popUpConfirmBtn.click();
    }

    public void logout() {
        selectAccountMenu();
        logoutBtn.click();
    }
}
