/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core OpenCL 1.0 functionality. */
public final class CL10 {

	/** Error Codes */
	public static final int
		CL_SUCCESS                         = 0x0,
		CL_DEVICE_NOT_FOUND                = -1,
		CL_DEVICE_NOT_AVAILABLE            = -2,
		CL_COMPILER_NOT_AVAILABLE          = -3,
		CL_MEM_OBJECT_ALLOCATION_FAILURE   = -4,
		CL_OUT_OF_RESOURCES                = -5,
		CL_OUT_OF_HOST_MEMORY              = -6,
		CL_PROFILING_INFO_NOT_AVAILABLE    = -7,
		CL_MEM_COPY_OVERLAP                = -8,
		CL_IMAGE_FORMAT_MISMATCH           = -9,
		CL_IMAGE_FORMAT_NOT_SUPPORTED      = -10,
		CL_BUILD_PROGRAM_FAILURE           = -11,
		CL_MAP_FAILURE                     = -12,
		CL_INVALID_VALUE                   = -30,
		CL_INVALID_DEVICE_TYPE             = -31,
		CL_INVALID_PLATFORM                = -32,
		CL_INVALID_DEVICE                  = -33,
		CL_INVALID_CONTEXT                 = -34,
		CL_INVALID_QUEUE_PROPERTIES        = -35,
		CL_INVALID_COMMAND_QUEUE           = -36,
		CL_INVALID_HOST_PTR                = -37,
		CL_INVALID_MEM_OBJECT              = -38,
		CL_INVALID_IMAGE_FORMAT_DESCRIPTOR = -39,
		CL_INVALID_IMAGE_SIZE              = -40,
		CL_INVALID_SAMPLER                 = -41,
		CL_INVALID_BINARY                  = -42,
		CL_INVALID_BUILD_OPTIONS           = -43,
		CL_INVALID_PROGRAM                 = -44,
		CL_INVALID_PROGRAM_EXECUTABLE      = -45,
		CL_INVALID_KERNEL_NAME             = -46,
		CL_INVALID_KERNEL_DEFINITION       = -47,
		CL_INVALID_KERNEL                  = -48,
		CL_INVALID_ARG_INDEX               = -49,
		CL_INVALID_ARG_VALUE               = -50,
		CL_INVALID_ARG_SIZE                = -51,
		CL_INVALID_KERNEL_ARGS             = -52,
		CL_INVALID_WORK_DIMENSION          = -53,
		CL_INVALID_WORK_GROUP_SIZE         = -54,
		CL_INVALID_WORK_ITEM_SIZE          = -55,
		CL_INVALID_GLOBAL_OFFSET           = -56,
		CL_INVALID_EVENT_WAIT_LIST         = -57,
		CL_INVALID_EVENT                   = -58,
		CL_INVALID_OPERATION               = -59,
		CL_INVALID_GL_OBJECT               = -60,
		CL_INVALID_BUFFER_SIZE             = -61,
		CL_INVALID_MIP_LEVEL               = -62,
		CL_INVALID_GLOBAL_WORK_SIZE        = -63;

	/** OpenCL Version */
	public static final int
		CL_VERSION_1_0 = 0x1;

	/** cl_bool */
	public static final int
		CL_FALSE = 0x0,
		CL_TRUE  = 0x1;

	/** cl_platform_info */
	public static final int
		CL_PLATFORM_PROFILE    = 0x900,
		CL_PLATFORM_VERSION    = 0x901,
		CL_PLATFORM_NAME       = 0x902,
		CL_PLATFORM_VENDOR     = 0x903,
		CL_PLATFORM_EXTENSIONS = 0x904;

	/** cl_device_type - bitfield */
	public static final int
		CL_DEVICE_TYPE_DEFAULT     = 1 << 0,
		CL_DEVICE_TYPE_CPU         = 1 << 1,
		CL_DEVICE_TYPE_GPU         = 1 << 2,
		CL_DEVICE_TYPE_ACCELERATOR = 1 << 3,
		CL_DEVICE_TYPE_ALL         = 0xFFFFFFFF;

	/** cl_device_info */
	public static final int
		CL_DEVICE_TYPE                          = 0x1000,
		CL_DEVICE_VENDOR_ID                     = 0x1001,
		CL_DEVICE_MAX_COMPUTE_UNITS             = 0x1002,
		CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS      = 0x1003,
		CL_DEVICE_MAX_WORK_GROUP_SIZE           = 0x1004,
		CL_DEVICE_MAX_WORK_ITEM_SIZES           = 0x1005,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR   = 0x1006,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT  = 0x1007,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_       = 0x1008,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG   = 0x1009,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT  = 0x100A,
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE = 0x100B,
		CL_DEVICE_MAX_CLOCK_FREQUENCY           = 0x100C,
		CL_DEVICE_ADDRESS_BITS                  = 0x100D,
		CL_DEVICE_MAX_READ_IMAGE_ARGS           = 0x100E,
		CL_DEVICE_MAX_WRITE_IMAGE_ARGS          = 0x100F,
		CL_DEVICE_MAX_MEM_ALLOC_SIZE            = 0x1010,
		CL_DEVICE_IMAGE2D_MAX_WIDTH             = 0x1011,
		CL_DEVICE_IMAGE2D_MAX_HEIGHT            = 0x1012,
		CL_DEVICE_IMAGE3D_MAX_WIDTH             = 0x1013,
		CL_DEVICE_IMAGE3D_MAX_HEIGHT            = 0x1014,
		CL_DEVICE_IMAGE3D_MAX_DEPTH             = 0x1015,
		CL_DEVICE_IMAGE_SUPPORT                 = 0x1016,
		CL_DEVICE_MAX_PARAMETER_SIZE            = 0x1017,
		CL_DEVICE_MAX_SAMPLERS                  = 0x1018,
		CL_DEVICE_MEM_BASE_ADDR_ALIGN           = 0x1019,
		CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE      = 0x101A,
		CL_DEVICE_SINGLE_FP_CONFIG              = 0x101B,
		CL_DEVICE_GLOBAL_MEM_CACHE_TYPE         = 0x101C,
		CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE     = 0x101D,
		CL_DEVICE_GLOBAL_MEM_CACHE_SIZE         = 0x101E,
		CL_DEVICE_GLOBAL_MEM_SIZE               = 0x101F,
		CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE      = 0x1020,
		CL_DEVICE_MAX_CONSTANT_ARGS             = 0x1021,
		CL_DEVICE_LOCAL_MEM_TYPE                = 0x1022,
		CL_DEVICE_LOCAL_MEM_SIZE                = 0x1023,
		CL_DEVICE_ERROR_CORRECTION_SUPPORT      = 0x1024,
		CL_DEVICE_PROFILING_TIMER_RESOLUTION    = 0x1025,
		CL_DEVICE_ENDIAN_LITTLE                 = 0x1026,
		CL_DEVICE_AVAILABLE                     = 0x1027,
		CL_DEVICE_COMPILER_AVAILABLE            = 0x1028,
		CL_DEVICE_EXECUTION_CAPABILITIES        = 0x1029,
		CL_DEVICE_QUEUE_PROPERTIES              = 0x102A,
		CL_DEVICE_NAME                          = 0x102B,
		CL_DEVICE_VENDOR                        = 0x102C,
		CL_DRIVER_VERSION                       = 0x102D,
		CL_DEVICE_PROFILE                       = 0x102E,
		CL_DEVICE_VERSION                       = 0x102F,
		CL_DEVICE_EXTENSIONS                    = 0x1030,
		CL_DEVICE_PLATFORM                      = 0x1031;

	/** cl_device_fp_config - bitfield */
	public static final int
		CL_FP_DENORM           = 1 << 0,
		CL_FP_INF_NAN          = 1 << 1,
		CL_FP_ROUND_TO_NEAREST = 1 << 2,
		CL_FP_ROUND_TO_ZERO    = 1 << 3,
		CL_FP_ROUND_TO_INF     = 1 << 4,
		CL_FP_FMA              = 1 << 5;

	/** cl_device_mem_cache_type */
	public static final int
		CL_NONE             = 0x0,
		CL_READ_ONLY_CACHE  = 0x1,
		CL_READ_WRITE_CACHE = 0x2;

	/** cl_device_local_mem_type */
	public static final int
		CL_LOCAL  = 0x1,
		CL_GLOBAL = 0x2;

	/** cl_device_exec_capabilities - bitfield */
	public static final int
		CL_EXEC_KERNEL        = 1 << 0,
		CL_EXEC_NATIVE_KERNEL = 1 << 1;

	/** cl_command_queue_properties - bitfield */
	public static final int
		CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = 1 << 0,
		CL_QUEUE_PROFILING_ENABLE              = 1 << 1;

	/** cl_context_info */
	public static final int
		CL_CONTEXT_REFERENCE_COUNT = 0x1080,
		CL_CONTEXT_DEVICES         = 0x1081,
		CL_CONTEXT_PROPERTIES      = 0x1082;

	/** cl_context_info + cl_context_properties */
	public static final int
		CL_CONTEXT_PLATFORM = 0x1084;

	/** cl_command_queue_info */
	public static final int
		CL_QUEUE_CONTEXT         = 0x1090,
		CL_QUEUE_DEVICE          = 0x1091,
		CL_QUEUE_REFERENCE_COUNT = 0x1092,
		CL_QUEUE_PROPERTIES      = 0x1093;

	/** cl_mem_flags - bitfield */
	public static final int
		CL_MEM_READ_WRITE     = 1 << 0,
		CL_MEM_WRITE_ONLY     = 1 << 1,
		CL_MEM_READ_ONLY      = 1 << 2,
		CL_MEM_USE_HOST_PTR   = 1 << 3,
		CL_MEM_ALLOC_HOST_PTR = 1 << 4,
		CL_MEM_COPY_HOST_PTR  = 1 << 5;

	/** cl_channel_order */
	public static final int
		CL_R         = 0x10B0,
		CL_A         = 0x10B1,
		CL_RG        = 0x10B2,
		CL_RA        = 0x10B3,
		CL_RGB       = 0x10B4,
		CL_RGBA      = 0x10B5,
		CL_BGRA      = 0x10B6,
		CL_ARGB      = 0x10B7,
		CL_INTENSITY = 0x10B8,
		CL_LUMINANCE = 0x10B9;

	/** cl_channel_type */
	public static final int
		CL_SNORM_INT8       = 0x10D0,
		CL_SNORM_INT16      = 0x10D1,
		CL_UNORM_INT8       = 0x10D2,
		CL_UNORM_INT16      = 0x10D3,
		CL_UNORM_SHORT_565  = 0x10D4,
		CL_UNORM_SHORT_555  = 0x10D5,
		CL_UNORM_INT_101010 = 0x10D6,
		CL_SIGNED_INT8      = 0x10D7,
		CL_SIGNED_INT16     = 0x10D8,
		CL_SIGNED_INT32     = 0x10D9,
		CL_UNSIGNED_INT8    = 0x10DA,
		CL_UNSIGNED_INT16   = 0x10DB,
		CL_UNSIGNED_INT32   = 0x10DC,
		CL_HALF_FLOAT       = 0x10DD,
		CL_FLOAT            = 0x10DE;

	/** cl_mem_object_type */
	public static final int
		CL_MEM_OBJECT_BUFFER  = 0x10F0,
		CL_MEM_OBJECT_IMAGE2D = 0x10F1,
		CL_MEM_OBJECT_IMAGE3D = 0x10F2;

	/** cl_mem_info */
	public static final int
		CL_MEM_TYPE            = 0x1100,
		CL_MEM_FLAGS           = 0x1101,
		CL_MEM_SIZE            = 0x1102,
		CL_MEM_HOST_PTR        = 0x1103,
		CL_MEM_MAP_COUNT       = 0x1104,
		CL_MEM_REFERENCE_COUNT = 0x1105,
		CL_MEM_CONTEXT         = 0x1106;

	/** cl_image_info */
	public static final int
		CL_IMAGE_FORMAT       = 0x1110,
		CL_IMAGE_ELEMENT_SIZE = 0x1111,
		CL_IMAGE_ROW_PITCH    = 0x1112,
		CL_IMAGE_SLICE_PITCH  = 0x1113,
		CL_IMAGE_WIDTH        = 0x1114,
		CL_IMAGE_HEIGHT       = 0x1115,
		CL_IMAGE_DEPTH        = 0x1116;

	/** cl_addressing_mode */
	public static final int
		CL_ADDRESS_NONE          = 0x1130,
		CL_ADDRESS_CLAMP_TO_EDGE = 0x1131,
		CL_ADDRESS_CLAMP         = 0x1132,
		CL_ADDRESS_REPEAT        = 0x1133;

	/** cl_filter_mode */
	public static final int
		CL_FILTER_NEAREST = 0x1140,
		CL_FILTER_LINEAR  = 0x1141;

	/** cl_sampler_info */
	public static final int
		CL_SAMPLER_REFERENCE_COUNT   = 0x1150,
		CL_SAMPLER_CONTEXT           = 0x1151,
		CL_SAMPLER_NORMALIZED_COORDS = 0x1152,
		CL_SAMPLER_ADDRESSING_MODE   = 0x1153,
		CL_SAMPLER_FILTER_MODE       = 0x1154;

	/** cl_map_flags - bitfield */
	public static final int
		CL_MAP_READ  = 1 << 0,
		CL_MAP_WRITE = 1 << 1;

	/** cl_program_info */
	public static final int
		CL_PROGRAM_REFERENCE_COUNT = 0x1160,
		CL_PROGRAM_CONTEXT         = 0x1161,
		CL_PROGRAM_NUM_DEVICES     = 0x1162,
		CL_PROGRAM_DEVICES         = 0x1163,
		CL_PROGRAM_SOURCE          = 0x1164,
		CL_PROGRAM_BINARY_SIZES    = 0x1165,
		CL_PROGRAM_BINARIES        = 0x1166;

	/** cl_program_build_info */
	public static final int
		CL_PROGRAM_BUILD_STATUS  = 0x1181,
		CL_PROGRAM_BUILD_OPTIONS = 0x1182,
		CL_PROGRAM_BUILD_LOG     = 0x1183;

