/*
 * Copyright (C) 2014 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.javawriter;

public final class ArrayTypeName implements TypeName {
  private final TypeName componentType;

  ArrayTypeName(TypeName componentType) {
    this.componentType = componentType;
  }

  public TypeName componentType() {
    return componentType;
  }

  @Override public boolean equals(Object obj) {
    return (obj instanceof ArrayTypeName)
        & this.componentType.equals(((ArrayTypeName) obj).componentType);
  }

  @Override public int hashCode() {
    return componentType.hashCode();
  }

  public static ArrayTypeName create(TypeName componentType) {
    return new ArrayTypeName(componentType);
  }
}
