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
package io.github.nuhkoca.vivy.shared.reader

import java.io.IOException

/**
 * A helper class to read specific file from resources directory.
 */
object AssetReader {

    /**
     * Reads and returns content as [String]
     *
     * @param fileName the file name
     *
     * @return [String]
     *
     * @throws IOException
     */
    @Throws(IOException::class)
    @JvmStatic
    fun getJsonDataFromAsset(fileName: String): String? {
        val jsonString: String?
        try {
            jsonString = javaClass.classLoader?.getResourceAsStream(fileName)
                ?.bufferedReader()
                ?.use { it.readText() }
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
        return jsonString
    }
}
