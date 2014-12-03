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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a> extension.
 * 
 * <p>This extension adds two new vertex attribute data formats: a signed 2.10.10.10 and an unsigned 2.10.10.10 vertex data format. These vertex data formats
 * describe a 4 component stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex
 * attributes can often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBVertexType2_10_10_10_REV {

	/**
	 * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
	 * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
	 */
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

	/** Function address. */
	@JavadocExclude
	public final long
		VertexP2ui,
		VertexP3ui,
		VertexP4ui,
		VertexP2uiv,
		VertexP3uiv,
		VertexP4uiv,
		TexCoordP1ui,
		TexCoordP2ui,
		TexCoordP3ui,
		TexCoordP4ui,
		TexCoordP1uiv,
		TexCoordP2uiv,
		TexCoordP3uiv,
		TexCoordP4uiv,
		MultiTexCoordP1ui,
		MultiTexCoordP2ui,
		MultiTexCoordP3ui,
		MultiTexCoordP4ui,
		MultiTexCoordP1uiv,
		MultiTexCoordP2uiv,
		MultiTexCoordP3uiv,
		MultiTexCoordP4uiv,
		NormalP3ui,
		NormalP3uiv,
		ColorP3ui,
		ColorP4ui,
		ColorP3uiv,
		ColorP4uiv,
		SecondaryColorP3ui,
		SecondaryColorP3uiv,
		VertexAttribP1ui,
		VertexAttribP2ui,
		VertexAttribP3ui,
		VertexAttribP4ui,
		VertexAttribP1uiv,
		VertexAttribP2uiv,
		VertexAttribP3uiv,
		VertexAttribP4uiv;

	@JavadocExclude
	public ARBVertexType2_10_10_10_REV(FunctionProvider provider, boolean fc) {
		VertexP2ui = GL.getFunctionAddress(provider, "glVertexP2ui", fc);
		VertexP3ui = GL.getFunctionAddress(provider, "glVertexP3ui", fc);
		VertexP4ui = GL.getFunctionAddress(provider, "glVertexP4ui", fc);
		VertexP2uiv = provider.getFunctionAddress("glVertexP2uiv");
		VertexP3uiv = provider.getFunctionAddress("glVertexP3uiv");
		VertexP4uiv = provider.getFunctionAddress("glVertexP4uiv");
		TexCoordP1ui = GL.getFunctionAddress(provider, "glTexCoordP1ui", fc);
		TexCoordP2ui = GL.getFunctionAddress(provider, "glTexCoordP2ui", fc);
		TexCoordP3ui = GL.getFunctionAddress(provider, "glTexCoordP3ui", fc);
		TexCoordP4ui = GL.getFunctionAddress(provider, "glTexCoordP4ui", fc);
		TexCoordP1uiv = provider.getFunctionAddress("glTexCoordP1uiv");
		TexCoordP2uiv = provider.getFunctionAddress("glTexCoordP2uiv");
		TexCoordP3uiv = provider.getFunctionAddress("glTexCoordP3uiv");
		TexCoordP4uiv = provider.getFunctionAddress("glTexCoordP4uiv");
		MultiTexCoordP1ui = GL.getFunctionAddress(provider, "glMultiTexCoordP1ui", fc);
		MultiTexCoordP2ui = GL.getFunctionAddress(provider, "glMultiTexCoordP2ui", fc);
		MultiTexCoordP3ui = GL.getFunctionAddress(provider, "glMultiTexCoordP3ui", fc);
		MultiTexCoordP4ui = GL.getFunctionAddress(provider, "glMultiTexCoordP4ui", fc);
		MultiTexCoordP1uiv = provider.getFunctionAddress("glMultiTexCoordP1uiv");
		MultiTexCoordP2uiv = provider.getFunctionAddress("glMultiTexCoordP2uiv");
		MultiTexCoordP3uiv = provider.getFunctionAddress("glMultiTexCoordP3uiv");
		MultiTexCoordP4uiv = provider.getFunctionAddress("glMultiTexCoordP4uiv");
		NormalP3ui = provider.getFunctionAddress("glNormalP3ui");
		NormalP3uiv = provider.getFunctionAddress("glNormalP3uiv");
		ColorP3ui = provider.getFunctionAddress("glColorP3ui");
		ColorP4ui = provider.getFunctionAddress("glColorP4ui");
		ColorP3uiv = provider.getFunctionAddress("glColorP3uiv");
		ColorP4uiv = provider.getFunctionAddress("glColorP4uiv");
		SecondaryColorP3ui = provider.getFunctionAddress("glSecondaryColorP3ui");
		SecondaryColorP3uiv = provider.getFunctionAddress("glSecondaryColorP3uiv");
		VertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
		VertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
		VertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
		VertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
		VertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
		VertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
		VertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
		VertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexType2_10_10_10_REV} instance for the current context. */
	public static ARBVertexType2_10_10_10_REV getInstance() {
		return GL.getCapabilities().__ARBVertexType2_10_10_10_REV;
	}

	static ARBVertexType2_10_10_10_REV create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("GL_ARB_vertex_type_2_10_10_10_rev") ) return null;

		ARBVertexType2_10_10_10_REV funcs = new ARBVertexType2_10_10_10_REV(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.VertexP2ui, funcs.VertexP3ui, funcs.VertexP4ui, funcs.TexCoordP1ui, funcs.TexCoordP2ui, funcs.TexCoordP3ui, funcs.TexCoordP4ui, 
			funcs.MultiTexCoordP1ui, funcs.MultiTexCoordP2ui, funcs.MultiTexCoordP3ui, funcs.MultiTexCoordP4ui
		)) && checkFunctions(
			funcs.VertexP2uiv, funcs.VertexP3uiv, funcs.VertexP4uiv, funcs.TexCoordP1uiv, funcs.TexCoordP2uiv, funcs.TexCoordP3uiv, funcs.TexCoordP4uiv, 
			funcs.MultiTexCoordP1uiv, funcs.MultiTexCoordP2uiv, funcs.MultiTexCoordP3uiv, funcs.MultiTexCoordP4uiv, funcs.NormalP3ui, funcs.NormalP3uiv, 
			funcs.ColorP3ui, funcs.ColorP4ui, funcs.ColorP3uiv, funcs.ColorP4uiv, funcs.SecondaryColorP3ui, funcs.SecondaryColorP3uiv, funcs.VertexAttribP1ui, 
			funcs.VertexAttribP2ui, funcs.VertexAttribP3ui, funcs.VertexAttribP4ui, funcs.VertexAttribP1uiv, funcs.VertexAttribP2uiv, funcs.VertexAttribP3uiv, 
			funcs.VertexAttribP4uiv
		);

		return GL.checkExtension("GL_ARB_vertex_type_2_10_10_10_rev", funcs, supported);
	}

	// --- [ glVertexP2ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex2f Vertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		long __functionAddress = getInstance().VertexP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP2ui(type, value, __functionAddress);
	}

	// --- [ glVertexP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex3f Vertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		long __functionAddress = getInstance().VertexP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP3ui(type, value, __functionAddress);
	}

	// --- [ glVertexP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glVertex4f Vertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		long __functionAddress = getInstance().VertexP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP4ui(type, value, __functionAddress);
	}

	// --- [ glVertexP2uiv ] ---

	/** Unsafe version of {@link #glVertexP2ui(int, ByteBuffer) VertexP2ui} */
	@JavadocExclude
	public static void nglVertexP2uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP2uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP2uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP2ui(int, ByteBuffer) VertexP2ui} */
	public static void glVertexP2u(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP2uiv(type, memAddress(value));
	}

	// --- [ glVertexP3uiv ] ---

	/** Unsafe version of {@link #glVertexP3ui(int, ByteBuffer) VertexP3ui} */
	@JavadocExclude
	public static void nglVertexP3uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP3uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP3uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP3ui(int, ByteBuffer) VertexP3ui} */
	public static void glVertexP3u(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP3uiv(type, memAddress(value));
	}

	// --- [ glVertexP4uiv ] ---

	/** Unsafe version of {@link #glVertexP4ui(int, ByteBuffer) VertexP4ui} */
	@JavadocExclude
	public static void nglVertexP4uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexP4uiv(type, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP4uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP4ui(int, ByteBuffer) VertexP4ui} */
	public static void glVertexP4u(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP4uiv(type, memAddress(value));
	}

	// --- [ glTexCoordP1ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP1ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP2ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP2ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP3ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP4ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP1uiv ] ---

	/** Unsafe version of {@link #glTexCoordP1ui(int, ByteBuffer) TexCoordP1ui} */
	@JavadocExclude
	public static void nglTexCoordP1uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP1uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP1ui(int, ByteBuffer) TexCoordP1ui} */
	public static void glTexCoordP1u(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP2uiv ] ---

	/** Unsafe version of {@link #glTexCoordP2ui(int, ByteBuffer) TexCoordP2ui} */
	@JavadocExclude
	public static void nglTexCoordP2uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP2uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP2ui(int, ByteBuffer) TexCoordP2ui} */
	public static void glTexCoordP2u(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP3uiv ] ---

	/** Unsafe version of {@link #glTexCoordP3ui(int, ByteBuffer) TexCoordP3ui} */
	@JavadocExclude
	public static void nglTexCoordP3uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP3uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP3ui(int, ByteBuffer) TexCoordP3ui} */
	public static void glTexCoordP3u(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP4uiv ] ---

	/** Unsafe version of {@link #glTexCoordP4ui(int, ByteBuffer) TexCoordP4ui} */
	@JavadocExclude
	public static void nglTexCoordP4uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglTexCoordP4uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP4ui(int, ByteBuffer) TexCoordP4ui} */
	public static void glTexCoordP4u(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP1ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP2ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP3ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/**
	 * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP4ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP1ui(int, int, ByteBuffer) MultiTexCoordP1ui} */
	@JavadocExclude
	public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP1uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP1ui(int, int, ByteBuffer) MultiTexCoordP1ui} */
	public static void glMultiTexCoordP1u(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP2ui(int, int, ByteBuffer) MultiTexCoordP2ui} */
	@JavadocExclude
	public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP2uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP2ui(int, int, ByteBuffer) MultiTexCoordP2ui} */
	public static void glMultiTexCoordP2u(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP3ui(int, int, ByteBuffer) MultiTexCoordP3ui} */
	@JavadocExclude
	public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP3uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP3ui(int, int, ByteBuffer) MultiTexCoordP3ui} */
	public static void glMultiTexCoordP3u(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/** Unsafe version of {@link #glMultiTexCoordP4ui(int, int, ByteBuffer) MultiTexCoordP4ui} */
	@JavadocExclude
	public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglMultiTexCoordP4uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP4ui(int, int, ByteBuffer) MultiTexCoordP4ui} */
	public static void glMultiTexCoordP4u(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	// --- [ glNormalP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glNormal3f Normal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		long __functionAddress = getInstance().NormalP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglNormalP3ui(type, coords, __functionAddress);
	}

	// --- [ glNormalP3uiv ] ---

	/** Unsafe version of {@link #glNormalP3ui(int, ByteBuffer) NormalP3ui} */
	@JavadocExclude
	public static void nglNormalP3uiv(int type, long coords) {
		long __functionAddress = getInstance().NormalP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglNormalP3uiv(type, coords, __functionAddress);
	}

	/**
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglNormalP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glNormalP3ui(int, ByteBuffer) NormalP3ui} */
	public static void glNormalP3u(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglNormalP3uiv(type, memAddress(coords));
	}

	// --- [ glColorP3ui ] ---

	/**
	 * Packed component version of {@link GL11#glColor3f Color3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		long __functionAddress = getInstance().ColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP3ui(type, color, __functionAddress);
	}

	// --- [ glColorP4ui ] ---

	/**
	 * Packed component version of {@link GL11#glColor4f Color4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		long __functionAddress = getInstance().ColorP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP4ui(type, color, __functionAddress);
	}

	// --- [ glColorP3uiv ] ---

	/** Unsafe version of {@link #glColorP3ui(int, ByteBuffer) ColorP3ui} */
	@JavadocExclude
	public static void nglColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP3ui(int, ByteBuffer) ColorP3ui} */
	public static void glColorP3u(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP3uiv(type, memAddress(color));
	}

	// --- [ glColorP4uiv ] ---

	/** Unsafe version of {@link #glColorP4ui(int, ByteBuffer) ColorP4ui} */
	@JavadocExclude
	public static void nglColorP4uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglColorP4uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP4uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP4ui(int, ByteBuffer) ColorP4ui} */
	public static void glColorP4u(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP4uiv(type, memAddress(color));
	}

	// --- [ glSecondaryColorP3ui ] ---

	/**
	 * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		long __functionAddress = getInstance().SecondaryColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglSecondaryColorP3ui(type, color, __functionAddress);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/** Unsafe version of {@link #glSecondaryColorP3ui(int, ByteBuffer) SecondaryColorP3ui} */
	@JavadocExclude
	public static void nglSecondaryColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().SecondaryColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglSecondaryColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glSecondaryColorP3ui(int, ByteBuffer) SecondaryColorP3ui} */
	public static void glSecondaryColorP3u(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	// --- [ glVertexAttribP1ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP1ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP2ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP2ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP3ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP3ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP4ui ] ---

	/**
	 * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP4ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP1ui(int, int, boolean, ByteBuffer) VertexAttribP1ui} */
	@JavadocExclude
	public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP1uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP1ui(int, int, boolean, ByteBuffer) VertexAttribP1ui} */
	public static void glVertexAttribP1u(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP2uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP2ui(int, int, boolean, ByteBuffer) VertexAttribP2ui} */
	@JavadocExclude
	public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP2uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP2ui(int, int, boolean, ByteBuffer) VertexAttribP2ui} */
	public static void glVertexAttribP2u(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP3uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP3ui(int, int, boolean, ByteBuffer) VertexAttribP3ui} */
	@JavadocExclude
	public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP3uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP3ui(int, int, boolean, ByteBuffer) VertexAttribP3ui} */
	public static void glVertexAttribP3u(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP4uiv ] ---

	/** Unsafe version of {@link #glVertexAttribP4ui(int, int, boolean, ByteBuffer) VertexAttribP4ui} */
	@JavadocExclude
	public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL33.nglVertexAttribP4uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP4ui(int, int, boolean, ByteBuffer) VertexAttribP4ui} */
	public static void glVertexAttribP4u(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

}