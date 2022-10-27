/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.example.android.unscramble

import android.content.Intent
import android.os.Bundle

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Creates an Activity that hosts the Game fragment in the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        //These are two buttons of home page
        val gameButton:Button = findViewById(R.id.game_button);
        val learnButton:Button = findViewById(R.id.learn_button);

        gameButton.setOnClickListener(){
            val intent = Intent(this,GamePage::class.java);
            this.startActivity(intent);
        }

        learnButton.setOnClickListener {
            val intent = Intent(this,LearnPage::class.java);
            this.startActivity(intent);
        }









    }
}