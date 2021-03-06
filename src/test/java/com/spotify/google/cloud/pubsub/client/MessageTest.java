/*
 * Copyright (c) 2011-2015 Spotify AB
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

package com.spotify.google.cloud.pubsub.client;

import com.google.common.io.BaseEncoding;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MessageTest {

  @Test
  public void testOf() throws Exception {
    final String encoded = BaseEncoding.base64().encode("hello world".getBytes("UTF-8"));
    final Message message = Message.of(encoded);
    assertThat(message.data(), is(encoded));
  }

  @Test
  public void testOfEncoded() throws Exception {
    final String encoded = BaseEncoding.base64().encode("hello world".getBytes("UTF-8"));
    final Message message = Message.ofEncoded("hello world");
    assertThat(message.data(), is(encoded));
  }
}