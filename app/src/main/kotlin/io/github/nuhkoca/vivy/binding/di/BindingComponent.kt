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
package io.github.nuhkoca.vivy.binding.di

import androidx.databinding.DataBindingComponent
import dagger.Subcomponent
import io.github.nuhkoca.vivy.binding.adapters.ImageBindingAdapter
import io.github.nuhkoca.vivy.binding.adapters.TextBindingAdapter

@BindingScope
@Subcomponent(modules = [BindingModule::class])
interface BindingComponent : DataBindingComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): BindingComponent
    }

    override fun getImageBindingAdapter(): ImageBindingAdapter

    override fun getTextBindingAdapter(): TextBindingAdapter
}
