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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/texture_from_pixmap.txt">GLX_EXT_texture_from_pixmap</a> extension.
 * <p/>
 * This extension allows a color buffer to be used for both rendering and texturing.
 */
public final class GLXEXTTextureFromPixmap {

	/** Accepted by the {@code attribute} parameter of {@link GLX13#glXGetFBConfigAttrib} and the {@code attrib_list} parameter of {@link GLX13#glXChooseFBConfig}: */
	public static final int
		GLX_BIND_TO_TEXTURE_RGB_EXT     = 0x20D0,
		GLX_BIND_TO_TEXTURE_RGBA_EXT    = 0x20D1,
		GLX_BIND_TO_MIPMAP_TEXTURE_EXT  = 0x20D2,
		GLX_BIND_TO_TEXTURE_TARGETS_EXT = 0x20D3,
		GLX_Y_INVERTED_EXT              = 0x20D4;

	/** Accepted as an attribute in the {@code attrib_list} parameter of {@link GLX13#glXCreatePixmap}, and by the {@code attribute} parameter of {@link GLX13#glXQueryDrawable}: */
	public static final int
		GLX_TEXTURE_FORMAT_EXT = 0x20D5,
		GLX_TEXTURE_TARGET_EXT = 0x20D6,
		GLX_MIPMAP_TEXTURE_EXT = 0x20D7;

	/**
	 * Accepted as a value in the {@code attrib_list} parameter of {@link GLX13#glXCreatePixmap} and returned in the {@code value} parameter of
	 * {@link GLX13#glXQueryDrawable} when {@code attribute} is {@link #GLX_TEXTURE_FORMAT_EXT}:
	 */
	public static final int
		GLX_TEXTURE_FORMAT_NONE_EXT = 0x20D8,
		GLX_TEXTURE_FORMAT_RGB_EXT  = 0x20D9,
		GLX_TEXTURE_FORMAT_RGBA_EXT = 0x20DA;

	/** Accepted as bits in the {@link #GLX_BIND_TO_TEXTURE_TARGETS_EXT} variable: */
	public static final int
		GLX_TEXTURE_1D_BIT_EXT        = 0x1,
		GLX_TEXTURE_2D_BIT_EXT        = 0x2,
		GLX_TEXTURE_RECTANGLE_BIT_EXT = 0x4;

	/**
	 * Accepted as a value in the {@code attrib_list} parameter of {@link GLX13#glXCreatePixmap} and returned in the {@code value} parameter of
	 * {@link GLX13#glXQueryDrawable} when {@code attribute} is {@link #GLX_TEXTURE_TARGET_EXT}:
	 */
	public static final int
		GLX_TEXTURE_1D_EXT        = 0x20DB,
		GLX_TEXTURE_2D_EXT        = 0x20DC,
		GLX_TEXTURE_RECTANGLE_EXT = 0x20DD;

	/** Accepted by the {@code buffer} parameter of {@link #glXBindTexImageEXT} and {@link #glXReleaseTexImageEXT}: */
	public static final int
		GLX_FRONT_LEFT_EXT  = 0x20DE,
		GLX_FRONT_RIGHT_EXT = 0x20DF,
		GLX_BACK_LEFT_EXT   = 0x20E0,
		GLX_BACK_RIGHT_EXT  = 0x20E1,
		GLX_FRONT_EXT       = GLX_FRONT_LEFT_EXT,
		GLX_BACK_EXT        = GLX_BACK_LEFT_EXT,
		GLX_AUX0_EXT        = 0x20E2,
		GLX_AUX1_EXT        = 0x20E3,
		GLX_AUX2_EXT        = 0x20E4,
		GLX_AUX3_EXT        = 0x20E5,
		GLX_AUX4_EXT        = 0x20E6,
		GLX_AUX5_EXT        = 0x20E7,
		GLX_AUX6_EXT        = 0x20E8,
		GLX_AUX7_EXT        = 0x20E9,
		GLX_AUX8_EXT        = 0x20EA,
		GLX_AUX9_EXT        = 0x20EB;

	private GLXEXTTextureFromPixmap() {}

	// --- [ glXBindTexImageEXT ] ---

	/** JNI method for {@link #glXBindTexImageEXT} */
	public static native void nglXBindTexImageEXT(long display, long drawable, int buffer, long attrib_list, long __functionAddress);

	/**
	 * Defines a one- or two-dimensional texture image. The texture image is taken from {@code buffer} and need not be copied. The texture target, the texture
	 * format, and the size of the texture components are derived from attributes of {@code drawable}.
	 *
	 * @param display     the connection to the X server
	 * @param drawable    the drawable
	 * @param buffer      the buffer
	 * @param attrib_list an optional null-terminated list of attributes
	 */
	public static void glXBindTexImageEXT(long display, long drawable, int buffer, ByteBuffer attrib_list) {
		long __functionAddress = getInstance().glXBindTexImageEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
			if ( attrib_list != null ) checkNT4(attrib_list);
		}
		nglXBindTexImageEXT(display, drawable, buffer, memAddressSafe(attrib_list), __functionAddress);
	}

	/** Alternative version of: {@link #glXBindTexImageEXT} */
	public static void glXBindTexImageEXT(long display, long drawable, int buffer, IntBuffer attrib_list) {
		long __functionAddress = getInstance().glXBindTexImageEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
			if ( attrib_list != null ) checkNT(attrib_list);
		}
		nglXBindTexImageEXT(display, drawable, buffer, memAddressSafe(attrib_list), __functionAddress);
	}

	// --- [ glXReleaseTexImageEXT ] ---

	/** JNI method for {@link #glXReleaseTexImageEXT} */
	public static native void nglXReleaseTexImageEXT(long display, long drawable, int buffer, long __functionAddress);

	/**
	 * Releases a color buffer that is being used as a texture.
	 *
	 * @param display  the connection to the X server
	 * @param drawable the drawable
	 * @param buffer   the buffer
	 */
	public static void glXReleaseTexImageEXT(long display, long drawable, int buffer) {
		long __functionAddress = getInstance().glXReleaseTexImageEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(drawable);
		}
		nglXReleaseTexImageEXT(display, drawable, buffer, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXEXTTextureFromPixmap;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_EXT_texture_from_pixmap") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXBindTexImageEXT) &&
			GL.isFunctionSupported(funcs.glXReleaseTexImageEXT);

		return GL.checkExtension("GLX_EXT_texture_from_pixmap", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXEXTTextureFromPixmap}. */
	public static final class Functions implements FunctionMap {

		public final long
			glXBindTexImageEXT,
			glXReleaseTexImageEXT;

		public Functions(FunctionProvider provider) {
			glXBindTexImageEXT = provider.getFunctionAddress("glXBindTexImageEXT");
			glXReleaseTexImageEXT = provider.getFunctionAddress("glXReleaseTexImageEXT");
		}

	}

}