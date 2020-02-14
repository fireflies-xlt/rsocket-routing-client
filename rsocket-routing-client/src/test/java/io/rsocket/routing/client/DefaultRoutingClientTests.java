/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rsocket.routing.client;

import io.rsocket.routing.common.Id;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultRoutingClientTests {

	private DefaultRoutingClient client;

	@BeforeEach
	public void setup() {
		client = new DefaultRoutingClient();
	}

	@Disabled
	@Test
	public void clientWorks() {
		assertThat(client.getConfig().getRouteId())
				.isEqualTo(Id.from("00000000-0000-0000-0000-000000000001"));
	}
}
