/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include "OpenGL.h"
#include "GLX.h"

typedef void * (APIENTRY *glXGetProcAddressPROC) (const GLubyte *);

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GLX14_nglXGetProcAddress(JNIEnv *__env, jclass clazz, jlong procNameAddress, jlong __functionAddress) {
	const GLubyte *procName = (const GLubyte *)(intptr_t)procNameAddress;
	glXGetProcAddressPROC glXGetProcAddress = (glXGetProcAddressPROC)(intptr_t)__functionAddress;
	return (jlong)(intptr_t)glXGetProcAddress(procName);
}