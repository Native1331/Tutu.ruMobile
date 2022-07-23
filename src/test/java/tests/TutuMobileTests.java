package tests;


import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("TutuTests")
public class TutuMobileTests extends TestBase {
    @Test
    void openAppAndFindTickets() {
        step("Open Tutu.ru app", () -> {
            $(AppiumBy.id("ru.tutu.tutu_emp:id/contRoot")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/contRoot")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/contRoot")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/vLayerTopGradient")).shouldBe(visible);
        });

        step("FindTickets", () -> {
            $(AppiumBy.id("ru.tutu.tutu_emp:id/buttonHintTextView")).click();
            $$(AppiumBy.className("android.view.ViewGroup")).get(2).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/buttonHintTextView")).click();
            $$(AppiumBy.className("android.view.ViewGroup")).get(3).click();
            ;
            $(AppiumBy.id("ru.tutu.tutu_emp:id/progress_button_layout")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/tvTitle")).shouldHave(text("Moscow — Simferopol"));
        });

        step("FindFlightTickets", () -> {
            $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/image_plane")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/progress_button_layout")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/tvTitle")).shouldHave(text("Moscow — Simferopol"));
        });
        step("FindTrainTickets", () -> {
            $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/image_train")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/progress_button_layout")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/tvTitle")).shouldHave(text("Moscow — Simferopol"));
        });

        step("FindAutobusTickets", () -> {
            $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/image_bus")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/progress_button_layout")).click();
            $(AppiumBy.id("ru.tutu.tutu_emp:id/tvTitle")).shouldHave(text("Moscow — Simferopol"));

        });
    }
}
