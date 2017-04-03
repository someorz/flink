/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.graph.types.valuearray;

import org.apache.flink.api.common.typeutils.ComparatorTestBase;
import org.apache.flink.api.common.typeutils.TypeComparator;
import org.apache.flink.api.common.typeutils.TypeSerializer;
import org.apache.flink.types.LongValue;

public class LongValueArrayComparatorTest extends ComparatorTestBase<LongValueArray> {

	@Override
	protected TypeComparator<LongValueArray> createComparator(boolean ascending) {
		return new LongValueArrayComparator(ascending);
	}

	@Override
	protected TypeSerializer<LongValueArray> createSerializer() {
		return new LongValueArraySerializer();
	}

	@Override
	protected LongValueArray[] getSortedTestData() {
		LongValueArray lva0 = new LongValueArray();

		LongValueArray lva1 = new LongValueArray();
		lva1.add(new LongValue(5));

		LongValueArray lva2 = new LongValueArray();
		lva2.add(new LongValue(50));
		lva2.add(new LongValue(100));

		return new LongValueArray[]{ lva0, lva1, lva2 };
	}
}