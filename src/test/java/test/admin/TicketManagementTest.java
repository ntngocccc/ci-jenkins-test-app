package test.admin;

import core.BaseTest;
import helpers.RandomHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.BookTicketPage;
import page.CancelTicketPage;
import page.admin.TicketManagementPage;

import java.io.IOException;

public class TicketManagementTest extends BaseTest {

    TicketManagementPage page;
    BookTicketPage bookTicketPage;
    @BeforeClass
    public void setUp() throws IOException {
        page = new TicketManagementPage();
        bookTicketPage = new BookTicketPage();
    }

    @Test(priority = 1, description = "Change ticket status successfully")
    public void TC01_ChangeTicketStatus() throws InterruptedException {
        loginPage.login("khachhang", "khachhang");
        bookTicketPage.placeBooking(RandomHelper.randomFutureDate(), "", false);
        page.logout();
        loginPage.loginWithClick("thaigiavuong", "admin");

        TicketManagementPage ticketManagementPage = new TicketManagementPage();
        ticketManagementPage.changeTicketStatus();
    }
}
