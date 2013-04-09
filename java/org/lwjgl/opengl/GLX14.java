/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/** Native bindings to GLX 1.4. */
public final class GLX14 {

	/** Added in GLX 1.4: */
	public static final int
		GLX_SAMPLE_BUFFERS = 0x186A0,
		GLX_SAMPLES        = 0x186A1;

	private GLX14() {}

	// --- [ glXGetProcAddress ] ---

	/** JNI method for {@link #glXGetProcAddress} */
	public static native long nglXGetProcAddress(long procName, long __functionAddress);

	/**
	 * Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
	 * extension function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
	 * implementation.
	 * <p/>
	 * A non-{@code NULL} return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
	 * also query {@link GL11.glGetString}({@link GL11.GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString} to determine if an extension is supported
	 * by a particular context.
	 * <p/>
	 * GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which
	 * supports the extension.
	 * <p/>
	 * {@code glXGetProcAddress} may be queried for all of the following functions:
	 * <ul>
	 * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
	 * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
	 * implementation, as determined by {@link GL11.glGetString}({@link GL11.GL_VERSION}) and {@link GLX#glXQueryVersion} queries.</li>
	 * </ul>
	 *
	 * @param procName the function name to query
	 */
	public static long glXGetProcAddress(ByteBuffer procName) {
		long __functionAddress = getInstance().glXGetProcAddress;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetProcAddress(memAddress(procName), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLX14;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX14") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glXGetProcAddress);

		return GL.checkExtension("GLX14", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLX14}. */
	public static final class Functions implements FunctionMap {

		public final long glXGetProcAddress;

		public Functions(FunctionProvider provider) {
			glXGetProcAddress = provider.getFunctionAddress("glXGetProcAddress");
		}

	}

}