	/** cl_build_status */
	public static final int
		CL_BUILD_SUCCESS     = 0x0,
		CL_BUILD_NONE        = 0xFFFFFFFF,
		CL_BUILD_ERROR       = 0xFFFFFFFE,
		CL_BUILD_IN_PROGRESS = 0xFFFFFFFD;

	/** cl_kernel_info */
	public static final int
		CL_KERNEL_FUNCTION_NAME   = 0x1190,
		CL_KERNEL_NUM_ARGS        = 0x1191,
		CL_KERNEL_REFERENCE_COUNT = 0x1192,
		CL_KERNEL_CONTEXT         = 0x1193,
		CL_KERNEL_PROGRAM         = 0x1194;

	/** cl_kernel_work_group_info */
	public static final int
		CL_KERNEL_WORK_GROUP_SIZE         = 0x11B0,
		CL_KERNEL_COMPILE_WORK_GROUP_SIZE = 0x11B1,
		CL_KERNEL_LOCAL_MEM_SIZE          = 0x11B2;

	/** cl_event_info */
	public static final int
		CL_EVENT_COMMAND_QUEUE            = 0x11D0,
		CL_EVENT_COMMAND_TYPE             = 0x11D1,
		CL_EVENT_REFERENCE_COUNT          = 0x11D2,
		CL_EVENT_COMMAND_EXECUTION_STATUS = 0x11D3;

	/** cl_command_type */
	public static final int
		CL_COMMAND_NDRANGE_KERNEL       = 0x11F0,
		CL_COMMAND_TASK                 = 0x11F1,
		CL_COMMAND_NATIVE_KERNEL        = 0x11F2,
		CL_COMMAND_READ_BUFFER          = 0x11F3,
		CL_COMMAND_WRITE_BUFFER         = 0x11F4,
		CL_COMMAND_COPY_BUFFER          = 0x11F5,
		CL_COMMAND_READ_IMAGE           = 0x11F6,
		CL_COMMAND_WRITE_IMAGE          = 0x11F7,
		CL_COMMAND_COPY_IMAGE           = 0x11F8,
		CL_COMMAND_COPY_IMAGE_TO_BUFFER = 0x11F9,
		CL_COMMAND_COPY_BUFFER_TO_IMAGE = 0x11FA,
		CL_COMMAND_MAP_BUFFER           = 0x11FB,
		CL_COMMAND_MAP_IMAGE            = 0x11FC,
		CL_COMMAND_UNMAP_MEM_OBJECT     = 0x11FD,
		CL_COMMAND_MARKER               = 0x11FE,
		CL_COMMAND_ACQUIRE_GL_OBJECTS   = 0x11FF,
		CL_COMMAND_RELEASE_GL_OBJECTS   = 0x1200;

	/** command execution status */
	public static final int
		CL_COMPLETE  = 0x0,
		CL_RUNNING   = 0x1,
		CL_SUBMITTED = 0x2,
		CL_QUEUED    = 0x3;

	/** cl_profiling_info */
	public static final int
		CL_PROFILING_COMMAND_QUEUED = 0x1280,
		CL_PROFILING_COMMAND_SUBMIT = 0x1281,
		CL_PROFILING_COMMAND_START  = 0x1282,
		CL_PROFILING_COMMAND_END    = 0x1283;

	private CL10() {}

	// --- [ clGetPlatformIDs ] ---

