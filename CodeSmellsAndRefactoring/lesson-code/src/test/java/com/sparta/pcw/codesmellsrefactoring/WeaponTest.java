package com.sparta.pcw.codesmellsrefactoring;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.pcw.codesmellsrefactoring.WeaponType.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WeaponTest {

    @Test
    @DisplayName("check that if weaponType is waterPistol shoot should contain 'Splash!!'")
    void checkThatIfWeaponTypeIsWaterPistolShootShouldContainSplash() {
        // Arrange
        Weapon weapon = new Weapon(WaterPistol, "nerf");
        assertThat(weapon.shoot(), containsString("Splash!!"));
        // Act

        // Assert
    }

    @Test
    @DisplayName("check that if weaponType is BubbleBlaster shoot should contain 'Bubbles...'")
    void checkThatIfWeaponTypeIsBubbleBlasterShootShouldContainBubbles() {
        // Arrange
        Weapon weapon = new Weapon(BubbleBlaster, "nerf");
        // Act

        // Assert
        assertThat(weapon.shoot(), containsString("Bubbles..."));

    }

    @Test
    @DisplayName("check that if weaponType is LaserGun shoot should contain 'Zing!!'")
    void checkThatIfWeaponTypeIsLaserGunShootShouldContainZing() {
        // Arrange
        Weapon weapon = new Weapon(LaserGun, "nerf");
        // Act

        // Assert
        assertThat(weapon.shoot(), containsString("Zing!!"));

    }
}
