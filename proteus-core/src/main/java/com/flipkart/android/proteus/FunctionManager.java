/*
 * Copyright 2019 Flipkart Internet Pvt. Ltd.
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

package com.flipkart.android.proteus;

import android.support.annotation.NonNull;

import java.util.Map;

/**
 * FunctionManager
 *
 * @author adityasharat
 */
public class FunctionManager {

  @NonNull
  private final Map<String, Function> functions;

  public FunctionManager(@NonNull Map<String, Function> functions) {
    this.functions = functions;
  }

  @NonNull
  public Function get(@NonNull String name) {
    Function function = functions.get(name);
    if (function == null) {
      function = Function.NOOP;
    }
    return function;
  }
}