	/** JNI method for {@link #clGetPlatformIDs} */
	public static native int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms, long __functionAddress);

	/**
	 * Obtains the list of available platforms.
	 *
	 * @param num_entries   the number of {@code cl_platform_id} entries that can be added to {@code platforms}. If {@code platforms} is not {@code NULL}, the {@code num_entries} must
	 *                      be greater than zero.
	 * @param platforms     returns a list of OpenCL platforms found. The {@code cl_platform_id} values returned in {@code platforms} can be used to identify a specific OpenCL
	 *                      platform. If {@code platforms} argument is {@code NULL}, this argument is ignored. The number of OpenCL platforms returned is the minimum of the value
	 *                      specified by {@code num_entries} or the number of OpenCL platforms available.
	 * @param num_platforms returns the number of OpenCL platforms available. If {@code num_platforms} is {@code NULL}, this argument is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code num_entries} is equal to zero and {@code platforms} is not {@code NULL} or if both {@code num_platforms} and
	 *         {@code platforms} are {@code NULL}.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetPlatformIDs(int num_entries, ByteBuffer platforms, ByteBuffer num_platforms) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetPlatformIDs");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( platforms != null ) checkBuffer(platforms, num_entries << PointerBuffer.getPointerSizeShift());
			if ( num_platforms != null ) checkBuffer(num_platforms, 1 << 2);
		}
		return nclGetPlatformIDs(num_entries, memAddressSafe(platforms), memAddressSafe(num_platforms), __functionAddress);
	}

	/** Alternative version of: {@link #clGetPlatformIDs} */
	public static int clGetPlatformIDs(PointerBuffer platforms, IntBuffer num_platforms) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetPlatformIDs");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_platforms != null ) checkBuffer(num_platforms, 1);
		}
		return nclGetPlatformIDs(platforms == null ? 0 : platforms.remaining(), memAddressSafe(platforms), memAddressSafe(num_platforms), __functionAddress);
	}

	// --- [ clGetPlatformInfo ] ---

	/** JNI method for {@link #clGetPlatformInfo} */
	public static native int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns information about the given OpenCL platform.
	 *
	 * @param platform             the platform to query
	 * @param param_name           the parameter to query. One of:<p/>{@link #CL_PLATFORM_PROFILE}, {@link #CL_PLATFORM_VERSION}, {@link #CL_PLATFORM_NAME}, {@link #CL_PLATFORM_VENDOR}, {@link #CL_PLATFORM_EXTENSIONS}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          the memory location where appropriate values for a given {@code param_name} will be returned
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetPlatformInfo(CLPlatform platform, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(platform).clGetPlatformInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetPlatformInfo(platform.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetPlatformInfo} */
	public static int clGetPlatformInfo(CLPlatform platform, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(platform).clGetPlatformInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetPlatformInfo(platform.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetDeviceIDs ] ---

	/** JNI method for {@link #clGetDeviceIDs} */
	public static native int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices, long __functionAddress);

	/**
	 * Obtains the list of devices available on a platform.
	 *
	 * @param platform    the platform to query
	 * @param device_type a bitfield that identifies the type of OpenCL device. The {@code device_type} can be used to query specific OpenCL devices or all OpenCL devices
	 *                    available.
	 *                    . One of:<p/>{@link #CL_DEVICE_TYPE_DEFAULT}, {@link #CL_DEVICE_TYPE_CPU}, {@link #CL_DEVICE_TYPE_GPU}, {@link #CL_DEVICE_TYPE_ACCELERATOR}, {@link #CL_DEVICE_TYPE_ALL}, {@link CL12#CL_DEVICE_TYPE_CUSTOM}
	 * @param num_entries the number of {@code cl_device_id} entries that can be added to devices. If {@code devices} is not {@code NULL}, the {@code num_entries} must be greater
	 *                    than zero.
	 * @param devices     returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
	 *                    device. If {@code devices} argument is {@code NULL}, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified
	 *                    by {@code num_entries} or the number of OpenCL devices whose type matches {@code device_type}.
	 * @param num_devices returns the number of OpenCL devices available that match {@code device_type}. If {@code num_devices} is {@code NULL}, this argument is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
	 *         	<li>{@link #CL_INVALID_DEVICE_TYPE} if {@code device_type} is not a valid value.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code num_entries} is equal to zero and {@code devices} is not {@code NULL} or if both {@code num_devices} and {@code devices} are {@code NULL}.</li>
	 *         	<li>{@link #CL_DEVICE_NOT_FOUND} if no OpenCL devices that matched {@code device_type} were found.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetDeviceIDs(CLPlatform platform, long device_type, int num_entries, ByteBuffer devices, ByteBuffer num_devices) {
		long __functionAddress = getInstance(platform).clGetDeviceIDs;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( devices != null ) checkBuffer(devices, num_entries << PointerBuffer.getPointerSizeShift());
			if ( num_devices != null ) checkBuffer(num_devices, 1 << 2);
		}
		return nclGetDeviceIDs(platform.getPointer(), device_type, num_entries, memAddressSafe(devices), memAddressSafe(num_devices), __functionAddress);
	}

	/** Alternative version of: {@link #clGetDeviceIDs} */
	public static int clGetDeviceIDs(CLPlatform platform, long device_type, PointerBuffer devices, IntBuffer num_devices) {
		long __functionAddress = getInstance(platform).clGetDeviceIDs;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_devices != null ) checkBuffer(num_devices, 1);
		}
		return nclGetDeviceIDs(platform.getPointer(), device_type, devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddressSafe(num_devices), __functionAddress);
	}

	// --- [ clGetDeviceInfo ] ---

	/** JNI method for {@link #clGetDeviceInfo} */
	public static native int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs} or a sub-device created by
	 * {@link CL12#clCreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
	 *
	 * @param device               the device to query
	 * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<p/>{@link #CL_DEVICE_TYPE}, {@link #CL_DEVICE_VENDOR_ID}, {@link #CL_DEVICE_MAX_COMPUTE_UNITS}, {@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS}, {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE}, {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}, {@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}, {@link #CL_DEVICE_MAX_CLOCK_FREQUENCY}, {@link #CL_DEVICE_ADDRESS_BITS}, {@link #CL_DEVICE_MAX_READ_IMAGE_ARGS}, {@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS}, {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE}, {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT}, {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT}, {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH}, {@link #CL_DEVICE_IMAGE_SUPPORT}, {@link #CL_DEVICE_MAX_PARAMETER_SIZE}, {@link #CL_DEVICE_MAX_SAMPLERS}, {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN}, {@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}, {@link #CL_DEVICE_SINGLE_FP_CONFIG}, {@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE}, {@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE}, {@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE}, {@link #CL_DEVICE_GLOBAL_MEM_SIZE}, {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE}, {@link #CL_DEVICE_MAX_CONSTANT_ARGS}, {@link #CL_DEVICE_LOCAL_MEM_TYPE}, {@link #CL_DEVICE_LOCAL_MEM_SIZE}, {@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT}, {@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION}, {@link #CL_DEVICE_ENDIAN_LITTLE}, {@link #CL_DEVICE_AVAILABLE}, {@link #CL_DEVICE_COMPILER_AVAILABLE}, {@link #CL_DEVICE_EXECUTION_CAPABILITIES}, {@link #CL_DEVICE_QUEUE_PROPERTIES}, {@link #CL_DEVICE_NAME}, {@link #CL_DEVICE_VENDOR}, {@link #CL_DRIVER_VERSION}, {@link #CL_DEVICE_PROFILE}, {@link #CL_DEVICE_VERSION}, {@link #CL_DEVICE_EXTENSIONS}, {@link #CL_DEVICE_PLATFORM}, {@link CL11#DEVICE_PREFERRED_VECTOR_WIDTH_HALF}, {@link CL11#DEVICE_HOST_UNIFIED_MEMORY}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_CHAR}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_SHORT}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_INT}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_LONG}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}, {@link CL11#DEVICE_NATIVE_VECTOR_WIDTH_HALF}, {@link CL11#DEVICE_OPENCL_C_VERSION}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory location where appropriate values for a given {@code param_name} will be returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_DEVICE} if {@code device} is not valid.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
	 *         corresponding extension is not supported by the device.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetDeviceInfo(CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetDeviceInfo} */
	public static int clGetDeviceInfo(CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetDeviceInfo} */
	public static int clGetDeviceInfo(CLDevice device, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** LongBuffer version of: {@link #clGetDeviceInfo} */
	public static int clGetDeviceInfo(CLDevice device, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetDeviceInfo} */
	public static int clGetDeviceInfo(CLDevice device, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(device).clGetDeviceInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetDeviceInfo(device.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateContext ] ---

	/** JNI method for {@link #clCreateContext} */
	public static native long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL context. An OpenCL context is created with one or more devices. Contexts are used by the OpenCL runtime for managing objects such as
	 * command-queues, memory, program and kernel objects and for executing kernels on one or more devices specified in the context.
	 *
	 * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
	 *                    list is terminated with 0. <strong>LWJGL note</strong>: The {@link #CL_CONTEXT_PLATFORM} property must be present.
	 * @param num_devices the number of devices specified in the {@code devices} argument
	 * @param devices     a list of unique devices returned by {@link #clGetDeviceIDs} or sub-devices created by {@link CL12#clCreateSubDevices} for a platform
	 * @param pfn_notify  a callback function that can be registered by the application. This callback function will be used by the OpenCL implementation to report
	 *                    information on errors during context creation as well as errors that occur at runtime in this context. This callback function may be called
	 *                    asynchronously by the OpenCL implementation. It is the application’s responsibility to ensure that the callback function is thread-safe.
	 *                    <p/>
	 *                    If {@code pfn_notify} is {@code NULL}, no callback function is registered.
	 * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero context and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the context is created successfully. Otherwise, it returns a {@code NULL} value with the
	 *         following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_PLATFORM} if {@code properties} is {@code NULL} and no platform could be selected or if platform value specified in properties is not a
	 *         valid platform.</li>
	 *         	<li>{@link CL11#CL_INVALID_PROPERTY} if context property name in {@code properties} is not a supported property name, if the value specified for a supported
	 *         property name is not valid, or if the same property name is specified more than once.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code devices} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code num_devices} is equal to zero.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_DEVICE} if {@code devices} contains an invalid device.</li>
	 *         	<li>{@link #CL_DEVICE_NOT_AVAILABLE} if a device in {@code devices} is currently not available even though the device was returned by {@link #clGetDeviceIDs}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLContext clCreateContext(ByteBuffer properties, int num_devices, ByteBuffer devices, long pfn_notify, long user_data, ByteBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(devices, num_devices << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLContext.create(nclCreateContext(memAddress(properties), num_devices, memAddress(devices), pfn_notify, user_data, memAddressSafe(errcode_ret), __functionAddress), platform, user_data, isObject(pfn_notify));
	}

	/** Alternative version of: {@link #clCreateContext} */
	public static CLContext clCreateContext(PointerBuffer properties, PointerBuffer devices, CLContextCallback pfn_notify, IntBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long user_data = CLContextCallback.register(pfn_notify);
		return CLContext.create(nclCreateContext(memAddress(properties), devices.remaining(), memAddress(devices), pfn_notify == null ? 0L : CLContextCallback.CALLBACK, user_data, memAddressSafe(errcode_ret), __functionAddress), platform, user_data, isObject(pfn_notify));
	}

	/** Single value version of: {@link #clCreateContext} */
	public static CLContext clCreateContext(PointerBuffer properties, CLDevice device, CLContextCallback pfn_notify, IntBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int devices = __buffer.pointerParam();
		__buffer.pointerValue(devices, device);
		long user_data = CLContextCallback.register(pfn_notify);
		return CLContext.create(nclCreateContext(memAddress(properties), 1, __buffer.address() + devices, pfn_notify == null ? 0L : CLContextCallback.CALLBACK, user_data, memAddressSafe(errcode_ret), __functionAddress), platform, user_data, isObject(pfn_notify));
	}

	// --- [ clCreateContextFromType ] ---

	/** JNI method for {@link #clCreateContextFromType} */
	public static native long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret, long __functionAddress);

	/**
	 * Creates a context using devices of the specified type. See {@link #clCreateContext} for details.
	 *
	 * @param properties  a list of context property names and their corresponding values
	 * @param device_type a bit-field that identifies the type of device. One of:<p/>{@link #CL_DEVICE_TYPE_DEFAULT}, {@link #CL_DEVICE_TYPE_CPU}, {@link #CL_DEVICE_TYPE_GPU}, {@link #CL_DEVICE_TYPE_ACCELERATOR}, {@link #CL_DEVICE_TYPE_ALL}, {@link CL12#CL_DEVICE_TYPE_CUSTOM}
	 * @param pfn_notify  a callback function that can be registered by the application
	 * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static CLContext clCreateContextFromType(ByteBuffer properties, long device_type, long pfn_notify, long user_data, ByteBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContextFromType;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLContext.create(nclCreateContextFromType(memAddress(properties), device_type, pfn_notify, user_data, memAddressSafe(errcode_ret), __functionAddress), platform, user_data, isObject(pfn_notify));
	}

	/** Alternative version of: {@link #clCreateContextFromType} */
	public static CLContext clCreateContextFromType(PointerBuffer properties, long device_type, CLContextCallback pfn_notify, IntBuffer errcode_ret) {
		CLPlatform platform = CLContext.getPlatform(properties);
		long __functionAddress = getInstance(platform).clCreateContextFromType;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(properties, 3);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long user_data = CLContextCallback.register(pfn_notify);
		return CLContext.create(nclCreateContextFromType(memAddress(properties), device_type, pfn_notify == null ? 0L : CLContextCallback.CALLBACK, user_data, memAddressSafe(errcode_ret), __functionAddress), platform, user_data, isObject(pfn_notify));
	}

	// --- [ clRetainContext ] ---

	/** JNI method for {@link #clRetainContext} */
	public static native int nclRetainContext(long context, long __functionAddress);

	/**
	 * Increments the context reference count.
	 * <p/>
	 * {@link #clCreateContext} and {@link #clCreateContextFromType} perform an implicit retain. This is very helpful for 3rd party libraries, which typically get a context passed
	 * to them by the application. However, it is possible that the application may delete the context without informing the library. Allowing functions to
	 * attach to (i.e. retain) and release a context solves the problem of a context being used by a library no longer being valid.
	 *
	 * @param context the context to retain
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainContext(CLContext context) {
		long __functionAddress = getInstance(context).clRetainContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainContext(context.getPointer(), __functionAddress);
	}

	// --- [ clReleaseContext ] ---

	/** JNI method for {@link #clReleaseContext} */
	public static native int nclReleaseContext(long context, long __functionAddress);

	/**
	 * Decrements the context reference count.
	 * <p/>
	 * After the context reference count becomes zero and all the objects attached to context (such as memory objects, command-queues) are released, the
	 * context is deleted.
	 *
	 * @param context the context to release
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseContext(CLContext context) {
		long __functionAddress = getInstance(context).clReleaseContext;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseContext(context.getPointer(), __functionAddress);
	}

	// --- [ clGetContextInfo ] ---

	/** JNI method for {@link #clGetContextInfo} */
	public static native int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Queries information about a context.
	 *
	 * @param context              the OpenCL context being queried
	 * @param param_name           an enumeration constant that specifies the information to query. One of:<p/>{@link #CL_CONTEXT_REFERENCE_COUNT}, {@link #CL_CONTEXT_DEVICES}, {@link #CL_CONTEXT_PROPERTIES}, {@link CL11#CL_CONTEXT_NUM_DEVICES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetContextInfo(CLContext context, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetContextInfo(context.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetContextInfo} */
	public static int clGetContextInfo(CLContext context, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetContextInfo(context.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetContextInfo} */
	public static int clGetContextInfo(CLContext context, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetContextInfo(context.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetContextInfo} */
	public static int clGetContextInfo(CLContext context, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(context).clGetContextInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetContextInfo(context.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateCommandQueue ] ---

	/** JNI method for {@link #clCreateCommandQueue} */
	public static native long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret, long __functionAddress);

	/**
	 * Creates a command-queue on a specific device.
	 * <p/>
	 * OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
	 * The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
	 * queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
	 * of objects across multiple command-queues will require the application to perform appropriate synchronization.
	 *
	 * @param context     a valid OpenCL context
	 * @param device      a device associated with context. It can either be in the list of devices specified when context is created using {@link #clCreateContext} or have the same
	 *                    device type as device type specified when context is created using {@link #clCreateContextFromType}.
	 * @param properties  a bit-field of properties for the command-queue. One of:<p/>{@link #CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE}, {@link #CL_QUEUE_PROFILING_ENABLE}
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero command-queue and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the command-queue is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values specified in {@code properties} are not valid.</li>
	 *         	<li>{@link #CL_INVALID_QUEUE_PROPERTIES} if values specified in {@code properties} are valid but are not supported by the device.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLCommandQueue clCreateCommandQueue(CLContext context, CLDevice device, long properties, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateCommandQueue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLCommandQueue.create(nclCreateCommandQueue(context.getPointer(), device.getPointer(), properties, memAddressSafe(errcode_ret), __functionAddress), context, device);
	}

	/** Alternative version of: {@link #clCreateCommandQueue} */
	public static CLCommandQueue clCreateCommandQueue(CLContext context, CLDevice device, long properties, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateCommandQueue;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLCommandQueue.create(nclCreateCommandQueue(context.getPointer(), device.getPointer(), properties, memAddressSafe(errcode_ret), __functionAddress), context, device);
	}

	// --- [ clRetainCommandQueue ] ---

	/** JNI method for {@link #clRetainCommandQueue} */
	public static native int nclRetainCommandQueue(long command_queue, long __functionAddress);

	/**
	 * Increments the {@code command_queue} reference count.
	 * <p/>
	 * {@link #clCreateCommandQueue} performs an implicit retain. This is very helpful for 3rd party libraries, which typically get a command-queue passed to them by the
	 * application. However, it is possible that the application may delete the command-queue without informing the library. Allowing functions to attach to
	 * (i.e. retain) and release a command-queue solves the problem of a command-queue being used by a library no longer being valid.
	 *
	 * @param command_queue the command-queue to retain
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainCommandQueue(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clRetainCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainCommandQueue(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clReleaseCommandQueue ] ---

	/** JNI method for {@link #clReleaseCommandQueue} */
	public static native int nclReleaseCommandQueue(long command_queue, long __functionAddress);

	/**
	 * Decrements the {@code command_queue} reference count.
	 * <p/>
	 * After the {@code command_queue} reference count becomes zero and all commands queued to {@code command_queue} have finished (eg. kernel executions,
	 * memory object updates etc.), the command-queue is deleted.
	 * <p/>
	 * {@code clReleaseCommandQueue} performs an implicit flush to issue any previously queued OpenCL commands in command_queue.
	 *
	 * @param command_queue the command-queue to release
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseCommandQueue(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clReleaseCommandQueue;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseCommandQueue(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clGetCommandQueueInfo ] ---

	/** JNI method for {@link #clGetCommandQueueInfo} */
	public static native int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Queries information about a command-queue.
	 *
	 * @param command_queue        the command-queue being queried
	 * @param param_name           the information to query. One of:<p/>{@link #CL_QUEUE_CONTEXT}, {@link #CL_QUEUE_DEVICE}, {@link #CL_QUEUE_REFERENCE_COUNT}, {@link #CL_QUEUE_PROPERTIES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
	 *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** LongBuffer version of: {@link #clGetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetCommandQueueInfo} */
	public static int clGetCommandQueueInfo(CLCommandQueue command_queue, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(command_queue).clGetCommandQueueInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetCommandQueueInfo(command_queue.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateBuffer ] ---

	/** JNI method for {@link #clCreateBuffer} */
	public static native long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * Creates a buffer object.
	 *
	 * @param context     a valid OpenCL context used to create the buffer object
	 * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
	 *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE}.
	 *                    . One of:<p/>{@link #CL_MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS}
	 * @param size        the size in bytes of the buffer memory object to be allocated
	 * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
	 *                    &#x2265; {@code size} bytes.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values specified in flags are not valid.</li>
	 *         	<li>{@link #CL_INVALID_BUFFER_SIZE} if size is 0. Implementations may return {@link #CL_INVALID_BUFFER_SIZE} if size is greater than
	 *         {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE} value all devices in context.</li>
	 *         	<li>{@link #CL_INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR} are set in flags or if
	 *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateBuffer(CLContext context, long flags, long size, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( host_ptr != null ) checkBuffer(host_ptr, size);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, size, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateBuffer} */
	public static CLMem clCreateBuffer(CLContext context, long flags, long size, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, size, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** ShortBuffer version of: {@link #clCreateBuffer} */
	public static CLMem clCreateBuffer(CLContext context, long flags, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, host_ptr == null ? 0 : host_ptr.remaining(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** IntBuffer version of: {@link #clCreateBuffer} */
	public static CLMem clCreateBuffer(CLContext context, long flags, IntBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, host_ptr == null ? 0 : host_ptr.remaining(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** FloatBuffer version of: {@link #clCreateBuffer} */
	public static CLMem clCreateBuffer(CLContext context, long flags, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, host_ptr == null ? 0 : host_ptr.remaining(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** DoubleBuffer version of: {@link #clCreateBuffer} */
	public static CLMem clCreateBuffer(CLContext context, long flags, DoubleBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateBuffer(context.getPointer(), flags, host_ptr == null ? 0 : host_ptr.remaining(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clEnqueueReadBuffer ] ---

	/** JNI method for {@link #clEnqueueReadBuffer} */
	public static native int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to read from a buffer object to host memory.
	 *
	 * @param command_queue           the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_read           indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link #CL_TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
	 *                                read and copied into memory pointed to by {@code ptr}.
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link #CL_FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
	 *                                returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
	 *                                returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
	 *                                the buffer that {@code ptr} points to can be used by the application.
	 * @param offset                  the offset in bytes in the buffer object to read from
	 * @param size                    the size in bytes of data being read
	 * @param ptr                     the pointer to buffer in host memory where data is to be read into
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
	 *         {@code size} is 0.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, long size, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, size, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueReadBuffer} */
	public static int clEnqueueReadBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_read, long offset, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_read, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteBuffer ] ---

	/** JNI method for {@link #clEnqueueWriteBuffer} */
	public static native int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to write to a buffer object from host memory.
	 *
	 * @param command_queue           the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
	 * @param buffer                  a valid buffer object
	 * @param blocking_write          indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link #CL_TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
	 *                                command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link #CL_FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
	 *                                the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
	 *                                {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
	 *                                completed, the memory pointed to by {@code ptr} can then be reused by the application.
	 * @param offset                  the offset in bytes in the buffer object to write to
	 * @param size                    the size in bytes of data being written
	 * @param ptr                     the pointer to buffer in host memory where data is to be written from
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
	 *         {@code size} is 0.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, long size, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ptr, size);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, size, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, long size, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, size, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueWriteBuffer} */
	public static int clEnqueueWriteBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_write, long offset, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_write, offset, ptr.remaining(), memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyBuffer} */
	public static native int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to copy a buffer object identified by {@code src_buffer} to another buffer object identified by {@code dst_buffer}.
	 *
	 * @param command_queue           the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
	 *                                {@code dst_buffer} must be the same.
	 * @param src_buffer              the source buffer
	 * @param dst_buffer              the destination buffer
	 * @param src_offset              the offset where to begin copying data from {@code src_buffer}.
	 * @param dst_offset              the offset where to begin copying data into {@code dst_buffer}
	 * @param size                    the size in bytes to copy
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code src_offset}, {@code dst_offset}, {@code size}, {@code src_offset + size} or {@code dst_offset + size} require
	 *         accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code size} is 0.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link #CL_MEM_COPY_OVERLAP} if {@code src_buffer} and {@code dst_buffer} are the same buffer or sub-buffer object and the source and destination
	 *         regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap. The
	 *         regions overlap if {@code src_offset &#x2264 dst_offset &#x2264 src_offset + size – 1} or if {@code dst_offset &#x2264 src_offset &#x2264 dst_offset + size – 1}.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyBuffer(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyBuffer(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), src_offset, dst_offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBuffer} */
	public static int clEnqueueCopyBuffer(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, long src_offset, long dst_offset, long size, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBuffer(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), src_offset, dst_offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueMapBuffer ] ---

	/** JNI method for {@link #clEnqueueMapBuffer} */
	public static native long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/**
	 * Enqueues a command to map a region of the buffer object given by buffer into the host address space and returns a pointer to this mapped region.
	 * <p/>
	 * <p/>
	 * The pointer returned maps a region starting at {@code offset} and is at least {@code size} bytes in size. The result of a memory access outside this
	 * region is undefined.
	 * <p/>
	 * If the buffer object is created with {@link #CL_MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:
	 * <ul>
	 * 	<li>The {@code host_ptr} specified in {@link #clCreateBuffer} is guaranteed to contain the latest bits in the region being mapped when the
	 * {@code clEnqueueMapBuffer} command has completed.</li>
	 * 	<li>The pointer value returned by {@code clEnqueueMapBuffer} will be derived from the {@code host_ptr} specified when the buffer object is created.</li>
	 * </ul>
	 * <p/>
	 * Mapped buffer objects are unmapped using {@link #clEnqueueUnmapMemObject}.
	 *
	 * @param command_queue           a valid command-queue
	 * @param buffer                  a valid buffer object. The OpenCL context associated with command_queue and buffer must be the same.
	 * @param blocking_map            indicates if the map operation is blocking or non-blocking.
	 *                                <p/>
	 *                                If {@code blocking_map} is {@link #CL_TRUE}, {@code clEnqueueMapBuffer} does not return until the specified region in buffer is mapped into the host address
	 *                                space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapBuffer}.
	 *                                <p/>
	 *                                If {@code blocking_map} is {@link #CL_FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapBuffer}
	 *                                cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
	 *                                status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
	 *                                returned by {@code clEnqueueMapBuffer}.
	 * @param map_flags               a bit-field. One of:<p/>{@link #CL_MAP_READ}, {@link #CL_MAP_WRITE}, {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION}
	 * @param offset                  the offset in bytes of the region in the buffer object that is being mapped
	 * @param size                    the size in bytes of the region in the buffer object that is being mapped
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 * @param errcode_ret             will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
	 *         returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if region being mapped given by {@code (offset, size)} is out of bounds or if {@code size} is 0 or if values specified in
	 *         {@code map_flags} are not valid.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link #CL_MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for buffer objects
	 *         created with {@link #CL_MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR}.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if buffer has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS} and
	 *         {@link #CL_MAP_READ} is set in {@code map_flags} or if {@code buffer} has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return memByteBuffer(__result, (int)buffer.getInfoLong(CL_MEM_SIZE));
	}

	/** Alternative version of: {@link #clEnqueueMapBuffer} */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		int length = (int)buffer.getInfoLong(CL_MEM_SIZE);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #clEnqueueMapBuffer} */
	public static ByteBuffer clEnqueueMapBuffer(CLCommandQueue command_queue, CLMem buffer, int blocking_map, long map_flags, long offset, long size, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, int length, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapBuffer(command_queue.getPointer(), buffer.getPointer(), blocking_map, map_flags, offset, size, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ clCreateImage2D ] ---

	/** JNI method for {@link #clCreateImage2D} */
	public static native long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * Creates a 2D image object.
	 *
	 * @param context         a valid OpenCL context on which the image object is to be created
	 * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<p/>{@link #CL_MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS}
	 * @param image_format    a pointer to a {@link #cl_image_format} structure that describes format properties of the image to be allocated
	 * @param image_width     the width of the image in pixels
	 * @param image_height    the height of the image in pixels
	 * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
	 *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
	 *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
	 * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
	 *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
	 *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
	 * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
	 *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
	 *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
	 *         	<li>{@link #CL_INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL12#CL_MEM_USE_HOST_PTR} or {@link CL12#CL_MEM_COPY_HOST_PTR} are set in flags
	 *         or if {@code host_ptr} is not {@code NULL} but {@link CL12#CL_MEM_COPY_HOST_PTR} or {@link CL12#CL_MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateImage2D} */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** ShortBuffer version of: {@link #clCreateImage2D} */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** IntBuffer version of: {@link #clCreateImage2D} */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, IntBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** FloatBuffer version of: {@link #clCreateImage2D} */
	public static CLMem clCreateImage2D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_row_pitch, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage2D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateImage3D ] ---

	/** JNI method for {@link #clCreateImage3D} */
	public static native long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret, long __functionAddress);

	/**
	 * Creates a 3D image object.
	 *
	 * @param context           a valid OpenCL context on which the image object is to be created
	 * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<p/>{@link #CL_MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS}
	 * @param image_format      a pointer to a {@link #cl_image_format} structure that describes format properties of the image to be allocated
	 * @param image_width       the width of the image in pixels
	 * @param image_height      the height of the image in pixels
	 * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
	 * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
	 *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
	 *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
	 * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
	 *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
	 *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
	 *                          the {@code image_row_pitch}.
	 * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
	 *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
	 *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
	 *                          image elements.
	 * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
	 *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH} respectively for
	 *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
	 *         argument descriptions.</li>
	 *         	<li>{@link #CL_INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL12#CL_MEM_USE_HOST_PTR} or {@link CL12#CL_MEM_COPY_HOST_PTR} are set in flags
	 *         or if {@code host_ptr} is not {@code NULL} but {@link CL12#CL_MEM_COPY_HOST_PTR} or {@link CL12#CL_MEM_USE_HOST_PTR} are not set in flags.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateImage3D} */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ByteBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** ShortBuffer version of: {@link #clCreateImage3D} */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, ShortBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** IntBuffer version of: {@link #clCreateImage3D} */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, IntBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** FloatBuffer version of: {@link #clCreateImage3D} */
	public static CLMem clCreateImage3D(CLContext context, long flags, ByteBuffer image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, FloatBuffer host_ptr, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image_format, cl_image_format.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateImage3D(context.getPointer(), flags, memAddress(image_format), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clGetSupportedImageFormats ] ---

	/** JNI method for {@link #clGetSupportedImageFormats} */
	public static native int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats, long __functionAddress);

	/**
	 * Can be used to get the list of image formats supported by an OpenCL implementation when the following information about an image memory object is
	 * specified:
	 * <ul>
	 * 	<li>Context</li>
	 * 	<li>Image type – 1D, 2D, or 3D image, 1D image buffer, 1D or 2D image array</li>
	 * 	<li>Image object allocation information</li>
	 * </ul>
	 * <p/>
	 * {@code clGetSupportedImageFormats} returns a union of image formats supported by all devices in the context.
	 *
	 * @param context           a valid OpenCL context on which the image object(s) will be created
	 * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<p/>{@link #CL_MEM_READ_WRITE}, {@link #CL_MEM_WRITE_ONLY}, {@link #CL_MEM_READ_ONLY}, {@link #CL_MEM_USE_HOST_PTR}, {@link #CL_MEM_ALLOC_HOST_PTR}, {@link #CL_MEM_COPY_HOST_PTR}, {@link CL12#CL_MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY}, {@link CL12#CL_MEM_HOST_NO_ACCESS}
	 * @param image_type        the image type. One of:<p/>{@link CL12#CL_MEM_OBJECT_IMAGE1D}, {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER}, {@link #CL_MEM_OBJECT_IMAGE2D}, {@link #CL_MEM_OBJECT_IMAGE3D}, {@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY}, {@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY}
	 * @param num_entries       the number of entries that can be returned in the memory location given by {@code image_formats}
	 * @param image_formats     a pointer to a memory location where the list of supported image formats are returned. Each entry describes a {@link #cl_image_format} structure
	 *                          supported by the OpenCL implementation. If {@code image_formats} is {@code NULL}, it is ignored.
	 * @param num_image_formats the actual number of supported image formats for a specific context and values specified by {@code flags}. If {@code num_image_formats} is {@code NULL}, it
	 *                          is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code flags} or {@code image_type} are not valid, or if {@code num_entries} is 0 and {@code image_formats} is not {@code NULL}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetSupportedImageFormats(CLContext context, long flags, int image_type, int num_entries, ByteBuffer image_formats, ByteBuffer num_image_formats) {
		long __functionAddress = getInstance(context).clGetSupportedImageFormats;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( image_formats != null ) checkBuffer(image_formats, num_entries / cl_image_format.SIZEOF);
			if ( image_formats != null ) checkBuffer(image_formats, cl_image_format.SIZEOF);
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1 << 2);
		}
		return nclGetSupportedImageFormats(context.getPointer(), flags, image_type, num_entries, memAddressSafe(image_formats), memAddressSafe(num_image_formats), __functionAddress);
	}

	/** Alternative version of: {@link #clGetSupportedImageFormats} */
	public static int clGetSupportedImageFormats(CLContext context, long flags, int image_type, ByteBuffer image_formats, IntBuffer num_image_formats) {
		long __functionAddress = getInstance(context).clGetSupportedImageFormats;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( image_formats != null ) checkBuffer(image_formats, cl_image_format.SIZEOF);
			if ( num_image_formats != null ) checkBuffer(num_image_formats, 1);
		}
		return nclGetSupportedImageFormats(context.getPointer(), flags, image_type, image_formats == null ? 0 : image_formats.remaining(), memAddressSafe(image_formats), memAddressSafe(num_image_formats), __functionAddress);
	}

	// --- [ clEnqueueReadImage ] ---

	/** JNI method for {@link #clEnqueueReadImage} */
	public static native int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to read from an image or image array object to host memory.
	 * <p/>
	 * Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
	 * <code>host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)</code>, where {@code host_ptr} is a pointer
	 * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR}, must meet the following requirements in order to
	 * avoid undefined behavior:
	 * <ul>
	 * 	<li>All commands that use this image object have finished execution before the read command begins execution.</li>
	 * 	<li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
	 * 	<li>The image object is not mapped.</li>
	 * 	<li>The image object is not used by any command-queue until the read command has finished execution.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
	 * @param image                   a valid image or image array object
	 * @param blocking_read           indicates if the read operation is blocking or non-blocking.
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link #CL_TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
	 *                                been read and copied into memory pointed to by {@code ptr}.
	 *                                <p/>
	 *                                If {@code blocking_read} is {@link #CL_FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
	 *                                and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
	 *                                returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
	 *                                the buffer that {@code ptr} points to can be used by the application.
	 * @param origin                  defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
	 *                                the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
	 *                                {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param row_pitch               the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
	 *                                to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
	 * @param slice_pitch             the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
	 *                                is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
	 *                                slice pitch is calculated based on the {@code row_pitch * height}.
	 * @param ptr                     the pointer to a buffer in host memory where image data is to be read from
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
	 *         {@code NULL} value.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code origin} and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, ByteBuffer origin, ByteBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadImage} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueReadImage} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueReadImage} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueReadImage} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueReadImage} */
	public static int clEnqueueReadImage(CLCommandQueue command_queue, CLMem image, int blocking_read, PointerBuffer origin, PointerBuffer region, long row_pitch, long slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadImage(command_queue.getPointer(), image.getPointer(), blocking_read, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteImage ] ---

	/** JNI method for {@link #clEnqueueWriteImage} */
	public static native int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to write to an image or image array object from host memory.
	 * <p/>
	 * Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
	 * <code>host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)</code>, where {@code host_ptr} is a pointer
	 * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR}, must meet the following requirements in order
	 * to avoid undefined behavior:
	 * <ul>
	 * 	<li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
	 * 	<li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
	 * 	<li>The image object is not mapped.</li>
	 * 	<li>The image object is not used by any command-queue until the write command has finished execution.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
	 * @param image                   a valid image or image array object
	 * @param blocking_write          indicates if the read operation is blocking or non-blocking.
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link #CL_TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
	 *                                command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.
	 *                                <p/>
	 *                                If {@code blocking_write} is {@link #CL_FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
	 *                                the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
	 *                                {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
	 *                                completed, the memory pointed to by {@code ptr} can then be reused by the application.
	 * @param origin                  defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
	 *                                the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
	 *                                {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param input_row_pitch         the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
	 *                                to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
	 * @param input_slice_pitch       the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
	 *                                is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
	 *                                slice pitch is calculated based on the {@code input_row_pitch * height}.
	 * @param ptr                     the pointer to a buffer in host memory where image data is to be written to
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
	 *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
	 *         {@code NULL} value.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code origin} and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS}.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, ByteBuffer origin, ByteBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteImage} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** ShortBuffer version of: {@link #clEnqueueWriteImage} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, ShortBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** IntBuffer version of: {@link #clEnqueueWriteImage} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, IntBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** FloatBuffer version of: {@link #clEnqueueWriteImage} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, FloatBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #clEnqueueWriteImage} */
	public static int clEnqueueWriteImage(CLCommandQueue command_queue, CLMem image, int blocking_write, PointerBuffer origin, PointerBuffer region, long input_row_pitch, long input_slice_pitch, DoubleBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteImage(command_queue.getPointer(), image.getPointer(), blocking_write, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyImage ] ---

	/** JNI method for {@link #clEnqueueCopyImage} */
	public static native int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to copy image objects. {@code src_image and {@code dst_image} can be 1D, 2D, 3D image or a 1D, 2D image array objects allowing us to
	 * perform the following actions:
	 * <ul>
	 * 	<li>Copy a 1D image object to a 1D image object.</li>
	 * 	<li>Copy a 1D image object to a scanline of a 2D image object and vice-versa.</li>
	 * 	<li>Copy a 1D image object to a scanline of a 2D slice of a 3D image object and vice-versa.</li>
	 * 	<li>Copy a 1D image object to a scanline of a specific image index of a 1D or 2D image array object and vice-versa.</li>
	 * 	<li>Copy a 2D image object to a 2D image object.</li>
	 * 	<li>Copy a 2D image object to a 2D slice of a 3D image object and vice-versa.</li>
	 * 	<li>Copy a 2D image object to a specific image index of a 2D image array object and vice-versa.</li>
	 * 	<li>Copy images from a 1D image array object to a 1D image array object.</li>
	 * 	<li>Copy images from a 2D image array object to a 2D image array object.</li>
	 * 	<li>Copy a 3D image object to a 3D image object.</li>
	 * </ul>
	 *
	 * @param command_queue           the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_image} and
	 *                                {@code dst_image} must be the same.
	 * @param src_image               
	 * @param dst_image               
	 * @param src_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
	 *                                {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
	 *                                {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
	 *                                array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
	 * @param dst_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
	 *                                {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
	 *                                image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
	 *                                index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code src_image} or {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image or
	 *                                1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image array object,
	 *                                {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_image} are not the same or if the
	 *         context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code src_image} and {@code dst_image} are not valid image objects.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_MISMATCH} if {@code src_image} and {@code dst_image} do not use the same image format.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
	 *         outside {@code src_image}, or if the 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refers to a region
	 *         outside {@code dst_image}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values in {@code src_origin}, {@code dst_origin} and {@code region} do not follow rules described in the argument
	 *         description for {@code src_origin}, {@code dst_origin} and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} or
	 *         {@code dst_image} are not supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} or {@code dst_image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_image}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_MEM_COPY_OVERLAP} if {@code src_image} and {@code dst_image} are the same image object and the source and destination regions overlap.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyImage(CLCommandQueue command_queue, CLMem src_image, CLMem dst_image, ByteBuffer src_origin, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(dst_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyImage(command_queue.getPointer(), src_image.getPointer(), dst_image.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyImage} */
	public static int clEnqueueCopyImage(CLCommandQueue command_queue, CLMem src_image, CLMem dst_image, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImage(command_queue.getPointer(), src_image.getPointer(), dst_image.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyImageToBuffer ] ---

	/** JNI method for {@link #clEnqueueCopyImageToBuffer} */
	public static native int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to copy an image object to a buffer object.
	 *
	 * @param command_queue           a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} must be the same.
	 * @param src_image               a valid image object
	 * @param dst_buffer              a valid buffer object
	 * @param src_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
	 *                                {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
	 *                                {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
	 *                                array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code src_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} is a 1D image or 1D image buffer object, {@code region[1]}
	 *                                and {@code region[2]} must be 1. If {@code src_image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot
	 *                                be 0.
	 * @param dst_offset              the offset where to begin copying data into {@code dst_buffer}. The size in bytes of the region to be copied referred to as {@code dst_cb} is
	 *                                computed as <code>width * height * depth * bytes/image element</code> if {@code src_image} is a 3D image object, is computed as
	 *                                <code>width * height * bytes/image element</code> if {@code src_image} is a 2D image, is computed as
	 *                                <code>width * height * arraysize * bytes/image element</code> if {@code src_image} is a 2D image array object, is computed as
	 *                                <code>width * bytes/image element</code> if {@code src_image} is a 1D image or 1D image buffer object and is computed as
	 *                                <code>width * arraysize * bytes/image element</code> if {@code src_image} is a 1D image array object.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code src_image} is not a valid image object or {@code dst_buffer} is not a valid buffer object or if
	 *         {@code src_image} is a 1D image buffer object created from {@code dst_buffer}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if the 1D, 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
	 *         outside {@code src_image}, or if the region specified by {@code dst_offset} and {@code dst_offset + dst_cb} to a region outside {@code dst_buffer}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values in {@code src_origin} and region do not follow rules described in the argument description for
	 *         {@code src_origin} and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} are not supported by device
	 *         associated with queue.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_buffer}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyImageToBuffer(CLCommandQueue command_queue, CLMem src_image, CLMem dst_buffer, ByteBuffer src_origin, ByteBuffer region, long dst_offset, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImageToBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyImageToBuffer(command_queue.getPointer(), src_image.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(region), dst_offset, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyImageToBuffer} */
	public static int clEnqueueCopyImageToBuffer(CLCommandQueue command_queue, CLMem src_image, CLMem dst_buffer, PointerBuffer src_origin, PointerBuffer region, long dst_offset, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyImageToBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyImageToBuffer(command_queue.getPointer(), src_image.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(region), dst_offset, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBufferToImage ] ---

	/** JNI method for {@link #clEnqueueCopyBufferToImage} */
	public static native int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to copy a buffer object to an image object.
	 *
	 * @param command_queue           a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} must be the same.
	 * @param src_buffer              a valid buffer object
	 * @param dst_image               a valid image object
	 * @param src_offset              the offset where to begin copying data from {@code src_buffer}
	 * @param dst_origin              the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
	 *                                {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
	 *                                image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
	 *                                index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
	 *                                {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code dst_image} is a 1D image or
	 *                                1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code dst_image} is a 1D image array object,
	 *                                {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} are not the same or if
	 *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT if {@code src_buffer} is not a valid buffer object or {@code dst_image} is not a valid image object or if
	 *         {@code dst_image} is a 1D image buffer object created from {@code src_buffer}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE if the 1D, 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refer to a region
	 *         outside {@code dst_image}, or if the region specified by {@code src_offset} and {@code src_offset + src_cb refer} to a region outside
	 *         {@code src_buffer}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE if values in {@code dst_origin} and {@code region} do not follow rules described in the argument description for
	 *         {@code dst_origin} and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	 *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code dst_image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code dst_image} are not supported by device
	 *         associated with queue.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_image}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueCopyBufferToImage(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_image, long src_offset, ByteBuffer dst_origin, ByteBuffer region, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferToImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dst_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyBufferToImage(command_queue.getPointer(), src_buffer.getPointer(), dst_image.getPointer(), src_offset, memAddress(dst_origin), memAddress(region), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBufferToImage} */
	public static int clEnqueueCopyBufferToImage(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_image, long src_offset, PointerBuffer dst_origin, PointerBuffer region, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferToImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBufferToImage(command_queue.getPointer(), src_buffer.getPointer(), dst_image.getPointer(), src_offset, memAddress(dst_origin), memAddress(region), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueMapImage ] ---

	/** JNI method for {@link #clEnqueueMapImage} */
	public static native long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret, long __functionAddress);

	/**
	 * Enqueues a command to map a region in the image object given by {@code image} into the host address space and returns a pointer to this mapped region.
	 * <p/>
	 * The pointer returned maps a 1D, 2D or 3D region starting at {@code origin} and is at least {@code region[0]} pixels in size for a 1D image, 1D image
	 * buffer or 1D image array, {@code (image_row_pitch * region[1])} pixels in size for a 2D image or 2D image array, and
	 * {@code (image_slice_pitch * region[2])} pixels in size for a 3D image. The result of a memory access outside this region is undefined.
	 * <p/>
	 * If the image object is created with {@link #CL_MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:
	 * <ul>
	 * 	<li>The {@code host_ptr} specified in {@link CL12#clCreateImage} is guaranteed to contain the latest bits in the region being mapped when the
	 * {@code clEnqueueMapImage} command has completed.</li>
	 * 	<li>The pointer value returned by {@code clEnqueueMapImage} will be derived from the {@code host_ptr} specified when the image object is created.</li>
	 * </ul>
	 * Mapped image objects are unmapped using {@link #clEnqueueUnmapMemObject}.
	 *
	 * @param command_queue           a valid command-queue
	 * @param image                   a valid image object. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
	 * @param blocking_map            indicates if the map operation is blocking or non-blocking.
	 *                                <p/>
	 *                                If {@code blocking_map} is {@link #CL_TRUE}, {@code clEnqueueMapImage} does not return until the specified region in image is mapped into the host address
	 *                                space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapImage}.
	 *                                <p/>
	 *                                If {@code blocking_map} is {@link #CL_FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapImage}
	 *                                cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
	 *                                status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
	 *                                returned by {@code clEnqueueMapImage}.
	 * @param map_flags               a bit-field. One of:<p/>{@link #CL_MAP_READ}, {@link #CL_MAP_WRITE}, {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION}
	 * @param origin                  the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
	 *                                {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
	 *                                is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
	 *                                {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
	 *                                {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
	 * @param region                  the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
	 *                                of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If {@code image} is
	 *                                a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]}
	 *                                must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
	 * @param image_row_pitch         the scan-line pitch in bytes for the mapped region. This must be a non-{@code NULL} value.
	 * @param image_slice_pitch       returns the size in bytes of each 2D slice of a 3D image or the size of each 1D or 2D image in a 1D or 2D image array for the mapped region. For a
	 *                                1D and 2D image, zero is returned if this argument is not {@code NULL}. For a 3D image, 1D and 2D image array, {@code image_slice_pitch} must be a non-{@code NULL}
	 *                                value.
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 * @param errcode_ret             will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
	 *         returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if context associated with {@code command_queue} and image are not the same or if context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if region being mapped given by {@code (origin, origin+region)} is out of bounds or if values specified in
	 *         {@code map_flags} are not valid.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin}
	 *         and {@code region}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code image_row_pitch} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code image} is a 3D image, 1D or 2D image array object and {@code image_slice_pitch} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link #CL_INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
	 *         supported by device associated with queue.</li>
	 *         	<li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
	 *         with queue.</li>
	 *         	<li>{@link #CL_MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for image objects
	 *         created with {@link #CL_MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR}.</li>
	 *         	<li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
	 *         {@code event_wait_list} is a negative integer value.</li>
	 *         	<li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if {@code image} has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS} and
	 *         {@link #CL_MAP_READ} is set in {@code map_flags} or if image has been created with {@link CL12#CL_MEM_HOST_READ_ONLY} or
	 *         {@link CL12#CL_MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, ByteBuffer origin, ByteBuffer region, ByteBuffer image_row_pitch, ByteBuffer image_slice_pitch, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(image_row_pitch, 1 << PointerBuffer.getPointerSizeShift());
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return memByteBuffer(__result, (int)image.getInfoLong(CL_MEM_SIZE));
	}

	/** Alternative version of: {@link #clEnqueueMapImage} */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		int length = (int)image.getInfoLong(CL_MEM_SIZE);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #clEnqueueMapImage} */
	public static ByteBuffer clEnqueueMapImage(CLCommandQueue command_queue, CLMem image, int blocking_map, long map_flags, PointerBuffer origin, PointerBuffer region, PointerBuffer image_row_pitch, PointerBuffer image_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event, IntBuffer errcode_ret, int length, ByteBuffer old_buffer) {
		long __functionAddress = getInstance(command_queue).clEnqueueMapImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(origin, 3);
			checkBuffer(region, 3);
			checkBuffer(image_row_pitch, 1);
			if ( image_slice_pitch != null ) checkBuffer(image_slice_pitch, 1);
			if ( event != null ) checkBuffer(event, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		long __result = nclEnqueueMapImage(command_queue.getPointer(), image.getPointer(), blocking_map, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret), __functionAddress);
		return __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	// --- [ clGetImageInfo ] ---

	/** JNI method for {@link #clGetImageInfo} */
	public static native int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns information specific to an image object.
	 *
	 * @param image                the image object being queried
	 * @param param_name           the information to query. One of:<p/>{@link #CL_IMAGE_FORMAT}, {@link #CL_IMAGE_ELEMENT_SIZE}, {@link #CL_IMAGE_ROW_PITCH}, {@link #CL_IMAGE_SLICE_PITCH}, {@link #CL_IMAGE_WIDTH}, {@link #CL_IMAGE_HEIGHT}, {@link #CL_IMAGE_DEPTH}, {@link CL12#CL_IMAGE_ARRAY_SIZE}, {@link CL12#CL_IMAGE_BUFFER}, {@link CL12#CL_IMAGE_NUM_MIP_LEVELS}, {@link CL12#CL_IMAGE_NUM_SAMPLES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code image} is a not a valid image object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetImageInfo(CLMem image, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetImageInfo(image.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetImageInfo} */
	public static int clGetImageInfo(CLMem image, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetImageInfo(image.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetImageInfo} */
	public static int clGetImageInfo(CLMem image, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetImageInfo(image.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetImageInfo} */
	public static int clGetImageInfo(CLMem image, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(image).clGetImageInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetImageInfo(image.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clRetainMemObject ] ---

	/** JNI method for {@link #clRetainMemObject} */
	public static native int nclRetainMemObject(long memobj, long __functionAddress);

	/**
	 * Increments the {@code memobj} reference count.
	 * <p/>
	 * {@link #clCreateBuffer}, {@link CL12#clCreateSubBuffer} and {@link CL12#clCreateImage} perform an implicit retain.
	 *
	 * @param memobj the memory object to retain
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object (buffer or image object).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainMemObject(CLMem memobj) {
		long __functionAddress = getInstance(memobj).clRetainMemObject;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainMemObject(memobj.getPointer(), __functionAddress);
	}

	// --- [ clReleaseMemObject ] ---

	/** JNI method for {@link #clReleaseMemObject} */
	public static native int nclReleaseMemObject(long memobj, long __functionAddress);

	/**
	 * Decrements the {@code memobj} reference count.
	 * <p/>
	 * After the {@code memobj} reference count becomes zero and commands queued for execution on a command-queue(s) that use {@code memobj} have finished, the
	 * memory object is deleted. If {@code memobj} is a buffer object, {@code memobj} cannot be deleted until all sub-buffer objects associated with
	 * {@code memobj} are deleted.
	 *
	 * @param memobj the memory object to release
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseMemObject(CLMem memobj) {
		long __functionAddress = getInstance(memobj).clReleaseMemObject;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseMemObject(memobj.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueUnmapMemObject ] ---

	/** JNI method for {@link #clEnqueueUnmapMemObject} */
	public static native int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Enqueues a command to unmap a previously mapped region of a memory object. Reads or writes from the host using the pointer returned by
	 * {@link #clEnqueueMapBuffer} or {@link #clEnqueueMapImage} are considered to be complete.
	 * <p/>
	 * {@link #clEnqueueMapBuffer}, and {@link #clEnqueueMapImage} increments the mapped count of the memory object. The initial mapped count value of the memory object is zero.
	 * Multiple calls to {@link #clEnqueueMapBuffer}, or {@link #clEnqueueMapImage} on the same memory object will increment this mapped count by appropriate number of calls.
	 * {@code clEnqueueUnmapMemObject} decrements the mapped count of the memory object. {@link #clEnqueueMapBuffer}, and {@link #clEnqueueMapImage} act as synchronization points
	 * for a region of the buffer object being mapped.
	 *
	 * @param command_queue           a valid command-queue
	 * @param memobj                  a valid memory object. The OpenCL context associated with {@code command_queue} and {@code memobj} must be the same.
	 * @param mapped_ptr              the host address returned by a previous call to {@link #clEnqueueMapBuffer}, or {@link #clEnqueueMapImage} for {@code memobj}
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code mapped_ptr} is not a valid pointer returned by {@link #clEnqueueMapBuffer}, or {@link #clEnqueueMapImage} for {@code memobj}.</li>
	 *         	<li>{@link #CL_INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if context associated with {@code command_queue} and {@code memobj} are not the same or if the context associated with
	 *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
	 *         </ul>
	 */
	public static int clEnqueueUnmapMemObject(CLCommandQueue command_queue, CLMem memobj, ByteBuffer mapped_ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueUnmapMemObject;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueUnmapMemObject(command_queue.getPointer(), memobj.getPointer(), memAddress(mapped_ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueUnmapMemObject} */
	public static int clEnqueueUnmapMemObject(CLCommandQueue command_queue, CLMem memobj, ByteBuffer mapped_ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueUnmapMemObject;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueUnmapMemObject(command_queue.getPointer(), memobj.getPointer(), memAddress(mapped_ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clGetMemObjectInfo ] ---

	/** JNI method for {@link #clGetMemObjectInfo} */
	public static native int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns information that is common to all memory objects (buffer and image objects).
	 *
	 * @param memobj               the memory object being queried
	 * @param param_name           the information to query. One of:<p/>{@link #CL_MEM_TYPE}, {@link #CL_MEM_FLAGS}, {@link #CL_MEM_SIZE}, {@link #CL_MEM_HOST_PTR}, {@link #CL_MEM_MAP_COUNT}, {@link #CL_MEM_REFERENCE_COUNT}, {@link #CL_MEM_CONTEXT}, {@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT}, {@link CL11#CL_MEM_OFFSET}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetMemObjectInfo} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetMemObjectInfo} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** LongBuffer version of: {@link #clGetMemObjectInfo} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, LongBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetMemObjectInfo} */
	public static int clGetMemObjectInfo(CLMem memobj, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).clGetMemObjectInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetMemObjectInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateSampler ] ---

	/** JNI method for {@link #clCreateSampler} */
	public static native long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret, long __functionAddress);

	/**
	 * Creates a sampler object.
	 * <p/>
	 * A sampler object describes how to sample an image when the image is read in the kernel. The built-in functions to read from an image in a kernel take a
	 * sampler as an argument. The sampler arguments to the image read function can be sampler objects created using OpenCL functions and passed as argument
	 * values to the kernel or can be samplers declared inside a kernel.
	 *
	 * @param context           a valid OpenCL context
	 * @param normalized_coords determines if the image coordinates specified are normalized or not
	 * @param addressing_mode   specifies how out-of-range image coordinates are handled when reading from an image. One of:<p/>{@link #CL_ADDRESS_NONE}, {@link #CL_ADDRESS_CLAMP_TO_EDGE}, {@link #CL_ADDRESS_CLAMP}, {@link #CL_ADDRESS_REPEAT}, {@link CL11#CL_ADDRESS_MIRRORED_REPEAT}
	 * @param filter_mode       the type of filter that must be applied when reading an image. One of:<p/>{@link #CL_FILTER_NEAREST}, {@link #CL_FILTER_LINEAR}
	 * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero sampler object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the sampler object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code addressing_mode}, {@code filter_mode} or {@code normalized_coords} or combination of these argument values are
	 *         not valid.</li>
	 *         	<li>{@link #CL_INVALID_OPERATION} if images are not supported by any device associated with {@code context} (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT} is
	 *         {@link #CL_FALSE}).</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLSampler clCreateSampler(CLContext context, int normalized_coords, int addressing_mode, int filter_mode, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateSampler;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLSampler.create(nclCreateSampler(context.getPointer(), normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateSampler} */
	public static CLSampler clCreateSampler(CLContext context, int normalized_coords, int addressing_mode, int filter_mode, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateSampler;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLSampler.create(nclCreateSampler(context.getPointer(), normalized_coords, addressing_mode, filter_mode, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clRetainSampler ] ---

	/** JNI method for {@link #clRetainSampler} */
	public static native int nclRetainSampler(long sampler, long __functionAddress);

	/**
	 * Increments the sampler reference count. {@link #clCreateSampler} performs an implicit retain.
	 *
	 * @param sampler the sample object to retain
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_SAMPLER} if sampler is not a valid sampler object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainSampler(CLSampler sampler) {
		long __functionAddress = getInstance(sampler).clRetainSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainSampler(sampler.getPointer(), __functionAddress);
	}

	// --- [ clReleaseSampler ] ---

	/** JNI method for {@link #clReleaseSampler} */
	public static native int nclReleaseSampler(long sampler, long __functionAddress);

	/**
	 * Decrements the sampler reference count. The sampler object is deleted after the reference count becomes zero and commands queued for execution on a
	 * command-queue(s) that use sampler have finished.
	 *
	 * @param sampler the sample object to release
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_SAMPLER} if {@code sampler} is not a valid sampler object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseSampler(CLSampler sampler) {
		long __functionAddress = getInstance(sampler).clReleaseSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseSampler(sampler.getPointer(), __functionAddress);
	}

	// --- [ clGetSamplerInfo ] ---

	/** JNI method for {@link #clGetSamplerInfo} */
	public static native int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns information about a sampler object.
	 *
	 * @param sampler              the sampler being queried
	 * @param param_name           the information to query. One of:<p/>{@link #CL_SAMPLER_REFERENCE_COUNT}, {@link #CL_SAMPLER_CONTEXT}, {@link #CL_SAMPLER_NORMALIZED_COORDS}, {@link #CL_SAMPLER_ADDRESSING_MODE}, {@link #CL_SAMPLER_FILTER_MODE}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
	 *         and {@code param_value} is not {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_SAMPLER} if {@code sampler} is a not a valid sampler object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetSamplerInfo} */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetSamplerInfo} */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** PointerBuffer version of: {@link #clGetSamplerInfo} */
	public static int clGetSamplerInfo(CLSampler sampler, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(sampler).clGetSamplerInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetSamplerInfo(sampler.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << PointerBuffer.getPointerSizeShift(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateProgramWithSource ] ---

	/** JNI method for {@link #clCreateProgramWithSource} */
	public static native long nclCreateProgramWithSource(long context, int count, long strings, long lengths, long errcode_ret, long __functionAddress);

	/**
	 * Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
	 * devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
	 * program source, header or implementation-defined source for custom devices that support an online compiler.
	 *
	 * @param context     a valid OpenCL context
	 * @param count       the number of elements in the {@code strings} and {@code lengths} arrays
	 * @param strings     an array of {@code count} pointers to optionally null-terminated character strings that make up the source code
	 * @param lengths     an array with the number of chars in each string (the string length). If an element in {@code lengths} is zero, its accompanying string is
	 *                    null-terminated. If {@code lengths} is {@code NULL}, all strings in the {@code strings} argument are considered null-terminated. Any length value passed in
	 *                    that is greater than zero excludes the null terminator in its count.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code count} is zero or if {@code strings} or any entry in {@code strings} is {@code NULL}.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLProgram clCreateProgramWithSource(CLContext context, int count, ByteBuffer strings, ByteBuffer lengths, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(strings, count << PointerBuffer.getPointerSizeShift());
			if ( lengths != null ) checkBuffer(lengths, count << PointerBuffer.getPointerSizeShift());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLProgram.create(nclCreateProgramWithSource(context.getPointer(), count, memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateProgramWithSource} */
	public static CLProgram clCreateProgramWithSource(CLContext context, PointerBuffer strings, PointerBuffer lengths, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( lengths != null ) checkBuffer(lengths, strings.remaining());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLProgram.create(nclCreateProgramWithSource(context.getPointer(), strings.remaining(), memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Array version of: {@link #clCreateProgramWithSource} */
	public static CLProgram clCreateProgramWithSource(CLContext context, CharSequence[] strings, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.bufferParam(strings.length << PointerBuffer.getPointerSizeShift());
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerValue(stringsLengths + (i << PointerBuffer.getPointerSizeShift()), strings[i].length());
		int stringsAddress = __buffer.bufferParam(strings.length << PointerBuffer.getPointerSizeShift());
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerValue(stringsAddress + (i << PointerBuffer.getPointerSizeShift()), memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], false)));
		return CLProgram.create(nclCreateProgramWithSource(context.getPointer(), strings.length, __buffer.address() + stringsAddress, __buffer.address() + stringsLengths, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Single string version of: {@link #clCreateProgramWithSource} */
	public static CLProgram clCreateProgramWithSource(CLContext context, CharSequence string, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithSource;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int stringsLengths = __buffer.pointerParam();
		__buffer.pointerValue(stringsLengths, string.length());
		int stringsAddress = __buffer.pointerParam();
		ByteBuffer stringBuffers = memEncodeUTF8(string, false);
		__buffer.pointerValue(stringsAddress, memAddress(stringBuffers));
		return CLProgram.create(nclCreateProgramWithSource(context.getPointer(), 1, __buffer.address() + stringsAddress, __buffer.address() + stringsLengths, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateProgramWithBinary ] ---

	/** JNI method for {@link #clCreateProgramWithBinary} */
	public static native long nclCreateProgramWithBinary(long context, int num_devices, long device_list, long lengths, long binaries, long binary_status, long errcode_ret, long __functionAddress);

	/**
	 * Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.
	 * <p/>
	 * The program binaries specified by {@code binaries} contain the bits that describe one of the following:
	 * <ul>
	 * 	<li>a program executable to be run on the device(s) associated with {@code context},</li>
	 * 	<li>a compiled program for device(s) associated with {@code context}, or</li>
	 * 	<li>a library of compiled programs for device(s) associated with {@code context}.</li>
	 * </ul>
	 * The program binary can consist of either or both:
	 * <ul>
	 * 	<li>Device-specific code and/or,</li>
	 * 	<li>Implementation-specific intermediate representation (IR) which will be converted to the device-specific code.</li>
	 * </ul>
	 * OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
	 * useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
	 * appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
	 * launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
	 * help significantly reduce the application initialization time.
	 *
	 * @param context       a valid OpenCL context
	 * @param num_devices   the number of devices listed in {@code device_list}
	 * @param device_list   a pointer to a list of devices that are in {@code context}. device_list must be a non-{@code NULL} value. The binaries are loaded for devices specified in
	 *                      this list.
	 * @param lengths       an array of the size in bytes of the program binaries to be loaded for devices specified by {@code device_list}.
	 * @param binaries      an array of pointers to program binaries to be loaded for devices specified by {@code device_list}. For each device given by {@code device_list[i]},
	 *                      the pointer to the program binary for that device is given by {@code binaries[i]} and the length of this corresponding binary is given by
	 *                      {@code lengths[i]}. {@code lengths[i]} cannot be zero and {@code binaries[i]} cannot be a {@code NULL} pointer.
	 * @param binary_status returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
	 *                      entries and returns {@link #CL_SUCCESS} in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
	 *                      otherwise returns {@link #CL_INVALID_VALUE} if {@code lengths[i]} is zero or if {@code binaries[i]} is a {@code NULL} value or {@link #CL_INVALID_BINARY} in
	 *                      {@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is {@code NULL}, it is ignored.
	 * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
	 *         	<li>{@link #CL_INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
	 *         	<li>{@link #CL_INVALID_VALUE} if {@code lengths} or {@code binaries} are NULL or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is {@code NULL}.</li>
	 *         	<li>{@link #CL_INVALID_BINARY} if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLProgram clCreateProgramWithBinary(CLContext context, int num_devices, ByteBuffer device_list, ByteBuffer lengths, ByteBuffer binaries, ByteBuffer binary_status, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(binaries, num_devices << PointerBuffer.getPointerSizeShift());
			checkBuffer(device_list, num_devices << PointerBuffer.getPointerSizeShift());
			checkBuffer(lengths, num_devices << PointerBuffer.getPointerSizeShift());
			if ( binary_status != null ) checkBuffer(binary_status, num_devices << 2);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLProgram.create(nclCreateProgramWithBinary(context.getPointer(), num_devices, memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateProgramWithBinary} */
	public static CLProgram clCreateProgramWithBinary(CLContext context, PointerBuffer device_list, PointerBuffer lengths, PointerBuffer binaries, IntBuffer binary_status, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(device_list, binaries.remaining());
			checkBuffer(lengths, binaries.remaining());
			if ( binary_status != null ) checkBuffer(binary_status, binaries.remaining());
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLProgram.create(nclCreateProgramWithBinary(context.getPointer(), binaries.remaining(), memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Array version of: {@link #clCreateProgramWithBinary} */
	public static CLProgram clCreateProgramWithBinary(CLContext context, PointerBuffer device_list, ByteBuffer[] binaries, IntBuffer binary_status, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(device_list, binaries.length);
			if ( binary_status != null ) checkBuffer(binary_status, binaries.length);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int binariesAddress = __buffer.bufferParam(binaries.length << PointerBuffer.getPointerSizeShift());
		for ( int i = 0; i < binaries.length; i++ )
			__buffer.pointerValue(binariesAddress + (i << PointerBuffer.getPointerSizeShift()), memAddress(binaries[i]));
		int binariesLengths = __buffer.bufferParam(binaries.length << PointerBuffer.getPointerSizeShift());
		for ( int i = 0; i < binaries.length; i++ )
			__buffer.pointerValue(binariesLengths + (i << PointerBuffer.getPointerSizeShift()), binaries[i].remaining());
		return CLProgram.create(nclCreateProgramWithBinary(context.getPointer(), binaries.length, memAddress(device_list), __buffer.address() + binariesLengths, __buffer.address() + binariesAddress, memAddressSafe(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Single binary version of: {@link #clCreateProgramWithBinary} */
	public static CLProgram clCreateProgramWithBinary(CLContext context, PointerBuffer device_list, ByteBuffer binary, IntBuffer binary_status, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateProgramWithBinary;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(device_list, 1);
			if ( binary_status != null ) checkBuffer(binary_status, 1);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int binariesAddress = __buffer.pointerParam();
		__buffer.pointerValue(binariesAddress, memAddress(binary));
		int binariesLengths = __buffer.pointerParam();
		__buffer.pointerValue(binariesLengths, binary.remaining());
		return CLProgram.create(nclCreateProgramWithBinary(context.getPointer(), 1, memAddress(device_list), __buffer.address() + binariesLengths, __buffer.address() + binariesAddress, memAddressSafe(binary_status), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clRetainProgram ] ---

	/** JNI method for {@link #clRetainProgram} */
	public static native int nclRetainProgram(long program, long __functionAddress);

	/**
	 * Increments the {@code program} reference count. {@code clCreateProgram} does an implicit retain.
	 *
	 * @param program the program object to retain
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainProgram(CLProgram program) {
		long __functionAddress = getInstance(program).clRetainProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainProgram(program.getPointer(), __functionAddress);
	}

	// --- [ clReleaseProgram ] ---

	/** JNI method for {@link #clReleaseProgram} */
	public static native int nclReleaseProgram(long program, long __functionAddress);

	/**
	 * Decrements the {@code program} reference count. The program object is deleted after all kernel objects associated with program have been deleted and the
	 * program reference count becomes zero.
	 *
	 * @param program the program object to release
	 *
	 * @return {@link #CL_SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         	<li>{@link #CL_INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
	 *         	<li>{@link #CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         	<li>{@link #CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseProgram(CLProgram program) {
		long __functionAddress = getInstance(program).clReleaseProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseProgram(program.getPointer(), __functionAddress);
	}

	// --- [ clBuildProgram ] ---

	/** JNI method for {@link #clBuildProgram} */
	public static native int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * Builds (compiles & links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
	 * associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
	 * {@code program} created using either {@link #clCreateProgramWithSource} or {@link #clCreateProgramWithBinary} to build the program executable for one or more devices
	 * associated with {@code program}. If {@code program} is created with {@link #clCreateProgramWithBinary}, then the program binary must be an executable binary (not
	 * a compiled binary or library).
	 * <p/>
	 * The executable binary can be queried using {@link #clGetProgramInfo} and can be specified to {@link #clCreateProgramWithBinary} to create a new program object.
	 *
	 * @param program     the program object
	 * @param num_devices the number of devices listed in {@code device_list}
	 * @param device_list a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the program executable is built for all
	 *                    devices associated with {@code program} for which a source or binary has been loaded. If {@code device_list} is a non-{@code NULL} value, the program
	 *                    executable is built for devices specified in this list for which a source or binary has been loaded.
	 * @param options     a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable
	 * @param pfn_notify  a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
	 *                    called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not {@code NULL}, {@code clBuildProgram} does
	 *                    not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
	 *                    context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
	 *                    device resources needed to perform the build are available. If {@code pfn_notify} is {@code NULL}, {@code clBuildProgram} does not return until the build
	 *                    has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application’s responsibility to ensure
	 *                    that the callback function is thread-safe.
	 * @param user_data   will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be NULL.
	 */
	public static int clBuildProgram(CLProgram program, int num_devices, ByteBuffer device_list, ByteBuffer options, long pfn_notify, long user_data) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( device_list != null ) checkBuffer(device_list, num_devices << PointerBuffer.getPointerSizeShift());
			checkNT1(options);
		}
		return nclBuildProgram(program.getPointer(), num_devices, memAddressSafe(device_list), memAddress(options), pfn_notify, user_data, __functionAddress);
	}

	/** Alternative version of: {@link #clBuildProgram} */
	public static int clBuildProgram(CLProgram program, PointerBuffer device_list, ByteBuffer options, CLBuildProgramCallback pfn_notify) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long user_data = program.register(pfn_notify);
		return nclBuildProgram(program.getPointer(), device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), memAddress(options), pfn_notify == null ? 0L : CLBuildProgramCallback.CALLBACK, user_data, __functionAddress);
	}

	/** CharSequence version of: {@link #clBuildProgram} */
	public static int clBuildProgram(CLProgram program, PointerBuffer device_list, CharSequence options, CLBuildProgramCallback pfn_notify) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long user_data = program.register(pfn_notify);
		return nclBuildProgram(program.getPointer(), device_list == null ? 0 : device_list.remaining(), memAddressSafe(device_list), memAddress(memEncodeASCII(options)), pfn_notify == null ? 0L : CLBuildProgramCallback.CALLBACK, user_data, __functionAddress);
	}

	/** Single value version of: {@link #clBuildProgram} */
	public static int clBuildProgram(CLProgram program, CLDevice device, CharSequence options, CLBuildProgramCallback pfn_notify) {
		long __functionAddress = getInstance(program).clBuildProgram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int device_list = __buffer.pointerParam();
		__buffer.pointerValue(device_list, device);
		long user_data = program.register(pfn_notify);
		return nclBuildProgram(program.getPointer(), 1, __buffer.address() + device_list, memAddress(memEncodeASCII(options)), pfn_notify == null ? 0L : CLBuildProgramCallback.CALLBACK, user_data, __functionAddress);
	}

	// --- [ clUnloadCompiler ] ---

	/** JNI method for {@link #clUnloadCompiler} */
	public static native int nclUnloadCompiler(long __functionAddress);

	/**
	 * Allows the implementation to release the resources allocated by the OpenCL compiler. This is a hint from the application and does not guarantee that the
	 * compiler will not be used in the future or that the compiler will actually be unloaded by the implementation.
	 * <p/>
	 * Calls to {@link #clBuildProgram} after {@code clUnloadCompiler} will reload the compiler, if necessary, to build the appropriate program executable.
	 *
	 *
	 * @return always {@link #CL_SUCCESS}
	 */
	public static int clUnloadCompiler() {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clUnloadCompiler");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclUnloadCompiler(__functionAddress);
	}

	// --- [ clGetProgramInfo ] ---

	/** JNI method for {@link #clGetProgramInfo} */
	public static native int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program              
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetProgramInfo(CLProgram program, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetProgramInfo(program.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetProgramInfo} */
	public static int clGetProgramInfo(CLProgram program, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetProgramInfo(program.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetProgramBuildInfo ] ---

	/** JNI method for {@link #clGetProgramBuildInfo} */
	public static native int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program              
	 * @param device               
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetProgramBuildInfo(CLProgram program, CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramBuildInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetProgramBuildInfo(program.getPointer(), device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetProgramBuildInfo} */
	public static int clGetProgramBuildInfo(CLProgram program, CLDevice device, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(program).clGetProgramBuildInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetProgramBuildInfo(program.getPointer(), device.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clCreateKernel ] ---

	/** JNI method for {@link #clCreateKernel} */
	public static native long nclCreateKernel(long program, long kernel_name, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program     
	 * @param kernel_name 
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static CLKernel clCreateKernel(CLProgram program, ByteBuffer kernel_name, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(kernel_name);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLKernel.create(nclCreateKernel(program.getPointer(), memAddress(kernel_name), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	/** Alternative version of: {@link #clCreateKernel} */
	public static CLKernel clCreateKernel(CLProgram program, ByteBuffer kernel_name, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLKernel.create(nclCreateKernel(program.getPointer(), memAddress(kernel_name), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	/** CharSequence version of: {@link #clCreateKernel} */
	public static CLKernel clCreateKernel(CLProgram program, CharSequence kernel_name, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(program).clCreateKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLKernel.create(nclCreateKernel(program.getPointer(), memAddress(memEncodeASCII(kernel_name)), memAddressSafe(errcode_ret), __functionAddress), program);
	}

	// --- [ clCreateKernelsInProgram ] ---

	/** JNI method for {@link #clCreateKernelsInProgram} */
	public static native int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param program         
	 * @param num_kernels     
	 * @param kernels         
	 * @param num_kernels_ret 
	 */
	public static int clCreateKernelsInProgram(CLProgram program, int num_kernels, ByteBuffer kernels, ByteBuffer num_kernels_ret) {
		long __functionAddress = getInstance(program).clCreateKernelsInProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( kernels != null ) checkBuffer(kernels, num_kernels << PointerBuffer.getPointerSizeShift());
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1 << 2);
		}
		return nclCreateKernelsInProgram(program.getPointer(), num_kernels, memAddressSafe(kernels), memAddressSafe(num_kernels_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clCreateKernelsInProgram} */
	public static int clCreateKernelsInProgram(CLProgram program, PointerBuffer kernels, IntBuffer num_kernels_ret) {
		long __functionAddress = getInstance(program).clCreateKernelsInProgram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( num_kernels_ret != null ) checkBuffer(num_kernels_ret, 1);
		}
		return nclCreateKernelsInProgram(program.getPointer(), kernels == null ? 0 : kernels.remaining(), memAddressSafe(kernels), memAddressSafe(num_kernels_ret), __functionAddress);
	}

	// --- [ clRetainKernel ] ---

	/** JNI method for {@link #clRetainKernel} */
	public static native int nclRetainKernel(long kernel, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel 
	 */
	public static int clRetainKernel(CLKernel kernel) {
		long __functionAddress = getInstance(kernel).clRetainKernel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainKernel(kernel.getPointer(), __functionAddress);
	}

	// --- [ clReleaseKernel ] ---

	/** JNI method for {@link #clReleaseKernel} */
	public static native int nclReleaseKernel(long kernel, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel 
	 */
	public static int clReleaseKernel(CLKernel kernel) {
		long __functionAddress = getInstance(kernel).clReleaseKernel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseKernel(kernel.getPointer(), __functionAddress);
	}

	// --- [ clSetKernelArg ] ---

	/** JNI method for {@link #clSetKernelArg} */
	public static native int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel    
	 * @param arg_index 
	 * @param arg_size  
	 * @param arg_value 
	 */
	public static int clSetKernelArg(CLKernel kernel, int arg_index, long arg_size, ByteBuffer arg_value) {
		long __functionAddress = getInstance(kernel).clSetKernelArg;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(arg_value, arg_size);
		}
		return nclSetKernelArg(kernel.getPointer(), arg_index, arg_size, memAddress(arg_value), __functionAddress);
	}

	/** Alternative version of: {@link #clSetKernelArg} */
	public static int clSetKernelArg(CLKernel kernel, int arg_index, ByteBuffer arg_value) {
		long __functionAddress = getInstance(kernel).clSetKernelArg;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetKernelArg(kernel.getPointer(), arg_index, arg_value.remaining(), memAddress(arg_value), __functionAddress);
	}

	// --- [ clGetKernelInfo ] ---

	/** JNI method for {@link #clGetKernelInfo} */
	public static native int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel               
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetKernelInfo(CLKernel kernel, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetKernelInfo(kernel.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetKernelInfo} */
	public static int clGetKernelInfo(CLKernel kernel, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetKernelInfo(kernel.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clGetKernelWorkGroupInfo ] ---

	/** JNI method for {@link #clGetKernelWorkGroupInfo} */
	public static native int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param kernel               
	 * @param device               
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetKernelWorkGroupInfo(CLKernel kernel, CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelWorkGroupInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetKernelWorkGroupInfo(kernel.getPointer(), device.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetKernelWorkGroupInfo} */
	public static int clGetKernelWorkGroupInfo(CLKernel kernel, CLDevice device, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(kernel).clGetKernelWorkGroupInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetKernelWorkGroupInfo(kernel.getPointer(), device.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clEnqueueNDRangeKernel ] ---

	/** JNI method for {@link #clEnqueueNDRangeKernel} */
	public static native int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param kernel                  
	 * @param work_dim                
	 * @param global_work_offset      
	 * @param global_work_size        
	 * @param local_work_size         
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueNDRangeKernel(CLCommandQueue command_queue, CLKernel kernel, int work_dim, ByteBuffer global_work_offset, ByteBuffer global_work_size, ByteBuffer local_work_size, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNDRangeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim << PointerBuffer.getPointerSizeShift());
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim << PointerBuffer.getPointerSizeShift());
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueNDRangeKernel(command_queue.getPointer(), kernel.getPointer(), work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueNDRangeKernel} */
	public static int clEnqueueNDRangeKernel(CLCommandQueue command_queue, CLKernel kernel, int work_dim, PointerBuffer global_work_offset, PointerBuffer global_work_size, PointerBuffer local_work_size, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNDRangeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( global_work_offset != null ) checkBuffer(global_work_offset, work_dim);
			if ( global_work_size != null ) checkBuffer(global_work_size, work_dim);
			if ( local_work_size != null ) checkBuffer(local_work_size, work_dim);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNDRangeKernel(command_queue.getPointer(), kernel.getPointer(), work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueTask ] ---

	/** JNI method for {@link #clEnqueueTask} */
	public static native int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param kernel                  
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueTask(CLCommandQueue command_queue, CLKernel kernel, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueTask;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueTask(command_queue.getPointer(), kernel.getPointer(), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueTask} */
	public static int clEnqueueTask(CLCommandQueue command_queue, CLKernel kernel, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueTask;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueTask(command_queue.getPointer(), kernel.getPointer(), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueNativeKernel ] ---

	/** JNI method for {@link #clEnqueueNativeKernel} */
	public static native int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param user_func               
	 * @param args                    
	 * @param cb_args                 
	 * @param num_mem_objects         
	 * @param mem_list                
	 * @param args_mem_loc            
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueNativeKernel(CLCommandQueue command_queue, long user_func, ByteBuffer args, long cb_args, int num_mem_objects, ByteBuffer mem_list, ByteBuffer args_mem_loc, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNativeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(user_func);
			checkBuffer(args, cb_args);
			if ( mem_list != null ) checkBuffer(mem_list, 1 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueNativeKernel(command_queue.getPointer(), user_func, memAddress(args), cb_args, num_mem_objects, memAddressSafe(mem_list), memAddress(args_mem_loc), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueNativeKernel} */
	public static int clEnqueueNativeKernel(CLCommandQueue command_queue, long user_func, ByteBuffer args, int num_mem_objects, PointerBuffer mem_list, PointerBuffer args_mem_loc, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueNativeKernel;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(user_func);
			if ( mem_list != null ) checkBuffer(mem_list, 1);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueNativeKernel(command_queue.getPointer(), user_func, memAddress(args), args.remaining(), num_mem_objects, memAddressSafe(mem_list), memAddress(args_mem_loc), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clGetEventInfo ] ---

	/** JNI method for {@link #clGetEventInfo} */
	public static native int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param event                
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetEventInfo(CLEvent event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetEventInfo(event.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetEventInfo} */
	public static int clGetEventInfo(CLEvent event, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetEventInfo(event.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clRetainEvent ] ---

	/** JNI method for {@link #clRetainEvent} */
	public static native int nclRetainEvent(long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param event 
	 */
	public static int clRetainEvent(CLEvent event) {
		long __functionAddress = getInstance(event).clRetainEvent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclRetainEvent(event.getPointer(), __functionAddress);
	}

	// --- [ clReleaseEvent ] ---

	/** JNI method for {@link #clReleaseEvent} */
	public static native int nclReleaseEvent(long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param event 
	 */
	public static int clReleaseEvent(CLEvent event) {
		long __functionAddress = getInstance(event).clReleaseEvent;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclReleaseEvent(event.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueMarker ] ---

	/** JNI method for {@link #clEnqueueMarker} */
	public static native int nclEnqueueMarker(long command_queue, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 * @param event         
	 */
	public static int clEnqueueMarker(CLCommandQueue command_queue, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMarker;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueMarker(command_queue.getPointer(), memAddress(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueMarker} */
	public static int clEnqueueMarker(CLCommandQueue command_queue, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueMarker;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event, 1);
		}
		return nclEnqueueMarker(command_queue.getPointer(), memAddress(event), __functionAddress);
	}

	// --- [ clEnqueueBarrier ] ---

	/** JNI method for {@link #clEnqueueBarrier} */
	public static native int nclEnqueueBarrier(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clEnqueueBarrier(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clEnqueueBarrier;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclEnqueueBarrier(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clEnqueueWaitForEvents ] ---

	/** JNI method for {@link #clEnqueueWaitForEvents} */
	public static native int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 * @param num_events    
	 * @param event_list    
	 */
	public static int clEnqueueWaitForEvents(CLCommandQueue command_queue, int num_events, ByteBuffer event_list) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitForEvents;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event_list, num_events << PointerBuffer.getPointerSizeShift());
			checkBuffer(event_list, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWaitForEvents(command_queue.getPointer(), num_events, memAddress(event_list), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWaitForEvents} */
	public static int clEnqueueWaitForEvents(CLCommandQueue command_queue, PointerBuffer event_list) {
		long __functionAddress = getInstance(command_queue).clEnqueueWaitForEvents;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(event_list, 1);
		}
		return nclEnqueueWaitForEvents(command_queue.getPointer(), event_list.remaining(), memAddress(event_list), __functionAddress);
	}

	// --- [ clGetEventProfilingInfo ] ---

	/** JNI method for {@link #clGetEventProfilingInfo} */
	public static native int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param event                
	 * @param param_name           
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetEventProfilingInfo(CLEvent event, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventProfilingInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclGetEventProfilingInfo(event.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetEventProfilingInfo} */
	public static int clGetEventProfilingInfo(CLEvent event, int param_name, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(event).clGetEventProfilingInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetEventProfilingInfo(event.getPointer(), param_name, param_value == null ? 0 : param_value.remaining(), memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clFlush ] ---

	/** JNI method for {@link #clFlush} */
	public static native int nclFlush(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clFlush(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clFlush;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclFlush(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clFinish ] ---

	/** JNI method for {@link #clFinish} */
	public static native int nclFinish(long command_queue, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue 
	 */
	public static int clFinish(CLCommandQueue command_queue) {
		long __functionAddress = getInstance(command_queue).clFinish;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclFinish(command_queue.getPointer(), __functionAddress);
	}

	// --- [ clGetExtensionFunctionAddress ] ---

	/** JNI method for {@link #clGetExtensionFunctionAddress} */
	public static native long nclGetExtensionFunctionAddress(long func_name, long __functionAddress);

	/**
	 * 
	 *
	 * @param func_name 
	 */
	public static long clGetExtensionFunctionAddress(ByteBuffer func_name) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetExtensionFunctionAddress");
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(func_name);
		}
		return nclGetExtensionFunctionAddress(memAddress(func_name), __functionAddress);
	}

	/** CharSequence version of: {@link #clGetExtensionFunctionAddress} */
	public static long clGetExtensionFunctionAddress(CharSequence func_name) {
		long __functionAddress = CL.getFunctionProvider().getFunctionAddress("clGetExtensionFunctionAddress");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclGetExtensionFunctionAddress(memAddress(memEncodeASCII(func_name)), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL10;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenCL10") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.clGetPlatformIDs != 0L &&
			funcs.clGetPlatformInfo != 0L &&
			funcs.clGetDeviceIDs != 0L &&
			funcs.clGetDeviceInfo != 0L &&
			funcs.clCreateContext != 0L &&
			funcs.clCreateContextFromType != 0L &&
			funcs.clRetainContext != 0L &&
			funcs.clReleaseContext != 0L &&
			funcs.clGetContextInfo != 0L &&
			funcs.clCreateCommandQueue != 0L &&
			funcs.clRetainCommandQueue != 0L &&
			funcs.clReleaseCommandQueue != 0L &&
			funcs.clGetCommandQueueInfo != 0L &&
			funcs.clCreateBuffer != 0L &&
			funcs.clEnqueueReadBuffer != 0L &&
			funcs.clEnqueueWriteBuffer != 0L &&
			funcs.clEnqueueCopyBuffer != 0L &&
			funcs.clEnqueueMapBuffer != 0L &&
			funcs.clCreateImage2D != 0L &&
			funcs.clCreateImage3D != 0L &&
			funcs.clGetSupportedImageFormats != 0L &&
			funcs.clEnqueueReadImage != 0L &&
			funcs.clEnqueueWriteImage != 0L &&
			funcs.clEnqueueCopyImage != 0L &&
			funcs.clEnqueueCopyImageToBuffer != 0L &&
			funcs.clEnqueueCopyBufferToImage != 0L &&
			funcs.clEnqueueMapImage != 0L &&
			funcs.clGetImageInfo != 0L &&
			funcs.clRetainMemObject != 0L &&
			funcs.clReleaseMemObject != 0L &&
			funcs.clEnqueueUnmapMemObject != 0L &&
			funcs.clGetMemObjectInfo != 0L &&
			funcs.clCreateSampler != 0L &&
			funcs.clRetainSampler != 0L &&
			funcs.clReleaseSampler != 0L &&
			funcs.clGetSamplerInfo != 0L &&
			funcs.clCreateProgramWithSource != 0L &&
			funcs.clCreateProgramWithBinary != 0L &&
			funcs.clRetainProgram != 0L &&
			funcs.clReleaseProgram != 0L &&
			funcs.clBuildProgram != 0L &&
			funcs.clUnloadCompiler != 0L &&
			funcs.clGetProgramInfo != 0L &&
			funcs.clGetProgramBuildInfo != 0L &&
			funcs.clCreateKernel != 0L &&
			funcs.clCreateKernelsInProgram != 0L &&
			funcs.clRetainKernel != 0L &&
			funcs.clReleaseKernel != 0L &&
			funcs.clSetKernelArg != 0L &&
			funcs.clGetKernelInfo != 0L &&
			funcs.clGetKernelWorkGroupInfo != 0L &&
			funcs.clEnqueueNDRangeKernel != 0L &&
			funcs.clEnqueueTask != 0L &&
			funcs.clEnqueueNativeKernel != 0L &&
			funcs.clGetEventInfo != 0L &&
			funcs.clRetainEvent != 0L &&
			funcs.clReleaseEvent != 0L &&
			funcs.clEnqueueMarker != 0L &&
			funcs.clEnqueueBarrier != 0L &&
			funcs.clEnqueueWaitForEvents != 0L &&
			funcs.clGetEventProfilingInfo != 0L &&
			funcs.clFlush != 0L &&
			funcs.clFinish != 0L &&
			funcs.clGetExtensionFunctionAddress != 0L;

		return CL.checkExtension("OpenCL10", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL10}. */
	public static final class Functions implements FunctionMap {

		public final long
			clGetPlatformIDs,
			clGetPlatformInfo,
			clGetDeviceIDs,
			clGetDeviceInfo,
			clCreateContext,
			clCreateContextFromType,
			clRetainContext,
			clReleaseContext,
			clGetContextInfo,
			clCreateCommandQueue,
			clRetainCommandQueue,
			clReleaseCommandQueue,
			clGetCommandQueueInfo,
			clCreateBuffer,
			clEnqueueReadBuffer,
			clEnqueueWriteBuffer,
			clEnqueueCopyBuffer,
			clEnqueueMapBuffer,
			clCreateImage2D,
			clCreateImage3D,
			clGetSupportedImageFormats,
			clEnqueueReadImage,
			clEnqueueWriteImage,
			clEnqueueCopyImage,
			clEnqueueCopyImageToBuffer,
			clEnqueueCopyBufferToImage,
			clEnqueueMapImage,
			clGetImageInfo,
			clRetainMemObject,
			clReleaseMemObject,
			clEnqueueUnmapMemObject,
			clGetMemObjectInfo,
			clCreateSampler,
			clRetainSampler,
			clReleaseSampler,
			clGetSamplerInfo,
			clCreateProgramWithSource,
			clCreateProgramWithBinary,
			clRetainProgram,
			clReleaseProgram,
			clBuildProgram,
			clUnloadCompiler,
			clGetProgramInfo,
			clGetProgramBuildInfo,
			clCreateKernel,
			clCreateKernelsInProgram,
			clRetainKernel,
			clReleaseKernel,
			clSetKernelArg,
			clGetKernelInfo,
			clGetKernelWorkGroupInfo,
			clEnqueueNDRangeKernel,
			clEnqueueTask,
			clEnqueueNativeKernel,
			clGetEventInfo,
			clRetainEvent,
			clReleaseEvent,
			clEnqueueMarker,
			clEnqueueBarrier,
			clEnqueueWaitForEvents,
			clGetEventProfilingInfo,
			clFlush,
			clFinish,
			clGetExtensionFunctionAddress;

		public Functions(FunctionProviderLocal provider) {
			clGetPlatformIDs = provider.getFunctionAddress("clGetPlatformIDs");
			clGetPlatformInfo = provider.getFunctionAddress("clGetPlatformInfo");
			clGetDeviceIDs = provider.getFunctionAddress("clGetDeviceIDs");
			clGetDeviceInfo = provider.getFunctionAddress("clGetDeviceInfo");
			clCreateContext = provider.getFunctionAddress("clCreateContext");
			clCreateContextFromType = provider.getFunctionAddress("clCreateContextFromType");
			clRetainContext = provider.getFunctionAddress("clRetainContext");
			clReleaseContext = provider.getFunctionAddress("clReleaseContext");
			clGetContextInfo = provider.getFunctionAddress("clGetContextInfo");
			clCreateCommandQueue = provider.getFunctionAddress("clCreateCommandQueue");
			clRetainCommandQueue = provider.getFunctionAddress("clRetainCommandQueue");
			clReleaseCommandQueue = provider.getFunctionAddress("clReleaseCommandQueue");
			clGetCommandQueueInfo = provider.getFunctionAddress("clGetCommandQueueInfo");
			clCreateBuffer = provider.getFunctionAddress("clCreateBuffer");
			clEnqueueReadBuffer = provider.getFunctionAddress("clEnqueueReadBuffer");
			clEnqueueWriteBuffer = provider.getFunctionAddress("clEnqueueWriteBuffer");
			clEnqueueCopyBuffer = provider.getFunctionAddress("clEnqueueCopyBuffer");
			clEnqueueMapBuffer = provider.getFunctionAddress("clEnqueueMapBuffer");
			clCreateImage2D = provider.getFunctionAddress("clCreateImage2D");
			clCreateImage3D = provider.getFunctionAddress("clCreateImage3D");
			clGetSupportedImageFormats = provider.getFunctionAddress("clGetSupportedImageFormats");
			clEnqueueReadImage = provider.getFunctionAddress("clEnqueueReadImage");
			clEnqueueWriteImage = provider.getFunctionAddress("clEnqueueWriteImage");
			clEnqueueCopyImage = provider.getFunctionAddress("clEnqueueCopyImage");
			clEnqueueCopyImageToBuffer = provider.getFunctionAddress("clEnqueueCopyImageToBuffer");
			clEnqueueCopyBufferToImage = provider.getFunctionAddress("clEnqueueCopyBufferToImage");
			clEnqueueMapImage = provider.getFunctionAddress("clEnqueueMapImage");
			clGetImageInfo = provider.getFunctionAddress("clGetImageInfo");
			clRetainMemObject = provider.getFunctionAddress("clRetainMemObject");
			clReleaseMemObject = provider.getFunctionAddress("clReleaseMemObject");
			clEnqueueUnmapMemObject = provider.getFunctionAddress("clEnqueueUnmapMemObject");
			clGetMemObjectInfo = provider.getFunctionAddress("clGetMemObjectInfo");
			clCreateSampler = provider.getFunctionAddress("clCreateSampler");
			clRetainSampler = provider.getFunctionAddress("clRetainSampler");
			clReleaseSampler = provider.getFunctionAddress("clReleaseSampler");
			clGetSamplerInfo = provider.getFunctionAddress("clGetSamplerInfo");
			clCreateProgramWithSource = provider.getFunctionAddress("clCreateProgramWithSource");
			clCreateProgramWithBinary = provider.getFunctionAddress("clCreateProgramWithBinary");
			clRetainProgram = provider.getFunctionAddress("clRetainProgram");
			clReleaseProgram = provider.getFunctionAddress("clReleaseProgram");
			clBuildProgram = provider.getFunctionAddress("clBuildProgram");
			clUnloadCompiler = provider.getFunctionAddress("clUnloadCompiler");
			clGetProgramInfo = provider.getFunctionAddress("clGetProgramInfo");
			clGetProgramBuildInfo = provider.getFunctionAddress("clGetProgramBuildInfo");
			clCreateKernel = provider.getFunctionAddress("clCreateKernel");
			clCreateKernelsInProgram = provider.getFunctionAddress("clCreateKernelsInProgram");
			clRetainKernel = provider.getFunctionAddress("clRetainKernel");
			clReleaseKernel = provider.getFunctionAddress("clReleaseKernel");
			clSetKernelArg = provider.getFunctionAddress("clSetKernelArg");
			clGetKernelInfo = provider.getFunctionAddress("clGetKernelInfo");
			clGetKernelWorkGroupInfo = provider.getFunctionAddress("clGetKernelWorkGroupInfo");
			clEnqueueNDRangeKernel = provider.getFunctionAddress("clEnqueueNDRangeKernel");
			clEnqueueTask = provider.getFunctionAddress("clEnqueueTask");
			clEnqueueNativeKernel = provider.getFunctionAddress("clEnqueueNativeKernel");
			clGetEventInfo = provider.getFunctionAddress("clGetEventInfo");
			clRetainEvent = provider.getFunctionAddress("clRetainEvent");
			clReleaseEvent = provider.getFunctionAddress("clReleaseEvent");
			clEnqueueMarker = provider.getFunctionAddress("clEnqueueMarker");
			clEnqueueBarrier = provider.getFunctionAddress("clEnqueueBarrier");
			clEnqueueWaitForEvents = provider.getFunctionAddress("clEnqueueWaitForEvents");
			clGetEventProfilingInfo = provider.getFunctionAddress("clGetEventProfilingInfo");
			clFlush = provider.getFunctionAddress("clFlush");
			clFinish = provider.getFunctionAddress("clFinish");
			clGetExtensionFunctionAddress = provider.getFunctionAddress("clGetExtensionFunctionAddress");
		}

	}

}