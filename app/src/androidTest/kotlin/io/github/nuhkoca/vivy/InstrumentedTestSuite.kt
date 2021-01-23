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
package io.github.nuhkoca.vivy

import io.github.nuhkoca.vivy.db.VivyDBTest
import io.github.nuhkoca.vivy.ui.MainActivityTest
import io.github.nuhkoca.vivy.ui.doctors.DoctorsFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * An instrumented test suite to execute all the test classes under this module.
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    VivyDBTest::class,
    DoctorsFragmentTest::class,
    MainActivityTest::class
)
object InstrumentedTestSuite
