/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/INTEL/swap_event.txt">GLX_INTEL_swap_event</a> extension.
 * <p/>
 * This extension adds a new event type, {@link #GLX_BUFFER_SWAP_COMPLETE_INTEL}, which is sent to the client via the X11 event stream and
 * selected/consumed by the normal GLX event mask mechanisms, to indicate when a previously queued swap has completed.
 */
public final class GLXINTELSwapEvent {

	/** Accepted by the {@code mask} parameter of {@link GLX13#glXSelectEvent} and returned in the {@code mask} parameter of {@link GLX13#glXGetSelectedEvent}: */
	public static final int
		GLX_BUFFER_SWAP_COMPLETE_INTEL_MASK = 0x4000000;

	/** Returned in the {@code event_type} field of a "swap complete" event: */
	public static final int
		GLX_EXCHANGE_COMPLETE_INTEL = 0x8180,
		GLX_COPY_COMPLETE_INTEL     = 0x8181,
		GLX_FLIP_COMPLETE_INTEL     = 0x8182;

	private GLXINTELSwapEvent() {}

}