/*---------------------------------------------------------------------------------------------
 * Copyright (c) 2020 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *--------------------------------------------------------------------------------------------*/

package org.eclipse.gemoc.trace.metp.addonbased.server.metp.services;

import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.gemoc.trace.metp.addonbased.server.metp.data.*;

/** Client interface for the model execution trace protocol.
	Auto-generated from json schema. Do not edit manually.
*/
public interface  IModelExecutionTraceProtocolClient {

	/** Event message for 'statesAdded' event type.
		The event indicates that some states habe been added to the trace
	*/
	@JsonNotification
	default void statesAdded(StatesAddedEventArguments args) {
		throw new UnsupportedOperationException();
	}

	/** Event message for 'stepsStarted' event type.
		The event indicates that some states have started
	*/
	@JsonNotification
	default void stepsStarted(StepsStartedEventArguments args) {
		throw new UnsupportedOperationException();
	}

	/** Event message for 'stepsEnded' event type.
		The event indicates that some states have ended
	*/
	@JsonNotification
	default void stepsEnded(StepsEndedEventArguments args) {
		throw new UnsupportedOperationException();
	}

	/** Event message for 'valuesAdded' event type.
		The event indicates that values have been added
	*/
	@JsonNotification
	default void valuesAdded(ValuesAddedEventArguments args) {
		throw new UnsupportedOperationException();
	}

	/** Event message for 'dimensionsAdded' event type.
		The event indicates that dimensions have been added
	*/
	@JsonNotification
	default void dimensionsAdded(DimensionsAddedEventArguments args) {
		throw new UnsupportedOperationException();
	}
}

