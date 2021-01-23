/*
 * Copyright (C) 2020. Nuh Koca. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.nuhkoca.vivy.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.github.nuhkoca.vivy.R

/**
 * Robot pattern to verify [MainActivity]'s assertions in [MainActivityTest]
 *
 * Credit: https://academy.realm.io/posts/kau-jake-wharton-testing-robots/
 */
fun launchMain(func: MainActivityRobot.() -> Unit) = MainActivityRobot().apply { func() }

/**
 * A robot that includes [MainActivityTest]'s assertions.
 */
class MainActivityRobot {

    fun verifyToolbar() {
        onView(withId(R.id.toolbar)).check(matches(isDisplayed()))
    }
}
