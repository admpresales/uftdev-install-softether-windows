package com.mf;

import com.hp.lft.sdk.stdwin.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Dialog softEtherVPNSetupWizardDialog = Desktop.describe(Dialog.class, new DialogDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .nativeClass("#32770")
                .text(new RegExpProperty("SoftEther VPN Setup Wizard.*")).build());
        Button nextButton = softEtherVPNSetupWizardDialog.describe(Button.class, new ButtonDescription.Builder()
                .nativeClass("Button")
                .text("&Next >").build());
        nextButton.click();

        nextButton.click();

        CheckBox iAgreeToTheEndUserLicenseAgreementCheckBox = softEtherVPNSetupWizardDialog.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .nativeClass("Button")
                .text("I agree to the End User License Agreement.").build());

        iAgreeToTheEndUserLicenseAgreementCheckBox.setState(com.hp.lft.sdk.CheckedState.CHECKED);

        nextButton.click();

        nextButton.click();

        nextButton.click();

        nextButton.click();

        Button finishButton = softEtherVPNSetupWizardDialog.describe(Button.class, new ButtonDescription.Builder()
                .nativeClass("Button")
                .text("Finish").build());
        finishButton.click();


    }

}